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
		
		long[] memFivo = new long[91];
		memFivo[0] = 0;
		memFivo[1] = 1;
		for(int i = 2; i <= n; i++) {
			memFivo[i] = memFivo[i-1] + memFivo[i-2]; 
		}
		
		System.out.println(memFivo[n]);
	}
}
