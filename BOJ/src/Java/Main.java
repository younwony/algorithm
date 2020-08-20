package Java;

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int mod = 1000000000;
		long[][] dp = new long[101][10];
		
		for(int i = 0; i < 9; i++){
			dp[0][i+1] = 1; 
		}
		
		for(int i = 1; i <= n; i++){
			for(int j = 0 ; j < 10; j++){
				if(j == 0){
					dp[i][j] = dp[i-1][j+1]%mod; 
				}else if(j == 9){
					dp[i][j] = dp[i-1][j-1]%mod;
				}else{
					dp[i][j] = (dp[i-1][j+1] + dp[i-1][j-1])%mod;
				}
			}
		}
		
		long sum = 0;
		
		for(int i = 0 ; i  < 10; i++){
			sum += dp[n-1][i]%mod;
		}
		
		System.out.println(sum);
	}
}


