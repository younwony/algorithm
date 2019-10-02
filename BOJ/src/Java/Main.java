package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
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
				
				int n = scanner.nextInt();
				int result = n;
				int count = 0;
				do{	
					result = (result%10 * 10) + ((result/10 + result%10)%10); 
					count++;
				}while(result != n);
				System.out.println(count);
	}
}
