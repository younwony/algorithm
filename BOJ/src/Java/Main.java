package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		long number = scanner.nextLong();
		
		long result = (long)Math.sqrt(number);
		
		if(result*result != number) {result++;}
		
		System.out.println(result);
	}
}