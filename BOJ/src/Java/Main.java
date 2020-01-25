package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		long s = scanner.nextLong();
		
		scanner.close();
		long sum = 1;
		long count = 1;
		while(sum <= s) {
			sum += ++count;
		}
		count--;
		System.out.println(count);
	}
}




