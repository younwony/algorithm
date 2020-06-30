package BOJ.src.Silver.Level_4;

import java.util.Scanner;

public class a14501_퇴사 {
    /**
     * DP 사용
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] field = new int[21];
        int a,b;

        for(int i = 0 ; i < n; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            if(field[i] + b > field[i+a]){
                field[i + a] = field[i] + b;
            }

            if(field[i] > field[i+1]){
                field[i+1] = field[i];
            }
        }
        System.out.println(field[n]);
    }
}
