/**
 * @작성자 wony
 * @작성일 2019. 12. 25.
 * @사용처
 * @Todo
 */

package Silver;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 12. 25.
 * @사용처
 * @Todo
 */

public class a1011_FlyMeToTheAlphaCentauri {

	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 25.
	 * @사용처
	 * @param args
	 * @Todo
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCount = scanner.nextInt();
		int x,y;
		for(int i = 0; i < testCount; i++) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			System.out.println(SpaceMove(y - x));
		}
	}
	
	public static int SpaceMove(int length) {
		if(length <= 2) return length;
		
		int startX = 1;
		int count = 2;
		length -= 2;
		while(length != 0) {
			if(length > startX) { length -= (startX+1); startX++; count++;}
			else if(length == startX) {length -= startX; count++;}
			else { length -= startX-1; startX--; count++;}
		}
		
		return count;
		
	}
}
