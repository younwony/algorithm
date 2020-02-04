package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		
		for(int i = 0; i < testCase; i++){
			GoldBath(scanner.nextLong(),scanner.nextLong());
		}
		
		scanner.close();
	}
	
	public static void GoldBath(long a, long b){
		
		boolean result = false;
		
		long sum = a+b;
		
		if(sum < 4){
			result = true;
		}else if(sum%2 == 0){
			result = false;
		}else {
			result = isDecimal(sum-2);
		}
		
		System.out.println(result ? "YES" : "NO");
		
	}		

	public static boolean isDecimal(long num){
		
		for(long i = 2; i*i < num; i++){
			for(long j = i; j < num; j+= i){
				if(num % i == 0){
					return false;
				}
			}
		}
		
		return true;
	}
}