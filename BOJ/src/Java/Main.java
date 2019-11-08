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
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer stringTokenizer = null;
		try {
			int inputCount = Integer.parseInt(bufferedReader.readLine());
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			int[] inputArray = new int[inputCount];
			int[] inputSaveArray = new int[inputCount];
			int i = 0; 
			while(stringTokenizer.hasMoreTokens()){
				inputArray[i] = Integer.parseInt(stringTokenizer.nextToken());
				inputSaveArray[i] = inputArray[i];
				i++;
			}
			
			mergeSort(inputSaveArray, inputArray, 0, inputSaveArray.length-1);
			
			int outputCount = Integer.parseInt(bufferedReader.readLine());
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			
			while(stringTokenizer.hasMoreTokens()){
				bufferedWriter.write(binarySearch(inputSaveArray, Integer.parseInt(stringTokenizer.nextToken())) + "\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				if(bufferedReader != null) bufferedReader.close();
				if(bufferedWriter != null) bufferedWriter.flush(); bufferedWriter.close();
				if(stringTokenizer != null) stringTokenizer = null; 
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
	
	public static int binarySearch(int[] array, int data){
		int left = 0;
		int right = array.length -1;
		int middle = (left + right)/2;
		
		int result = 0;
		
		while(right >= left){
			if(array[middle] == data){
				result = 1;
				break;
			}else if(array[middle] < data){
				left = middle +1;
				middle = (left + right)/2;
			}else{
				right = middle-1;
				middle = (left + right)/2;
			}
		}
		
		return result;
	}
}
