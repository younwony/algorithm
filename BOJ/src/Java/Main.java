package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		scanner.close();
		
		int mod = 10;
		
		int modNum;
		while(number/mod > 0) {
			modNum = number%mod;
			if(modNum >= mod/2) {
				number += mod;
			}
			number -= modNum;
			mod *= 10;
		}
		
		System.out.println(number);
		
	}
}