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
			String nm = bufferedReader.readLine();
			int n = nm.charAt(0) - '0';
			int m = nm.charAt(2) - '0';
			
			String[] nData = bufferedReader.readLine().split(" ");
			String[] mData = bufferedReader.readLine().split(" ");
			
			bufferedWriter.write(mergeSort(nData, mData));
			
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
	
	public static String mergeSort(String[] n, String[] m){

		int ni = 0;
		int mi = 0;
		int di = 0;
		
		StringBuilder builder = new StringBuilder();
		
		for(;di< n.length + m.length; di++){
			if(Integer.parseInt(n[ni]) > Integer.parseInt(m[mi])){
				builder.append(m[mi++] + " ");
			}else{
				builder.append(n[ni++] + " ");
			}
			if(mi == m.length || ni == n.length){
				di++;
				break;
			}
		}
		
		if(ni < n.length){
			for(; di < n.length + m.length; di++){
				builder.append(n[ni++] + " ");
			}
		}else if(mi < m.length){
			for(; di < n.length + m.length; di++){
				builder.append(m[mi++] + " ");
			}
		}
		
		return builder.toString();
	}
}