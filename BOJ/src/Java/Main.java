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
			String[] inputNM = bufferedReader.readLine().split(" ");
			int n = Integer.valueOf(inputNM[0]);
			int m = Integer.valueOf(inputNM[1]);
			
			Set<String> nDataArray = new HashSet<String>();
			ArrayList<String> resultData = new ArrayList<String>();
			
			for(int i = 0; i < n; i++){
				nDataArray.add(bufferedReader.readLine());
			}
			
			String isData;
			
			for(int i = 0; i < m; i++){
				isData = bufferedReader.readLine();
				if(nDataArray.contains(isData)){
					resultData.add(isData);
				}
			}
			
			resultData.sort(null);
			bufferedWriter.write(resultData.size() + "\n");
			for(String data : resultData){
				bufferedWriter.write(data + "\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(bufferedReader != null){bufferedReader.close();}
				if(bufferedWriter != null){bufferedWriter.flush();bufferedWriter.close();}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}