package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	static int testCase;
	static boolean[] virus;
	static boolean[][] inputLink;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		testCase = scanner.nextInt();
		virus = new boolean[testCase+1];
		inputLink = new boolean[testCase+1][testCase+1];
		
		int linkCount = scanner.nextInt();
		
		int a,b;
		
		for(int i = 0; i < linkCount; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			inputLink[a][b] = true;
			inputLink[b][a] = true;
		}
		
		scanner.close();
		
		dfs(1);
		
		int count = -1;
		
		for(boolean check : virus) {
			if(check) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static void dfs(int n) {
		for(int i = 1; i < testCase+1; i++) {
			if(inputLink[n][i] && !virus[i]) {
				virus[i] = true;
				dfs(i);
			}
		}
	}
}