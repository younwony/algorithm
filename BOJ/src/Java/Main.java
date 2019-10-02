package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	/**
	 * @사용처 제출용 Class
	 * @Todo 
	 * @param args
	 * TODO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n,x;
		n = scanner.nextInt();
		x = scanner.nextInt();
		
		int[] inputData = new int[n];
		
		for(int i = 0; i < inputData.length; i++)
			inputData[i] = scanner.nextInt();
		
		for(int j : inputData){
			if(j < x)
				System.out.print(j + " ");
		}
	}
}
