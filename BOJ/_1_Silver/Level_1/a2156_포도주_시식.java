package _1_Silver.Level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2156_포도주_시식 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] grapes = new int[n];
        int[] dp = new int[n];
        for(int i = 0 ; i < n; i++){
            grapes[i] = Integer.parseInt(bufferedReader.readLine());
        }

        if(n > 0){
            dp[0] = grapes[0];
        }
        if(n > 1){
            dp[1] = grapes[0] + grapes[1];
        }
        if(n > 2) {
            dp[2] = Math.max(dp[1], Math.max(dp[0] + grapes[2], grapes[1] + grapes[2]));
            for(int i = 3; i < dp.length; i++){
                dp[i] = Math.max(dp[i-3] + grapes[i-1] + grapes[i], Math.max(dp[i-2] + grapes[i], dp[i-1]));
            }
        }
        System.out.println(dp[n-1]);
    }
}
