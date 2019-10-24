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
