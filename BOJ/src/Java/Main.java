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
			GCDandLCM(scanner.nextInt(), scanner.nextInt());
		}
		scanner.close();
	}
	
	public static void GCDandLCM(int a, int b) {
		int gcd = GCD(a, b);
		int lcm = (a * b) / gcd;
		System.out.println(lcm + " " + gcd);
	}
	
	public static int GCD(int a, int b) {
		return a == 0 ? b : GCD(b%a, a);
	}
}




