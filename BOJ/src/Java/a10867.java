/**
 * @작성자 wony
 * @작성일 2019. 11. 15.
 * @사용처
 *
 */
package Java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 15.
 * @사용처 중복 제외 정렬
 * 
 */
public class a10867 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 15.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		int data;
		
		for(int i = 0; i< testCount; i++){
			data = scanner.nextInt();
			if(arrayList.indexOf(data) == -1)
				arrayList.add(data);
		}
		
		arrayList.sort(null);
		
		for(int out : arrayList)
			System.out.print(out + " ");
	}

}
