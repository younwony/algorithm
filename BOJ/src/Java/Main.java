package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int zeroCount;
		for(int i = 0; i < 3; i++){
			zeroCount = 0;
			for(int j = 0; j < 4; j++){
				if(scanner.nextInt() == 0){zeroCount++;}
			}
			switch (zeroCount) {
			case 0:System.out.println("E");
				break;
			case 1:System.out.println("A");
			break;
			case 2:System.out.println("B");
			break;
			case 3:System.out.println("C");
			break;
			case 4:System.out.println("D");
			break;
			}
		}
		scanner.close();
	}
}



