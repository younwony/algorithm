/**
 * @작성자 wony
 * @작성일 2019. 10. 23.
 * @사용처
 * @Todo
 */

package Java;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 10. 23.
 * @사용처
 * @Todo
 */

public class a1074 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 10. 23.
	 * @사용처 Z (재귀)
	 * @param args
	 * @Todo 
	 * 1. 60라인의 x+i*testcountsquared/2 부분을 i+x*testcountsquared 와 헷갈림
	 * 2. 프랙탈 구조형식의 분할구조 알고리즘 풀이시 각 n,x,y에 나누어주는 수는 반복되는 도형의 각 길이와 같다. 
	 * -> 다음은 2x2배열의 구조이기에 2로나누엇다.
	 * 3. 재귀 도중에 나오기 위해 outCK로 true
	 */

	static int count = 0;
	static int countCK = 0;
	static int stopX,stopY;
	static int stopR,stopC;
	static boolean outCK = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		stopX = scanner.nextInt();
		stopY = scanner.nextInt();
		
		int testCountSquared = 1;
		
		for(int i = 0; i < testCount; i++)
			testCountSquared *= 2;
		zCountCK(testCountSquared, 0, 0);
		
		zCount(testCountSquared, stopX, stopY);
		
	}
	
	public static void zCountCK(int testCountSquared, int x, int y) {
		if(outCK)
			return ;
		
		if(x == stopX && y== stopY){
			System.out.print("a=" + countCK);
			outCK = true;
			return ;
		}
		
		if(testCountSquared == 1) {
			countCK++;
			return ;
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j=0; j< 2; j++) {
				zCountCK(testCountSquared/2, x+i*testCountSquared/2, y+j*testCountSquared/2);
			}
		}
	}
	
	public static void zCount(int testCountSquared, int r, int c) {

		if(testCountSquared == 2){
			System.out.print(" b=");
			System.out.println(count+r*2+c);
			return ;
		}
		if(r < testCountSquared/2 && c < testCountSquared/2){
			zCount(testCountSquared/2, r, c);
		}else if(r < testCountSquared/2 && c >= testCountSquared/2){
			count += (testCountSquared*testCountSquared)/4;
			zCount(testCountSquared/2, r , c - testCountSquared/2);
		}else if(r >= testCountSquared/2 && c < testCountSquared/2){
			count += (testCountSquared*testCountSquared*2)/4;
			zCount(testCountSquared/2, r - testCountSquared/2, c);
		}else if(r >= testCountSquared/2 && c >= testCountSquared/2){
			count += (testCountSquared*testCountSquared*3)/4;
			zCount(testCountSquared/2, r-testCountSquared/2, c-testCountSquared/2);
		}
	}
	
	public static void yCount(int testCountSquared, int r, int c) {

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
		
		yCount(testCountSquared/2, r, c);
		yCount(testCountSquared/2, r, c + testCountSquared/2);
		yCount(testCountSquared/2, r + testCountSquared/2, c);
		yCount(testCountSquared/2, r + testCountSquared/2, c + testCountSquared/2);
		
	}

}
