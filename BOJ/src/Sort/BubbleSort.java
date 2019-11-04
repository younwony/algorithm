/**
 * @작성자 wony
 * @작성일 2019. 11. 2.
 * @사용처
 * @Todo
 */

package Sort;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 2.
 * @사용처 버블 정렬
 * @Todo
 */

public class BubbleSort {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 2.
	 * @사용처
	 * @param args
	 * @Todo
	 * 
	 * 1. 두번째 인덱스 부터 시작한다.
	 * 2. 시작 인덱스의 바로 앞의 아이템과 비교하여 교환한다.
	 * 3. 비교후 인덱스 위치를 늘려가며 바로 직전의 아이템과 비교하며 진행한다.
	 * 
	 * 시간복잡도 - (n-1), (n-2), .... 2, 1 의 개수를 비교한다.
	 * -> (n-1)*(n-2)/2 -> O(n^2)
	 *  
	 * 공간복잡도 - 하나의 배열에서 진행된다.
	 * -> O(n)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] testCaseString = scanner.nextLine().split(" ");
		
		scanner.close();
		
		int[] testCase = new int[testCaseString.length];
		
		for(int i = 0; i < testCaseString.length; i++)
			testCase[i] = Integer.parseInt(testCaseString[i]);
		
		int temp;
		for(int j = 0; j < testCase.length; j++) {
			for(int i = 1; i < testCase.length-j; i++) {
				if(testCase[i-1] > testCase[i]) {
					temp = testCase[i];
					testCase[i] = testCase[i-1];
					testCase[i-1] = temp;
				}
			}
		}
		
		for(int data : testCase)
			System.out.print(data + " ");
	}

}
