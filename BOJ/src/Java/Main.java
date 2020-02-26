package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			
			int testCase = scanner.nextInt();
			
			int caseCount;
			int[] scoreArray;
			int[] diffScoreArray;
			for(int i = 0; i < testCase; i++) {
				caseCount = scanner.nextInt();
				scoreArray = new int[caseCount];
				diffScoreArray = new int[caseCount-1];
				for(int j = 0; j < caseCount; j++) {
					scoreArray[j] = scanner.nextInt();
				}
				Arrays.sort(scoreArray);
				for(int j = 0; j < caseCount-1; j++) {
					diffScoreArray[j] = scoreArray[j+1] - scoreArray[j];
				}
				Arrays.sort(diffScoreArray);
				System.out.println("Class " + (i+1));
				System.out.println("Max " + scoreArray[caseCount-1] + ", Min " + scoreArray[0] + ", Largest gap " + diffScoreArray[caseCount-2]);
			}
			
			scanner.close();
		}
}