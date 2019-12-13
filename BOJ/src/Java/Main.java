package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String text = bufferedReader.readLine();
			int textLength = text.length();
			int textI = textLength/10;
			
			for(int i = 1; i <= textI; i++){
				bufferedWriter.write(text.substring(10*(i-1), 10*i) + "\n");
				bufferedWriter.flush();
			}
			bufferedWriter.write(text.substring(10*textI));
			bufferedWriter.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(bufferedReader != null) bufferedReader.close();
				if(bufferedWriter != null)bufferedWriter.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
