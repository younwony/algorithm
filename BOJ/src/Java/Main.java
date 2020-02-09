package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char[] str = scanner.next().toCharArray();
		
		scanner.close();
		
		int sum = 0;
		
		boolean isZero = false;
		
		
		int num;
		for(int i = 0; i < str.length; i++) {
			num = str[i] - '0';
			
			if(num == 0) {
				isZero = true;
			}
			
			sum += num;
		}
		
		Arrays.sort(str);
		
		StringBuilder builder = new StringBuilder(new String(str));
		
		if(!isZero || sum % 3 != 0) {
			System.out.println(-1);
		}else {
			System.out.println(builder.reverse().toString());
		}
		
	}
}