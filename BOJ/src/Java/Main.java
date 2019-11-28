package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] testCase = scanner.nextLine().split("");
		int[] countCase = new int[26];
		
		for(int i = 0; i < countCase.length; i++)
		
		for(String data : testCase)
			countCase[(int)data.charAt(0) > 90 ? (int)data.charAt(0) % 97 : (int)data.charAt(0) % 65]++;
		
		boolean equalsCK = false;
		int maxCount = -1;
		int maxIndex = -1;
		for(int i = 0; i < countCase.length; i++){
			if(maxCount == countCase[i]){
				equalsCK = true;
			}else if(maxCount < countCase[i]){
				equalsCK = false;
				maxCount = countCase[i];
				maxIndex = i;
			}
		}
		
		scanner.close();
		
		if(equalsCK) System.out.println("?");
		else System.out.println((char)(maxIndex+65));
	}
}
