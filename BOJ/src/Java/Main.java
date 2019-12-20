package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[][] filed = new String[scanner.nextInt()][scanner.nextInt()];
		scanner.nextLine();
		for(int i = 0; i < filed.length; i++)
			filed[i] = scanner.nextLine().split("");
		scanner.close();
		int countMin = 0;
		
		for(int i = 0; i < filed.length-7; i++){
			for(int j = 0; j < filed[0].length -7; j++){
				if(i ==0 && j ==0) countMin = filedCount(filed, i, j);
				else{
					countMin = countMin > filedCount(filed, i, j) ? filedCount(filed, i, j) : countMin;
				}
			}
		}
		
		System.out.println(countMin);
		
	}
	public static int filedCount(String[][] filed, int startX, int startY){
		int countOne = 0;
		for(int i = startX; i < startX+8; i++){
			for(int j = startY; j < startY+8; j++){
				if((i+j) % 2 == 0){
					if("B".equals(filed[i][j])) countOne++;
				}else{
					if("W".equals(filed[i][j])) countOne++;
				}
			}
		}
		int countTwo = 0;
		for(int i = startX; i < startX+8; i++){
			for(int j = startY; j < startY+8; j++){
				if((i+j) % 2 != 0){
					if("B".equals(filed[i][j])) countTwo++;
				}else{
					if("W".equals(filed[i][j])) countTwo++;
				}
			}
		}
		
		return countOne > countTwo ? countTwo : countOne;
	}
}
