/**
 * @작성자 wony
 * @작성일 2019. 12. 16.
 * @사용처
 *
 */
package Bronze;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 12. 16.
 * @사용처
 * 
 */
public class a5522_카드게임 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 16.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 0; i < 5; i++)
			sum += scanner.nextInt();
		scanner.close();
		
		System.out.println(sum);
	}

}
