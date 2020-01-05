package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCase = scanner.nextInt();

		for(int i = 0 ; i < testCase; i++) {
			BackTracking(scanner.nextInt());
			System.out.println(count);
			count=0;
		}
		scanner.close();
	}
	
	
	public static void BackTracking(int n) {
		if(n == 0) {
			count++;
		}else if(n > 0){
			BackTracking(n-1);
			BackTracking(n-2);
			BackTracking(n-3);
		}
	}
}
