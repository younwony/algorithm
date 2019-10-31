/**
 * @작성자 wony
 * @작성일 2019. 10. 31.
 * @사용처
 *
 */
package Sort;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 10. 31.
 * @사용처 선택 정렬
 * 
 */
public class SelectSort {

	/**
	 * @작성자 wony
	 * @작성일 2019. 10. 31.
	 * @사용처 선택정렬
	 * @Todo
	 * @param args
	 * 
	 * 1. 배열의 맨 앞에서부터 시작한다.
	 * 2. 선택된 값의 다음 값부터 차례로 비교하며 작은 값을 찾아 순서를 바꾸어준다
	 * 
	 * 시간복잡도 - (n-1), (n-2), .... 2, 1 의 개수를 비교한다.
	 * -> (n-1)*(n-2)/2 -> O(n^2)
	 *  
	 * 공간복잡도 - 하나의 배열에서 진행된다.
	 * -> O(n)
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] testCaseString = scanner.nextLine().split(" ");
		
		scanner.close();
		
		long start = System.currentTimeMillis();
		
		int[] testCase = new int[testCaseString.length];
		
		for(int i = 0; i < testCase.length; i++){
			testCase[i] = Integer.parseInt(testCaseString[i]);
		}
		
		int temp;
		
		for(int i = 0; i < testCase.length-1; i++){
			temp = testCase[i];
			for(int j = i+1; j< testCase.length; j++){
				if(testCase[j] < testCase[i]){
					testCase[i] = testCase[j];
					testCase[j] = temp;
				}
			}
		}
		
		long stop = System.currentTimeMillis();
		
		for(int outPutData : testCase)
			System.out.print(outPutData + " ");
		System.out.println();
		System.out.println("Test Time = " + (stop - start)/1000 + " 초");
	}

}
