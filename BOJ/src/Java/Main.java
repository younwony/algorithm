package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] garosu = new int[n];
		
		int[] diffGarosu = new int[n-1];
		
		for(int i = 0; i < n; i++) {
			garosu[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		for(int i = 0; i < n-1; i++) {
			diffGarosu[i] = garosu[i+1] - garosu[i];
		}
		
		int gcd = gcd(diffGarosu[0], diffGarosu[1]);
		
		for(int i = 1; i < n-2; i++) {
			gcd = gcd(gcd, diffGarosu[i+1]);
		}
		
		System.out.println(((garosu[n-1]-garosu[0])/gcd + 1) - n);
	}
	
	public static int gcd(int a, int b) {
		if(a == 0) {
			return b;
		}else {
			return gcd(b%a, a);
		}
	}
}