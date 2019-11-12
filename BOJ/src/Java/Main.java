package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		Integer[] arrayA = new Integer[testCount];
		Integer[] arrayB = new Integer[testCount];
		
		for(int i = 0; i < testCount; i++)
			arrayA[i] = scanner.nextInt();
		
		for(int i = 0; i < testCount; i++)
			arrayB[i] = scanner.nextInt();
		
		Arrays.sort(arrayB);
		Arrays.sort(arrayA, Collections.reverseOrder());
		
		int minSum = 0;
		
		for(int i = 0; i < testCount; i++)
			minSum += arrayB[i]*arrayA[i];
		
		System.out.println(minSum);
	}
}
