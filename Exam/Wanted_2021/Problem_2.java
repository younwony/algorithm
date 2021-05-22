package Wanted_2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem_2 {

    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        String[][] field = new String[N][N];

        for (int i = 0; i < N; i++) {
            field[i] = bufferedReader.readLine().split("");
        }
        String[] x1y1x2y2 = bufferedReader.readLine().split(" ");
        int x1 = Integer.parseInt(x1y1x2y2[0]);
        int y1 = Integer.parseInt(x1y1x2y2[1]);
        int x2 = Integer.parseInt(x1y1x2y2[2]);
        int y2 = Integer.parseInt(x1y1x2y2[3]);

        int[] xArray = {-1,0,0,1};
        int[] yArray = {0,-1,1,0};

        boolean[][][][] visited = new boolean[N][N][N][N];
        Queue<Unit> queue = new LinkedList<>();
        queue.add(new Unit(x1,y1,x2,y2,0,false,false));
        int min = Integer.MAX_VALUE;
        visited[x1][y1][x2][y2] = true;

        while(!queue.isEmpty()){
            Unit unit = queue.poll();
            if(unit.isUnit1 && unit.isUnit2){
                min = unit.time;
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nextX1 = unit.x1 + xArray[i];
                int nextY1 = unit.y1 + yArray[i];
                int nextX2 = unit.x2 + xArray[i];
                int nextY2 = unit.y2 + yArray[i];

                boolean field1 = isField(nextX1, nextY1);
                boolean field2 = isField(nextX2, nextY2);
                if(!field1 && !field2){
                    continue;
                }

                boolean isUnit1 = unit.isUnit1;
                boolean isUnit2 = unit.isUnit2;
                /* 이동할 칸이 X 이거나 이미 도달한 경우 기존 값 삽입 D 일경우 isUnit1 체인지 */
                if(field1){
                    if("X".equals(field[nextX1][nextY1]) || isUnit1){
                        nextX1 = unit.x1;
                        nextY1 = unit.y1;
                    }
                    if(!isUnit1){
                        isUnit1 = "D".equals(field[nextX1][nextY1]);
                    }
                }
                if(field2){
                    if("X".equals(field[nextX2][nextY2]) || isUnit2){
                        nextX2 = unit.x2;
                        nextY2 = unit.y2;
                    }
                    if(!isUnit2){
                        isUnit2 = "D".equals(field[nextX2][nextY2]);
                    }
                }

                /* 필드 아닐 경우 */
                if(!field1){
                    nextX1 = unit.x1;
                    nextY1 = unit.y1;
                }
                if(!field2){
                    nextX2 = unit.x2;
                    nextY2 = unit.y2;
                }

                /* 방문체크 */
                if(!visited[nextX1][nextY1][nextX2][nextY2]){
                    visited[nextX1][nextY1][nextX2][nextY2] = true;
                    queue.add(new Unit(nextX1,nextY1,nextX2,nextY2,unit.time+1,isUnit1,isUnit2));
                }
            }
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    /* 필드 체크 */
    private static boolean isField(int nextX1, int nextY1) {
        return nextX1 >= 0 && nextY1 >= 0 && nextX1 < N && nextY1 < N;
    }

    static class Unit{
        int x1;
        int y1;
        int x2;
        int y2;
        int time;
        boolean isUnit1; // D와 만나면 true
        boolean isUnit2;

        public Unit(int x1, int y1, int x2, int y2, int time, boolean isUnit1, boolean isUnit2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.time = time;
            this.isUnit1 = isUnit1;
            this.isUnit2 = isUnit2;
        }
    }
}
