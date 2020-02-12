package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCase = scanner.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			Combination(scanner.nextInt(), scanner.nextInt());
		}
		
		scanner.close();
	}
	
	public static void Combination(int n, int m) {
		
		long top = 1;
		long bottom = 1;
		for(int i = 0; i < n; i++) {
			top *= m-i;
			bottom *= i+1;
			if(top % bottom == 0) {
				top /= bottom;
				bottom = 1;
			}
		}
		
		System.out.println(top/bottom);
	}
}