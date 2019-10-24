/**
 * @작성자 wony
 * @작성일 2019. 10. 24.
 * @사용처
 * @Todo
 */

package Java;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 10. 24.
 * @사용처
 * @Todo
 */

public class a1914 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 10. 24.
	 * @사용처 하노이탑
	 * @param args
	 * @Todo
	 * 1. n-1 개의 탑을 middle에 옮긴다.
	 * 2. 1개의 탑을 종료지점에 옮긴다.
	 * 3. middle에 있는 n-1개의 탑을 end에 옮긴다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int hanoiCount = scanner.nextInt();
		System.out.println((int)Math.pow(2, hanoiCount) - 1);
		hanoi(hanoiCount, 1, 2, 3);
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
