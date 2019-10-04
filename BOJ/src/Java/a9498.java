package Java;

import java.util.Scanner;

public class a9498 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 9. 29.
	 * @사용처 if 성적 비교
	 * @param args
	 * @Todo
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(100 >= a && a >= 90)
			System.out.println("A");
		else if(89 >= a && a >= 80)
			System.out.println("B");
		else if(79 >= a && a >= 70)
			System.out.println("C");
		else if(69 >= a && a >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}

}
