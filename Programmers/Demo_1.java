package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] as = solution(new int[][]{{1,4},{3,4},{3,10}});
		
		System.out.println();
	}
	
	public static int[] solution(int[][] v){
		
		int [] answer = new int[2];
		
		ArrayList<Integer> xlist = new ArrayList<>();
		ArrayList<Integer> ylist = new ArrayList<>();
		
		for(int i = 0; i < 3; i++){
			
			if(xlist.indexOf(v[i][0]) >= 0){
				xlist.remove(xlist.indexOf(v[i][0]));
			}else{
				xlist.add(v[i][0]);
			}
			if(ylist.indexOf(v[i][1]) >= 0){
				ylist.remove(ylist.indexOf(v[i][1]));
			}else{
				ylist.add(v[i][1]);
			}
		}
		
		answer[0] = xlist.get(0);
		answer[1] = ylist.get(0);
		
		return answer;
	}
}
