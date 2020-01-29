package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	static int[] dp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		
		dp(n);
		
		System.out.println(dp[n]);
		scanner.close();
	}
	
	public static void dp(int n) {
		for(int i = 2; i <= n; i++) {
			dp[i] = (dp[i-1] + dp[i-2])%10007;
		}
	}
}




