package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		int[] memDecimal = new int[10001];
		
		memDecimal[1] = 1;
		for(int i = 2; i < Math.sqrt(memDecimal.length); i++){
			for(int j = i*i; j < memDecimal.length; j += i){
				memDecimal[j] = 1;
			}
		}
		
		int n,x,y;
		
		ArrayList<Integer> goldBachPartition = new ArrayList<Integer>();
		
		for(int i = 0 ; i < testCount; i++){
			goldBachPartition.clear();
			n = scanner.nextInt();
			x = 0;
			y = 0;
			for(int j = 1; j < n; j++){
				if(memDecimal[j] == 0){goldBachPartition.add(j);}
			}
			
			for(int k = 0; k < goldBachPartition.size(); k++){
				if(goldBachPartition.get(k) > (n/2)+1) break;
				if(goldBachPartition.contains(n-goldBachPartition.get(k))){
					x = goldBachPartition.get(k);
					y = n-x;
				} 
			}
			
			if(x > y){System.out.println(y + " " + x);}
			else {System.out.println(x + " " + y);}
		}
		
		scanner.close();
	}
	
}
