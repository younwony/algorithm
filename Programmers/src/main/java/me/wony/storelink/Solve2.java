package me.wony.storelink;

public class Solve2 {
    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
    }

    private static int solution(int N) {
        int[] dp = new int[46];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= N; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[N];
    }
}
