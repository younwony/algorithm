/**
 * @작성자 wony
 * @작성일 2019. 12. 13.
 * @사용처
 *
 */
package Bronze.Level_3;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 12. 13.
 * @사용처
 * 
 */
public class a2441_별찍기4 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 13.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		for(int i = 0; i < n; i++){
			for(int k = 0; k < i; k++)
				System.out.print(" ");
			for(int j = i; j < n; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
