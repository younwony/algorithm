package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int aBase = scanner.nextInt();
		int bBase = scanner.nextInt();
		
		int testCount = scanner.nextInt();
		
		int aNum = 0;
		
		for(int i = 1; i <= testCount; i++) {
			aNum += Math.pow(aBase, testCount-i)*scanner.nextInt();
		}
		
		int bBaseNumber = 0;
		
		while(aNum > Math.pow(bBase, bBaseNumber)) {
			bBaseNumber++;
		}
		
		int bNumber;
		
		bBaseNumber--;
		while(bBaseNumber >= 0) {
			bNumber = (int) Math.pow(bBase, bBaseNumber);
			System.out.print(aNum/bNumber + " ");
			aNum %= bNumber;
			bBaseNumber--;
		}
		
		scanner.close();
		
	}
}