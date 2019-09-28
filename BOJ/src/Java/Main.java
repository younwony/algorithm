package Java;

import java.util.Scanner;

public class Main {

	/**
	 * @사용처 제출용 Class
	 * @Todo
	 * @param args
	 * TODO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a,b = 0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		String[] c = String.valueOf(b).split(""); 
		
		for(int i = c.length-1; i >= 0; i--) {
			System.out.println(a*Integer.parseInt(c[i]));
		}
		
		System.out.println(a*b);
	}
}
