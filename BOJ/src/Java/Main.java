package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * @작성자 wony
 * @작성일 2019. 10. 24.
 * @사용처
 * @Todo
 */

public class Main {

	/**
	 * @작성자 wony
	 * @작성일 2019. 10. 24.
	 * @사용처
	 * @param args 
	 * @Todo
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int inputCount = scanner.nextInt();
		
		int[] inputArray = new int[inputCount];
		
		for(int i = 0; i < inputCount; i++)
			inputArray[i] = scanner.nextInt();
		
		int checkNumCount = scanner.nextInt();
		
		
		Arrays.sort(inputArray);
		
		int left, right, middle;
		
		int data, searchData;
		
		for(int i = 0; i < checkNumCount; i++){
			left = 0;
			right = inputCount - 1 ;
			searchData = 0;
			
			data = scanner.nextInt();
			
			while(right >= left){
				middle = (left + right)/2;
				if(data == inputArray[middle]){
					searchData = 1;
					break;
				}else if(data > inputArray[middle]){
					left = middle + 1;
				}else
					right = middle - 1;
			}
			System.out.println(searchData);
		}
		
		scanner.close();
		
		
	}
}
