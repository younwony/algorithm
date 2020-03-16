package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[] treeHightArray = new int[n];
		
		int maxHeight = 0;
		
		for(int i = 0; i < n; i++){
			treeHightArray[i] = scanner.nextInt();
			maxHeight = Math.max(maxHeight, treeHightArray[i]);
		}

		long sum;
		int left = 0;
		int right = maxHeight;
		int middle = (left+right)/2;
		
		while(right >= left){
			sum = 0;
			for(int i = 0 ; i < n; i++){
				sum = treeHightArray[i] - middle > 0 ? sum + treeHightArray[i] - middle : sum + 0;
			}
			if(sum >= m){
				maxHeight = middle;
				left = middle + 1;
			}else{
				right = middle - 1;
			}
			middle = (left+right)/2;
			
		}
		
		
		scanner.close();
		
		System.out.println(maxHeight);
	}
}