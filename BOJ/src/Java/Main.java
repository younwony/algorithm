package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		long[] inputDataAraay = new long[n];
		
		long nSum = 0;
		for(int i = 0 ; i < n; i++){
			inputDataAraay[i] = scanner.nextInt();
			nSum += inputDataAraay[i];
		}
		
		Arrays.sort(inputDataAraay);
		long Sum = 0;
		
		for(int i = inputDataAraay.length-1; i > 0; i--){
			Sum += inputDataAraay[i]*(nSum-inputDataAraay[i]);
			nSum -= inputDataAraay[i];
		}
		System.out.println(Sum);
		
		scanner.close();
	}
}