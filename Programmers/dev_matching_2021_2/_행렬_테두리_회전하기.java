package dev_matching_2021_2;

/**
 *  6	6	[[2,2,5,4],[3,3,6,6],[5,1,6,3]]	[8, 10, 25]
 *  3	3	[[1,1,2,2],[1,2,2,3],[2,1,3,2],[2,2,3,3]]	[1, 1, 5, 3]
 * 100	97	[[1,1,100,97]]	[1]
 *
 */
public class _행렬_테두리_회전하기 {


    public static void main(String[] args) {
        int[] solution = solution(6, 6, new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}});

        for (int i : solution) {
            System.out.println(i);
        }

    }

    private static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        int[][] field = new int[rows][columns];
        int number = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                field[i][j] = number++;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            answer[i] = rotate(field, queries[i]);
        }

        return answer;
    }

    private static int rotate(int[][] field, int[] query){
        int x1 = query[0]-1;
        int y1 = query[1]-1;
        int x2 = query[2]-1;
        int y2 = query[3]-1;
        int min = field[x1][y1];
        int tmp = field[x1][y1];

        for(int i = x1; i < x2; i++){
            field[i][y1] = field[i + 1][y1];
            min = Math.min(min, field[i][y1]);
        }

        for(int i = y1; i < y2; i++){
            field[x2][i] = field[x2][i + 1];
            min = Math.min(min, field[x2][i]);
        }

        for(int i = x2; i > x1; i--){
            field[i][y2] = field[i - 1][y2];
            min = Math.min(min, field[i][y2]);
        }

        int tmp2 = field[x1][y1];
        field[x1][y1] = tmp;

        for(int i = y2; i > y1; i--){
            field[x1][i] = field[x1][i - 1];
            min = Math.min(min, field[x1][i]);
        }

        field[x1][y1] = tmp2;

        return min;
    }
}
