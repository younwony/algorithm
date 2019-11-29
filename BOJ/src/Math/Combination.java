/**
 * @작성자 wony
 * @작성일 2019. 11. 29.
 * @사용처
 *
 */
package Math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 29.
 * @사용처 조합(Combination)
 * 
 */
public class Combination {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 29.
	 * @사용처 nCr = n-1Cr-1 + n-1Cr
	 * nCr = 특정원소를 포함하고 뽑는 경우 + 특정원소를 제외하고 뽑는 경우
	 * @Todo
	 * @param args
	 * 
	 */
	static int[] arr = new int[]{1,2,3,4};
	static List<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] result = new int[2];
		doCombination(arr.length,result,2);
		
	}
	
	public static void doCombination(int n , int[] result, int r){
		
		if(r == 0){
			print(result);
		}else if(n == r){
			for(int i = 0;  i < r; i++)
				result[result.length - i] = arr[arr.length - i];
		}
		
		result[result.length - r] = arr[arr.length - n];
		doCombination(n-1,result, r);
		doCombination(n-1,result, r-1);
	}
	
	public static void print(int[] result){
		String str = "";
		for(int i = 0 ; i < result.length; i++)
			str += result[i];
		
		System.out.println(str);
	}
	
	public static void printeq(int n , int result, int r){
		
	}
}
