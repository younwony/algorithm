/**
 * @작성자 wony
 * @작성일 2019. 11. 4.
 * @사용처
 *
 */
package Java;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @작성자 wony
 * @작성일 2019. 11. 4.
 * @사용처 수찾기
 * 
 */
public class a1920 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 4.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	static int[] Array;
	static int left;
	static int right;
	static int middle;
	static boolean searchCK;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int n,m;
		String[] nInput,mOutput;
		
		try {
			n = Integer.parseInt(bufferedReader.readLine());
			nInput = bufferedReader.readLine().split(" ");
			m = Integer.parseInt(bufferedReader.readLine());
			mOutput = bufferedReader.readLine().split(" ");
			
			Array = new int[n];
			for(int i = 0; i < n; i++){
				Array[i] = Integer.parseInt(nInput[i]);
			}
			
			Arrays.sort(Array);
			
			for(String data : mOutput){
				left = 0;
				right = n-1;
				middle = right/2;
				if(BinarySearch(Integer.parseInt(data)))
					bufferedWriter.write(1 + "\n");
				else
					bufferedWriter.write(0 + "\n");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(bufferedReader != null) bufferedReader.close();
				if(bufferedWriter != null) {
					bufferedWriter.flush(); 
					bufferedReader.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public static boolean BinarySearch(int data){
		
		if(right - left < 0){
			searchCK =  false;
			return searchCK;
		}
		
		middle = (left+right)/2;
		
		if(data == Array[middle])
			searchCK =  true;
		else if(data > Array[middle]){
			left = middle+1;
			BinarySearch(data);
		}
		else if(data < Array[middle]){
			right = middle-1;
			BinarySearch(data);
		}
		
		return searchCK;
	}

}
