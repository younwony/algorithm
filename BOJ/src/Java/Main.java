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
		int n,m;
		String[] nInput,mOutput;
		long[] resultData;
		
		try {
			n = Integer.parseInt(bufferedReader.readLine());
			nInput = bufferedReader.readLine().split(" ");
			m = Integer.parseInt(bufferedReader.readLine());
			mOutput = bufferedReader.readLine().split(" ");
			
			resultData = new long[Integer.SIZE+1];
			
			for(int i = 0; i < resultData.length; i++)
				resultData[i] = 0;
			
			
			for(int i = 0; i < n; i++) 
				resultData[Integer.parseInt(nInput[i])-1] = 1;
			
			for(int i = 0; i < n; i++) 
				bufferedWriter.write(resultData[Integer.parseInt(mOutput[i])-1] + "\n");
			
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
}
