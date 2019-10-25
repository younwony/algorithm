package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * @작성자 wony
 * @작성일 2019. 10. 24.
 * @사용처
 * @Todo
 */

public class Main {

	/**
	 * @작성자 wony
	 * @작성일 2019. 10. 24.
	 * @사용처
	 * @param args 
	 * @Todo
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int hanoiCount = scanner.nextInt();
		
		BigInteger hanoiReslutCount = new BigInteger("2");
		System.out.println(hanoiReslutCount.pow(hanoiCount).subtract(BigInteger.ONE));
		if(hanoiCount <= 20){
			hanoi(hanoiCount, 1, 2, 3);
		}
	}

	public static void hanoi(int n, int start, int middle, int end) {

		if(n==1) {
			System.out.println(start + " " + end);
		}else {
			hanoi(n-1, start, end, middle); // n-1 개를 middle로 옮긴다.
			System.out.println(start + " " + end); // 맨 밑의 판을 종료지점으로 옮긴다.
			hanoi(n-1, middle, start, end);// middle의 n-1개의 탑을 종료지점으로 옮긴다.
		}
		

	}

}
