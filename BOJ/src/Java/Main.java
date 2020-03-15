package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		int[] countArray = new int[2];
		
		for(int i = 0 ; i < testCount; i++) {
			countArray[scanner.nextInt()]++;
		}
		
		if(countArray[0] > countArray[1]) {
			System.out.println("Junhee is not cute!");
		}else {
			System.out.println("Junhee is cute!");
			
		}
	}
}