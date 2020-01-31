package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int n;
		for(int i = 0; i < 10; i++){
			n = scanner.nextInt();
			if((int)Math.abs(sum-100) >= (int)Math.abs(sum+n-100)){
				sum+=n;
			}else{
				break;
			}
		}
		scanner.close();
		
		System.out.println(sum);
	}
}