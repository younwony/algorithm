package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCase = scanner.nextInt();
		int[] inputData = new int[10];
		
		for(int i = 0; i < testCase; i++) {
			for(int j = 0; j < 10; j++) {
				inputData[j] = scanner.nextInt();
			}
			Arrays.sort(inputData);
			System.out.println(inputData[7]);
		}
		scanner.close();
	}
}




