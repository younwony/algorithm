package me.wony.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class solve_3 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-20,-10,10,5,20,-7,-3,5}, new int[][]{{0,1},{0,2},{0,3},{0,4},{2,5},{3,6},{3,7}}));
//        System.out.println(solution2(new int[]{1,-1}, new int[][]{{0,1}}));
//        System.out.println(solution(new int[]{-5,0,2,1,2}, new int[][]{{0,1},{3,4},{2,3},{0,3}}));
//        System.out.println(solution2(new int[]{0,1,0}, new int[][]{{0,1},{1,2}}));
    }

    private static long solution(int[] a, int[][] edges) {

        long answer = 0;

        /* 0 이 안나올경우 바로 -1 리턴 */
        long checkAnswer = 0;
        for (int value : a) {
            checkAnswer += value;
        }
        if(checkAnswer != 0) return -1;

        /* 0이 나올경우 실행 */
        HashMap<Integer, ArrayList<Integer>> nodeMap = new HashMap<>();

        /* 인접 리스트 연결 부여*/
        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            ArrayList<Integer> node1List = nodeMap.getOrDefault(node1, new ArrayList<>());
            node1List.add(node2);
            nodeMap.put(node1, node1List);
            ArrayList<Integer> node2List = nodeMap.getOrDefault(node2, new ArrayList<>());
            node2List.add(node1);
            nodeMap.put(node2, node2List);
        }

        ArrayList<Integer> keyList = new ArrayList<>(nodeMap.keySet());
        Collections.sort(keyList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return nodeMap.get(o1).size() - nodeMap.get(o2).size();
            }
        });

        for (Integer key : keyList) {
            ArrayList<Integer> nodeList = nodeMap.get(key);
            Integer nextNode = nodeList.get(0);
            a[nextNode] += a[key];
            answer += Math.abs(a[key]);
            nodeMap.remove(key);

            ArrayList<Integer> nextList = nodeMap.get(nextNode);
            nextList.remove(nextList.indexOf(key));
            if(nodeMap.size() <= 1) break;
        }

        return answer;
    }

    private static long solution2(int[] a, int[][] edges) {

        long answer = 0;

        /* 0 이 안나올경우 바로 -1 리턴 */
        long checkAnswer = 0;
        for (int value : a) {
            checkAnswer += value;
        }
        if(checkAnswer != 0) return -1;

        /* 0이 나올경우 실행 */
        ArrayList<ArrayList<Integer>> nodeTree = new ArrayList<>();

        /* 인접 리스트 초기화 */
        for (int i = 0; i < a.length; i++) {
             nodeTree.add(new ArrayList<Integer>());
        }

        /* 인접 리스트 연결 부여*/
        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            nodeTree.get(node1).add(node2);
            nodeTree.get(node2).add(node1);
        }

        mainLoop:
        while(true) {
            for (int i = 0; i < nodeTree.size(); i++) {
                /* 현재 노드의 이어진 노드 리스트*/
                ArrayList<Integer> nodeList = nodeTree.get(i);
                /* 현재 노드에 한개이상 이면 패스*/
                if (nodeList.size() > 1) continue;
                int nowNodeValue = a[i];
                /* nodeValue 0 이면 패스*/
                if(nowNodeValue == 0 )continue;

                /*이어진 노드*/
                Integer nextNode = nodeList.get(0);
                /* 이어진 노드 값에 현재 노드값 + or -*/
                a[nextNode] += nowNodeValue;
                /* 결과값 더하기 */
                answer += Math.abs(nowNodeValue);
                a[i] = 0;

                /* 이어진 노드에서 현재 노드 제거 */
                ArrayList<Integer> nextTree = nodeTree.get(nextNode);
                /* 이어진 노드의 개수가 1개 이상일 경우 제거*/
                if(nextTree.size() > 1)
                    nextTree.remove(nextTree.indexOf(i));
            }
            for (ArrayList<Integer> treeList : nodeTree) {
                if(treeList.size() > 1) continue mainLoop;
            }
            break;
        }

        return answer;
    }
}
