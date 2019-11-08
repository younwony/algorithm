/**
 * @작성자 wony
 * @작성일 2019. 11. 5.
 * @사용처
 *
 */
package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @작성자 wony
 * @작성일 2019. 11. 5.
 * @사용처 수 정렬하기 2
 * 
 */
public class a2751 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 5.
	 * @사용처 1 <= testCount <= 1,000,000
	 * @Todo
	 * 
	 * Arrays.sort() 사용시 시간초과
	 * List.sort() 사용시 성공
	 * 
	 * Arrays.sort는 퀵
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int testCount = Integer.parseInt(bufferedReader.readLine());
			
			int[] testArray = new int[testCount];
			int[] saveArray = new int[testCount];
			for(int i = 0; i < testCount; i++){
				testArray[i] = Integer.parseInt(bufferedReader.readLine());
				saveArray[i] = testArray[i]; 
			}
			
			mergeSort(saveArray, testArray, 0, testArray.length-1);
			
			for(int data : testArray)
				bufferedWriter.write(data + "\n");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			try {
				if(bufferedReader != null) bufferedReader.close();
				if(bufferedWriter != null) {
					bufferedWriter.flush();
					bufferedWriter.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public static void mergeSort(int[] saveArray, int[] array, int left ,int right){
		if(right <= left)
			return ;
		
		int middle = (right+left)/2;
		
		mergeSort(saveArray, array, left, middle);
		mergeSort(saveArray, array, middle+1, right);
		mergeSortSum(saveArray, array, left, middle, right);
	}
	public static void mergeSortSum(int[] saveArray, int[] array, int left ,int middle, int right){
		
		int i = left;
		int j = middle +1;
		int k = left;
		
		while(i <= middle && j <=right){
			if(saveArray[i] >= saveArray[j]){
				array[k] = saveArray[j];
				j++;
			}else{
				array[k] = saveArray[i];
				i++;
			}
			k++;
		}
		
		while(i <= middle){
			array[k] = saveArray[i];
			k++;
			i++;
		}
		
		while(j <= right){
			array[k] = saveArray[j];
			k++;
			j++;
		}
		
		for(; left<=right; left++){
			saveArray[left] = array[left];
		}
	}

}
