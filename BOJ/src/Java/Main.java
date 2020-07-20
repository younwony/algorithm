package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static char[] inputData; 
	static char[] boomData; 
	static String inputString; 
	
	public static void main(String[] args) {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			inputString = bufferedReader.readLine();
			inputData = new char[inputString.length()];
			boomData = bufferedReader.readLine().toCharArray();
			
			int index = 0;
			
			for(int i = 0; i < inputString.length(); i++){
				inputData[index] = inputString.charAt(i);
				if(inputData[index] == boomData[boomData.length - 1] && index >= boomData.length - 1){
					if(isBoom(index)){
						index -= boomData.length;
					}
				}
				index++;
			}
			
			String result = String.valueOf(inputData, 0, index);
			
			System.out.println(result.length() > 0 ? result : "FRULA");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(bufferedReader != null){bufferedReader.close();}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public static boolean isBoom(int index){
		for(int i = 0; i < boomData.length; i++){
			if(boomData[i] != inputData[index - boomData.length + 1 + i]){
				return false;
			}
		}
		
		return true;
	}
}


