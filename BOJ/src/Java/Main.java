package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int checkNum = scanner.nextInt();
		int count = 0;
		for(int i = 0; i< 5; i++){
			if(checkNum == scanner.nextInt()){count++;}
		}
		scanner.close();
		System.out.println(count);
	}
}



