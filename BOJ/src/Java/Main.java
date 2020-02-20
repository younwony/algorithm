package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	static long[][] zeroOne = new long[91][2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		zeroOne[1][0] = 1;
		zeroOne[1][1] = 0;
		zeroOne[2][0] = 0;
		zeroOne[2][1] = 1;
		
		dp();
		
		System.out.println(zeroOne[n][0] + zeroOne[n][1]);
		
	}
	
	public static void dp(){
		
		for(int i = 3; i < 91; i++){
			zeroOne[i][0] = zeroOne[i-1][0] + zeroOne[i-2][0];
			zeroOne[i][1] = zeroOne[i-1][1] + zeroOne[i-2][1];
		}
	}
}