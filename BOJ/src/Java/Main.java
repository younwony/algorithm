package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int m;
		while((m = scanner.nextInt()) != 0) {
			if(m%n == 0) {
				System.out.println(m + " is a multiple of " + n + ".");
			}else {
				System.out.println(m + " is NOT a multiple of " + n + ".");
			}
		}
	}
}