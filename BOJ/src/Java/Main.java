package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		int k,n;
		
		for(int i = 0; i < testCount; i++)
			System.out.println(recurI(scanner.nextInt(),scanner.nextInt()));
		
		scanner.close();
	}
	
	public static int recurI(int k, int n) {
		if(k == 0) return n;
		if(n == 1) return 1;
		
		return recurI(k-1, n) + recurI(k, n-1);
	}
	
}
