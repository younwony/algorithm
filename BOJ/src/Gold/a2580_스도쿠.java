/**
 * @작성자 wony
 * @작성일 2019. 12. 31.
 * @사용처
 *
 */
package Gold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 12. 31.
 * @사용처
 * 
 */
public class a2580_스도쿠 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 31.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	static Map<int[][], ArrayList<Integer>> map = new HashMap<int[][], ArrayList<Integer>>(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[][] sudokuFiled = new int[9][9];
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				sudokuFiled[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 31.
	 * @사용처
	 * @Todo
	 * 
	 */
	public static void XYLineCheck(){
		
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 31.
	 * @사용처
	 * @Todo
	 * 
	 */
	public static void NineFiled(){
		
	}

}
