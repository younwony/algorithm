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
			tempI = i;
			for(int j=1; j<= i; j++){
				if(testCase[i]<testCase[i-j]){
					while(tempI>0){
						if(testCase[tempI]<testCase[tempI-j]){
						temp = testCase[tempI-j];
						testCase[tempI-j] = testCase[tempI];
						testCase[tempI] = temp;
						}
						tempI--;
					}
				}
			}
		}
		
		for(int data : testCase)
			System.out.print(data + " ");
	}

}
