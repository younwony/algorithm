package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCase = scanner.nextInt();
		
		boolean[] isEmpty = new boolean[101];
		
		int number;
		
		int count = 0;
		
		for(int i = 0; i< testCase; i++) {
			number = scanner.nextInt();
			if(!isEmpty[number -1]) {
				isEmpty[number -1] = true;
			}else {
				count++;
			}
		}
		System.out.println(count);
	}
}