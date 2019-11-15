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
			int[] memPlusResult = new int[10000001];
			int[] memMinusResult = new int[10000001];
			
			Arrays.fill(memPlusResult, 0);
			Arrays.fill(memMinusResult, 0);
			
			int inputCount = Integer.parseInt(bufferedReader.readLine());
			
			String[] inputArray = bufferedReader.readLine().split(" ");
			
			int outputCount = Integer.parseInt(bufferedReader.readLine());
			
			String[] outputArray = bufferedReader.readLine().split(" ");
			
			
			for(int i = 0; i < inputCount; i++){
				if(Integer.parseInt(inputArray[i]) >= 0) 
					memPlusResult[Integer.parseInt(inputArray[i])]++; 
				else
					memMinusResult[Integer.parseInt(inputArray[i]) * -1]++;
			}
			
			for(String data : outputArray){
				if(Integer.parseInt(data) >= 0)
					bufferedWriter.write(String.valueOf(memPlusResult[Integer.parseInt(data)]));
				else
					bufferedWriter.write(String.valueOf(memMinusResult[Integer.parseInt(data) * -1]));
				bufferedWriter.write(" ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			try {
				if(bufferedReader != null) bufferedReader.close();
				if(bufferedWriter != null){ bufferedWriter.flush(); bufferedWriter.flush();}
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
