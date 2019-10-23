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
	 */

	static int[][] zCount; 
	static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		int testCountSquared = 1;
		
		for(int i = 0; i < testCount; i++)
			testCountSquared *= 2;
		
		zCount = new int[testCountSquared][testCountSquared];
		
		zCount(testCountSquared, 0, 0);
		
		System.out.println(zCount[scanner.nextInt()][scanner.nextInt()]);
		
	}
	
	public static void zCount(int testCountSquared, int x, int y) {
		
		if(testCountSquared == 1) {
			zCount[x][y] = count++;
			return ;
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j=0; j< 2; j++) {
				zCount(testCountSquared/2, x+i*testCountSquared/2, y+j*testCountSquared/2);
			}
		}
	}

}
