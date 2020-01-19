package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String n = Integer.toBinaryString(scanner.nextInt());
		scanner.close();
		int count = 0;
		for(int i = 0; i< n.length(); i++) {
			if(n.charAt(i) == '1') {count++;}
		}
		System.out.println(count);
	}
}



