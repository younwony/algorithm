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
 * @사용처 삽입 정렬
 * 
 */
public class InsertSort {

	/**
	 * @작성자 wony
	 * @작성일 2019. 10. 31.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 * 1. 배열의 두번째 인덱스 위치에서부터 시작한다.
	 * 2. 시작점을 Key 값으로 가지며 시작점보다 앞의 아이템들을 비교한다.
	 * 3. Key 값보다 작은 값이 나올 때까지 비교아이템과 위치를 비교하며 한칸씩 앞으로 이동한다.
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
		int tempI;
		for(int i =1; i< testCase.length; i++){
			temp = testCase[i];
			tempI = i;
			for(int j=1; j<= i; j++){
				if(temp<testCase[i-j]){
					testCase[i-j+1] = testCase[i-j];
					tempI = i-j;
				}else {
					break;
				}
			}
			testCase[tempI] = temp;
		}
		
		for(int data : testCase)
			System.out.print(data + " ");
	}

}
