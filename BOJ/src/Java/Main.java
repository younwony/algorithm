package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			int testCase = Integer.valueOf(bufferedReader.readLine());
			
			String[] inputData = new String[2];
			int max,testCount;
			String maxIndex = "";
			
			StringBuilder result = new StringBuilder();
			for(int i = 0 ; i < testCase; i++){
				max = 0;
				testCount = Integer.valueOf(bufferedReader.readLine());
				for(int j = 0; j < testCount; j++){
					inputData = bufferedReader.readLine().split(" ");
					
					if(Integer.valueOf(inputData[1]) > max){
						max = Integer.valueOf(inputData[1]);
						maxIndex = inputData[0];
					}
				}
				result.append(maxIndex + "\n");
			}
			bufferedWriter.write(result.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			try {
				if(bufferedReader != null){bufferedReader.close();}
				if(bufferedWriter != null){bufferedWriter.flush(); bufferedWriter.close();}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}