package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		System.out.println((k * n) - m > 0 ? (k * n) - m : 0); 
	}
}



