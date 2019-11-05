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
		
		try {
			int testCount = Integer.parseInt(bufferedReader.readLine());
			
			List<Integer> testList = new ArrayList<Integer>();
			for(int i = 0; i < testCount; i++){
				testList.add(Integer.parseInt(bufferedReader.readLine()));
			}
			
			testList.sort(null);
			
			for(int data : testList)
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
}
