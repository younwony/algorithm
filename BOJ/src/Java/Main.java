package Java;

import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @사용처 제출용 Class
	 * @Todo 
	 * @param args
	 * TODO
	 */

	static int count = 0;
	static int stopR = 0;
	static int stopC = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		stopR = scanner.nextInt();
		stopC = scanner.nextInt();
		
		
		zCount((int)Math.pow(2,testCount), 0, 0);
	}
	
	public static void zCount(int testCountSquared, int r, int c) {

		if(r == stopR && c == stopC){
			System.out.println(count);
			System.exit(0);
		}
		
		
		if(!(r <= stopR && stopR < r + testCountSquared && c <= stopC && stopC < c + testCountSquared)){
			count += testCountSquared*testCountSquared;
			return;
		}
		
		if(testCountSquared == 1){
			count++;
			return ;
		}
		
		zCount(testCountSquared/2, r, c);
		zCount(testCountSquared/2, r, c + testCountSquared/2);
		zCount(testCountSquared/2, r + testCountSquared/2, c);
		zCount(testCountSquared/2, r + testCountSquared/2, c + testCountSquared/2);
		
	}
}
