package Java;

import java.io.*;
import java.util.*;

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
		
		int[] result = new int[9];
		int max = 0;
		int maxIndex = 0;
		
		for(int i = 0; i < 9; i ++){
			result[i] = scanner.nextInt();
			if(result[i] > max){
				max = result[i];
				maxIndex = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(maxIndex);
		System.out.println("test");
	}
}
