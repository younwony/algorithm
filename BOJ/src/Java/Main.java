package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	static int n;
	static StringBuilder builder = new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();
		dfs(0);
	}
	
	public static void dfs(int depth){
		if(depth == n){
			System.out.println(builder.toString());
			System.exit(0);
		}else{
			for(int i =1; i <= 3; i++){
				builder.append(i);
				if(isRight(builder.toString())){
					dfs(depth+1);
				}
				builder.delete(builder.length()-1, builder.length());
				
			}
		}
	}
	
	public static boolean isRight(String str){
		
		boolean result = true;
		
		for(int i = 1; i <= str.length()/2; i++){
			for(int j = 0; j <= str.length()-2*i; j++){
				if(str.substring(j,j+i).equals(str.substring(j+i, j+2*i))){
					result = false;
				}
			}
			
		}
		
		return result;
		
	}
}



