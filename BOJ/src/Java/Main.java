package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	static boolean[] visited;
	static int[] resultArray;
	static int[] inputArray;
	static StringBuilder compareData = new StringBuilder();
	static StringBuilder saveData = new StringBuilder(); 
	static StringBuilder resultData = new StringBuilder();
	static boolean checked = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		visited = new boolean[n];
		resultArray = new int[n];
		inputArray = new int[n];
		for(int i = 0; i < n; i++) {
			compareData.append(scanner.nextInt()+" ");
		}
		dfs(n, 0);
		
		if("".equals(resultData.toString())) {
			System.out.println(-1);
		}else {
			System.out.println(resultData.toString());
		}
	}
	
	public static void dfs(int n, int index) {
		if(index == n) {
			
			saveData.setLength(0);
			for(int i = 0; i < resultArray.length; i++) {
				if(checked) {resultData.append(resultArray[i]+" ");}
				else{saveData.append(resultArray[i]+" ");}
			}
			if(checked) {
				if("".equals(resultData.toString())) {
					System.out.println(-1);
				}else {
					System.out.println(resultData.toString());
				}
				System.exit(0);
			}
			if(compareData.toString().equals(saveData.toString())) {
				checked = true;
			}
		}else {
			for(int i = 0; i < n; i++) {
				if(!visited[i]) {
					visited[i] = true;
					resultArray[index] = i + 1;
					dfs(n, index+1);
					visited[i] = false;
				}
			}
		}
	}
}




