package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] nArray = new int[n];
		int[] dp = new int[n];
		for(int i = 0 ; i < n; i++){
			nArray[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int max = 0;
		for(int i = 0 ; i < n; i++){
			dp[i] = 0;
			for(int j = 0; j < i; j++){
				if(nArray[j] < nArray[i] && dp[j] >= dp[i]){
					dp[i] = dp[j];
				}
			}
			dp[i]++;
			
			if(dp[i] > max) max = dp[i];
		}
		
		System.out.println(max);
		
	}
}


