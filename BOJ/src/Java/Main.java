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
	static int stopX;
	static int stopY;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		int testCountSquared = 1;
		
		stopX = scanner.nextInt();
		stopY = scanner.nextInt();
		
		for(int i = 0; i < testCount; i++)
			testCountSquared *= 2;
		
		zCount(testCountSquared, 0, 0);
		
	}
	
	public static void zCount(int testCountSquared, int x, int y) {
		
		if(x == stopX && y == stopY) {
			System.out.println(count);
			testCountSquared = 0;
			return ;
		}
		
		if(testCountSquared == 1) {
			count++;
			return ;
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j=0; j< 2; j++) {
				zCount(testCountSquared/2, x+i*testCountSquared/2, y+j*testCountSquared/2);
			}
		}
	}
}
