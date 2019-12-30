/**
 * @작성자 wony
 * @작성일 2019. 12. 30.
 * @사용처
 *
 */
package Silver;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 12. 30.
 * @사용처
 * 
 */
public class a9663_N_Queen {

	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 30.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	static int count = 0;
	static int n;
	static boolean[][] filed;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		filed = new boolean[n][n];
		scanner.close();
		
	}
	
	public static void NQueen(int index){
		if(index == n){
			count++;
		}else{
			for(int i = index; i < n; i++){
				for(int j = 0; j < n; j++){
					filed[i][j] = true;
				}
				
			}
		}
	}

}
