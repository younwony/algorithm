package _1_Silver.Level_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class a10472_십자뒤집기 {
    static int[] xArray = {-1,0,0,1};
    static int[] yArray = {0,-1,1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(bufferedReader.readLine());


        for(int i = 0; i < P; i++){
            // . = false , * true
            boolean[][] white = new boolean[3][3];
            boolean[][] field = new boolean[3][3];
            for (int j = 0; j < 3; j++) {
                String[] input = bufferedReader.readLine().split("");
                for (int k = 0; k < input.length; k++) {
                    field[j][k] = "*".equals(input[k]);
                }
            }

            //then
            Queue<Field> queue = new LinkedList<>();
            queue.add(new Field(0,field));
            loop:
            while(!queue.isEmpty()){
                Field nextField = queue.poll();

                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        boolean[][] click = click(nextField, j, k);
                        if(isResult(click,white)){
                            System.out.println(nextField.cnt + 1);
                            break loop;
                        }

                        queue.add(new Field(nextField.cnt+1,click));
                    }
                }
            }

        }
    }

    private static boolean[][] click(Field nextField, int x, int y) {
        boolean[][] result = new boolean[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = nextField.field[i][j];
            }
        }

        result[x][y] = !nextField.field[x][y];
        for(int i = 0 ; i < 4; i++){
            int nextX = x + xArray[i];
            int nextY = y + yArray[i];
            if(isField(nextX,nextY)){
                result[nextX][nextY] = !nextField.field[nextX][nextY];
            }
        }

        return result;
    }

    private static boolean isResult(boolean[][] whiteField, boolean[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(!(field[i][j] == whiteField[i][j])){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isField(int x, int y) {
        return x >= 0 && y >= 0 && x < 3 && y < 3;
    }

    static class Field {
        int cnt;
        boolean[][] field = new boolean[3][3];

        public Field(int cnt, boolean[][] field) {
            this.cnt = cnt;
            setField(this.field,field);
        }

        private void setField(boolean[][] setField, boolean[][] field) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    setField[i][j] = field[i][j];
                }
            }
        }
    }
}
