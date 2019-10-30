/**
 * @작성자 wony
 * @작성일 2019. 10. 26.
 * @사용처
 * @Todo
 */

package Java;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 10. 26.
 * @사용처
 * @Todo
 */

public class a1019 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 10. 26.
	 * @사용처 책페이지
	 * @param args
	 * @Todo
	 */

	static long[] num = new long[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		long bookNum = scanner.nextLong();
		
		scanner.close();
		
		for(int i = 0; i < num.length; i++) {
			num[i] = 0;
		}
		
		bookNum(bookNum);
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
	
	public static void bookNum(long bookNum) {
		
		if(bookNum < 10) {
			num[(int)(bookNum%10)]++;
		}else {
			bookNum(bookNum/10);
			bookNum(bookNum%10);
		}
		bookNum(bookNum-1);
		return ;
		
		
	}

}
