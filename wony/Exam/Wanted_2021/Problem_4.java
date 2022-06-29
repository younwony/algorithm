package Wanted_2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem_4 {
    static boolean[][][] field;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        field = new boolean[N][N][2];
        for (int i = 0; i < M; i++) {
            String[] SE = bufferedReader.readLine().split(" ");
            int start = Integer.parseInt(SE[0]) - 1;
            int end = Integer.parseInt(SE[1]) - 1;

            field[start][end][0] = true;
            field[end][start][1] = true;
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < field.length; i++) {
            visited = new boolean[N][2];
            visited[i][0] = true;
            HashSet<Integer> save = new HashSet<>();
            save.add(i);
            dfs(i, 0,save);
            if(save.size() > max){
                max = save.size();
                index = i+1;
            }
        }
        System.out.println(index + " " +  max);
    }

    private static void dfs(int index, int reverse, HashSet<Integer> save) {

        for(int i = 0; i < field.length; i++){
            if(field[index][i][reverse] && !visited[i][reverse]){
                int nextReverse = reverse == 0 ? 1 : 0;
                save.add(i);
                visited[i][reverse] = true;
                dfs(i,nextReverse,save);
            }
        }
    }
}
