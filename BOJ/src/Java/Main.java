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
		int n,m;
		String[] nInput,mOutput;
		
		try {
			n = Integer.parseInt(bufferedReader.readLine());
			nInput = bufferedReader.readLine().split(" ");
			m = Integer.parseInt(bufferedReader.readLine());
			mOutput = bufferedReader.readLine().split(" ");
			
			Arrays.sort(nInput);
			
			
			int[] in = new int[n];
			int[] out = new int[m];
			
			for(int i = 0; i< n; i++)
				in[i] = Integer.parseInt(nInput[i]);
			
			for(int i = 0; i< m; i++)
				out[i] = Integer.parseInt(mOutput[i]);
			
			for(int data : out){
				BinarySearch(in, data, 0, n-1);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(bufferedReader != null) bufferedReader.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public static void BinarySearch(int[] array, int data, int left, int right){
		
		int middle;
		
		while(right >= left){
			middle = (left+right)/2;
			if(data == array[middle]){
				System.out.println(1);
				return;
			}
			else if(data > array[middle])
				left = middle + 1;
			else
				right = middle -1;
		}
		
		System.out.println(0);
	}
}
