package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[] inputArray = new int[scanner.nextInt()];
		
		for(int i = 0; i < inputArray.length; i++){
			inputArray[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println(dp(inputArray));
	}
	
	public static int dp(int[] inputArray){
		int[] dp = new int[inputArray.length];
		dp[0] = inputArray[0];
		for(int i = 1; i < inputArray.length; i++){
			dp[i] = Math.max(inputArray[i], dp[i-1] + inputArray[i]);
		}
		
		int max = dp[0];
		
		for(int num : dp){
			max = Math.max(num, max);
		}
		
		return max;
		
		
	}
}




