package me.wony.level_2;

import java.util.*;

public class _후보키 {

    public static void main(String[] args) {
        System.out.println(solution(new String[][]{{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}}));
//        System.out.println(solution(new String[][]{{"a","aa"},{"aa","a"},{"a,a"}}));
//        System.out.println(solution(new String[][]{{"ab","ac"},{"ab","ad"},{"an","ae"}}));
    }

    private static int solution(String[][] relation) {
        int answer = 0;

        //given
        ArrayList<String> keyList = new ArrayList<String>();
        for (int i = 0; i < relation[0].length; i++) {
            dfs(keyList, i + "", i + 1, relation[0].length);
        }

        Collections.sort(keyList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        HashSet<String> keySet = new HashSet<>();
        for (String s : keyList) {
            String[] keyArray = s.split("");
            if(isUnique(keyArray,relation)) keySet.add(s);
        }

        ArrayList<String> uniqueKeyList = new ArrayList<>(keySet);
        setAnswerKey(uniqueKeyList);

        for (String key : uniqueKeyList) {
            if("".equals(key)) continue;
            answer++;
        }
        return answer;
    }

    private static void setAnswerKey(ArrayList<String> keySet) {
        for (int i = 0; i < keySet.size(); i++) {
            String key = keySet.get(i);
            if("".equals(key)) continue;
            String[] keySplit = key.split("");
            for(int j = i + 1; j  < keySet.size(); j++){
                if("".equals(key)) continue;
                String[] targetKey = keySet.get(j).split("");
                if(isMinKey(keySplit, targetKey)) break;
                keySet.set(j, "");
            }
        }
    }

    private static boolean isMinKey(String[] keySplit, String[] targetKey) {
        for (String key : keySplit) {
            for (String target : targetKey) {
                if(key.equals(target)) return false;
            }
        }
        return true;
    }

    private static boolean isUnique(String[] keyArray, String[][] relation) {
        Set<String> checkSet = new HashSet<>();
        for(int i =0 ; i < relation.length; i++){
            String key = "";
            for (String s : keyArray) {
                key += relation[i][Integer.valueOf(s)] + ",";
            }
            if(checkSet.contains(key)) return false;
            checkSet.add(key);
        }
        return true;
    }

    private static void dfs(ArrayList<String> keyList, String s, int index, int length) {
        if(index > length) return;
        if(!keyList.contains(s)) keyList.add(s);

        for (int i = index; i < length; i++) {
            dfs(keyList, s + index, i + 1, length);
        }
    }
}
