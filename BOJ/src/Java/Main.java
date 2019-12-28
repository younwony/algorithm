package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	static int[] resultArray;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		resultArray = new int[n];
		scanner.close();
		BackTraking(n,m);
	}
	
	public static void BackTraking(int n , int m) {
		if(m == 0) {
			for(int i = resultArray.length-1; i > 0; i--) {
				if(resultArray[i] != 0) {System.out.print(i + " ");}
			}
			System.out.println();
		}else {
			for(int i = 1; i <= n; i++) {
				resultArray[m] = i;
				BackTraking(n, m-1);
				resultArray[m] = 0;
			}
		}
	}
}
