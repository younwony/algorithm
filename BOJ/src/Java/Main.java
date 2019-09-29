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
		Scanner scanner = new Scanner(System.in);
		
		int[] abc = new int[3];
		int max;
		
		abc[0] = scanner.nextInt();
		abc[1] = scanner.nextInt();
		abc[2] = scanner.nextInt();
		
		max = Math.max(abc[0], Math.max(abc[1], abc[2]));
		
		for(int a = 0; a < abc.length; a++) {
			if(abc[a] == max) {
				abc[a] = -1;
				break;
			}
		}
		
		max = Math.max(abc[0], Math.max(abc[1], abc[2]));
		
		System.out.println(max);
	}
}
