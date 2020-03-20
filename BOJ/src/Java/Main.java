package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static boolean[][] filed; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new Scanner(System.in).nextInt();
		
		int oneSideStarCount = 4*n - 3;
		
		filed = new boolean[2*oneSideStarCount - 1][oneSideStarCount];
		
		int startNum = 0;
		
		for(int i = n; i > 0; i--){
			oneSideStarCount = 4*i -3;
			drawFiled(startNum, oneSideStarCount);
			startNum += 2;
		}
		
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < filed.length; i++){
			if(i % 2 == 0){
				for(int j = 0; j< filed[0].length; j++){
					if(filed[i][j]){
						builder.append("*");
					}else{
						builder.append(" ");
					}
				}
			}else{
				builder.append("\n");
			}
		}
		
		
		System.out.println(builder.toString());
		
	}
	
	public static void drawFiled(int startNum, int oneSideStarCount){
		
//		가로
		for(int i = startNum; i < startNum + oneSideStarCount; i++){
			filed[2*startNum][i] = true;
			filed[2*startNum + 2*(oneSideStarCount-1)][i] = true;
		}
		
//		세로
		for(int i = startNum; i < startNum + oneSideStarCount; i++){
			filed[2*i][startNum] = true;
			filed[2*i][startNum + oneSideStarCount - 1] = true; 
		}
	}
}