package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCount = scanner.nextInt();
		int a, b;
		for(int i = 0; i < testCount; i++){
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.println(a*b/gcd(a, b));
		}
		scanner.close();
	}
	
	public static int gcd(int a, int b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
}



