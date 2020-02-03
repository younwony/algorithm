package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	static boolean[] isDecimal = new boolean[1000001];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Eratos();
		
		int n;
		
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			while((n = scanner.nextInt()) != 0){
				bufferedWriter.write(GoldBach(n) + "\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(bufferedWriter != null){bufferedWriter.flush(); bufferedWriter.close();}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		scanner.close();
	}
	
	public static void Eratos(){
		
		for (int i = 2; i < isDecimal.length; i++) {
			isDecimal[i] = true;
		}
		
		for(int i = 2; i*i < isDecimal.length; i++){
			for(int j = i*i; j < isDecimal.length; j += i){
				isDecimal[j] = false;
			}
		}
	}
	
	public static String GoldBach(int n){
		
		for(int i = 2; i < isDecimal.length/2; i++){
			if(isDecimal[i] && isDecimal[n-i]){
				return  n + " = " + i + " + " + (n-i);
			}
		}
		
		return "Goldbach's conjecture is wrong."; 
		
	}
}