/**
 * @작성자 wony
 * @작성일 2020. 3. 13.
 * @사용처
 *
 */
package Silver.Level_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2020. 3. 13.
 * @사용처
 * 
 */
public class a2805_나무자르기 {

	/**
	 * @작성자 wony
	 * @작성일 2020. 3. 13.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[] treeHightArray = new int[n];
		
		for(int i = 0; i < n; i++){
			treeHightArray[i] = scanner.nextInt();
		}
		
		Arrays.sort(treeHightArray);
		
		long sum;
		int result = 0;
		
		for(int i = treeHightArray[n-1]; i >= 0; i--){
			sum = 0;
			for(int j = n-1; j >= 0; j--){
				if(treeHightArray[j] <= i){	break;}
				
				sum += treeHightArray[j] - i;
			}
			
			if(sum >= m){
				result = i;
				break;
			}
		}
		
		scanner.close();
		
		System.out.println(result);
	}

}
