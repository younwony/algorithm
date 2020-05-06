package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		long x = scanner.nextLong();
		long y = scanner.nextLong();
		long z = (y*100)/x;
		if(z == 99){
			System.out.println(-1);
			System.exit(0);
		}
		int left = 0;
		int right = 1000000000;
		int result = 0;
		while(left <= right){
			
			int middle  = (left + right)/2;
			
			int targetZ = (int) ((100 * (x + middle)) / (y + middle));
			
			if (targetZ > z){
				  right = middle - 1;
				  result = middle;
		    }
	        else{left = middle + 1;}
		}
		
		System.out.println(result);
	}
}