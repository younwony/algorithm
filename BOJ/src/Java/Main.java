package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		int[] memN = new int[10001];
		
		memN[0] = 666;
		
		for(int i = 0; i < n; i++) 
			memN[i+1] = SyomNumber(memN[i]);
		
		System.out.println(memN[n-1]);
	}
	
	public static int SyomNumber(int n) {
		
		String startN;
		boolean syomN = true;
		while(syomN) {
			n++;
			startN = String.valueOf(n);
			for(int i = 0; i < startN.length()-2; i++) 
				if(startN.charAt(i) == '6' && startN.charAt(i+1) == '6' && startN.charAt(i+2) == '6') {syomN = false;}
		}
		return n;
	}
	
}
