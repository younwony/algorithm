/**
 * @작성자 wony
 * @작성일 2020. 1. 23.
 * @사용처
 *
 */
package Silver;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2020. 1. 23.
 * @사용처
 * 
 */
public class a8979_올림픽 {

	/**
	 * @작성자 wony
	 * @작성일 2020. 1. 23.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[][] inputData = new int[n][4];
		int order;
		for(int i = 0; i < n; i++){
			order = scanner.nextInt();
			for(int j = 0; j < 3; j++){
				inputData[order][j] = scanner.nextInt();
			}
		}
	}

}

