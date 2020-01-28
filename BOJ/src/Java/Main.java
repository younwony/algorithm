package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		scanner.close();
		double[] numArray = new double[10];
		int inputData;
		for(int i = 0; i<n.length(); i++) {
			inputData = Character.getNumericValue(n.charAt(i));
			if (inputData == 6 || inputData == 9) {
				numArray[6] += 0.5;
			} else {
				numArray[inputData] += 1;
			}

		}
		
		int max = 0;
		for(double num : numArray) {
			max = (int)Math.max(max, Math.round(num));
		}
		
		System.out.println(max);
	}
}




