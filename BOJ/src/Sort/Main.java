/**
 * @작성자 wony
 * @작성일 2019. 11. 4.
 * @사용처
 *
 */
package Sort;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 4.
 * @사용처 Sort Main
 * 
 */
public class Main {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 4.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String[] inputData = scanner.nextLine().split(" ");
		int[] Array = new int[inputData.length];
		for(int i = 0; i < Array.length; i++)
			Array[i] = Integer.parseInt(inputData[i]);
		
		Sort sort = new Sort(Array);
		
		System.out.println(sort.BinarySearch(1));
	}

}
