package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] inputAB = scanner.nextLine().split(" ");
		
		scanner.close();
		
		String A = inputAB[0];
		String B = inputAB[1];
		
		int minusLength = B.length() - A.length();
		
		int count;
		
		int minCount = B.length();
		
		for(int i = 0; i<= minusLength; i++){
			count = 0;
			for(int j = 0; j < A.length(); j++){
				if(B.charAt(i+j) != A.charAt(j)){
					count++;
				}
			}
			
			if(minCount >= count){minCount = count;}
		}
		
		System.out.println(minCount);
	}
}