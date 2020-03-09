package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		int[] nArray = new int[testCount];
		for(int i = 0 ; i < testCount; i++){
			nArray[i] = scanner.nextInt();
		}
		
		Arrays.sort(nArray);
		
		int max = 0;
		
		for(int i = 0 ; i < testCount; i++){
			if(nArray[i]*(testCount-i) >= max){
				max = nArray[i]*(testCount-i);
			}
		}
		
		scanner.close();
		
		System.out.println(max);
	}
}