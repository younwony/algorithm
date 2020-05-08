package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input,output;
		int max = 0;
		int count = 0;
		
		for(int i = 0; i < 4; i++){
			output = scanner.nextInt();
			input = scanner.nextInt();
			count += input-output;
			if(count > max){max = count;}
		}
		System.out.println(max);
	}
}