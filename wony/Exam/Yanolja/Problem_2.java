package Yanolja;

import java.util.ArrayList;
import java.util.TreeSet;

public class Problem_2 {
    public static void main(String[] args) {

        System.out.println(solution(5, new int[]{2,2,1,2}, new int[]{1,3,4,4}));
        System.out.println(solution(3, new int[]{1}, new int[]{3}));
        System.out.println(solution(4, new int[]{1,3}, new int[]{2,4}));
    }

    static int[] nodes;
    static boolean[][] nodeArrays;
    static boolean[] visited;
    static int max;
    public static int solution(int N, int[] A, int[] B) {
        // write your code in Java SE 8

        nodes = new int[N];
        nodeArrays = new boolean[N][N];
        visited = new boolean[N];
        max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            nodeArrays[A[i]-1][B[i]-1] = true;
        }

        dfs(N);

        return max;
    }

    private static void dfs(int n) {
        if(n == 0){
            max = Math.max(max, calculation());
            return;
        }

        for (int i = 0; i < nodes.length; i++) {
            if(!visited[i]){
                visited[i] = true;
                nodes[i] = n;
                dfs(n-1);
                visited[i] = false;
            }
        }
    }

    private static int calculation() {
        int sum = 0;
        for (int i = 0; i < nodeArrays.length; i++) {
            for (int j = 0; j < nodeArrays.length; j++) {
                if(nodeArrays[i][j]){
                    sum += nodes[i] + nodes[j];
                }
            }
        }
        return sum;
    }

}
