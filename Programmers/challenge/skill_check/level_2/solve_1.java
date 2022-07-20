package challenge.skill_check.level_2;

public class solve_1 {

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}}));
    }

    static int[] answer = new int[2];

    public static int[] solution(int[][] arr) {

        sol(arr, 0,0, arr.length);

        return answer;
    }

    private static void sol(int[][] arr, int x, int y, int len) {
        int firstValue = arr[x][y];
        if(len == 1){
            answer[firstValue]++;
            return;
        }

        for(int i = x; i < x + len; i++){
            for(int j = y; j < y + len; j++){
                if(arr[i][j] != firstValue){
                    sol(arr, x, y, len/2);
                    sol(arr, x, y + len/2, len/2);
                    sol(arr, x + len/2, y, len/2);
                    sol(arr, x + len/2, y + len/2, len/2);
                    return;
                }
            }
        }
        answer[firstValue]++;
    }
}
