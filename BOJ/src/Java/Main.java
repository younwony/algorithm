package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	static ArrayList<int[]> arrayList = new ArrayList<int[]>();
	static int[][] sudokuFiled = new int[9][9];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				sudokuFiled[i][j] = scanner.nextInt();
				if(sudokuFiled[i][j] == 0){arrayList.add(new int[]{i,j});}
			}
		}
		while(arrayList.size() != 0){
			dfs();
		}
		scanner.close();
		
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				System.out.print(sudokuFiled[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void dfs(){
		for(int i = 0; i < arrayList.size(); i++){
			XYLineCheck(arrayList.get(i)[0],arrayList.get(i)[1]);
			NineFiled(arrayList.get(i)[0], arrayList.get(i)[1]);
			if(sudokuFiled[arrayList.get(i)[0]][arrayList.get(i)[1]] != 0){arrayList.remove(i);}
		}
	}
	
	public static void XYLineCheck(int x, int y){
		if(sudokuFiled[x][y] != 0) return;
		boolean[] xChecked = new boolean[9];
		boolean[] yChecked = new boolean[9];
		
		int xCount = 0;
		int yCount = 0;
		for(int i = 0; i < 9; i++){
			if(i == y){continue;}
			if(sudokuFiled[x][i] == 0){xCount++;continue;}
			else{xChecked[sudokuFiled[x][i]-1] = true;}
		}
		for(int i = 0; i < 9; i++){
			if(i == x){continue;}
			if(sudokuFiled[i][y] == 0){yCount++;continue;}
			else{yChecked[sudokuFiled[i][y]-1] = true;}
		}
		
		if(xCount == 0){
			for(int i = 0; i < 9; i++){
				if(!xChecked[i]){sudokuFiled[x][y] = i+1; return ;}
			}
		}else if(yCount == 0){
			for(int i = 0; i < 9; i++){
				if(!yChecked[i]){sudokuFiled[x][y] = i+1; return ;}
			}
		}
	}
	
	public static void NineFiled(int x, int y){
		if(sudokuFiled[x][y] != 0) return;
		int xQuotient = x/3;
		int yQuotient = y/3;
		boolean[] checked = new boolean[9];
		int xLocation;
		int yLocation;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				xLocation = (xQuotient*3)+i;
				yLocation = (yQuotient*3)+j;
				if(xLocation == x && yLocation == y){continue;}
				if(sudokuFiled[xLocation][yLocation] == 0){return;}
				else{checked[sudokuFiled[xLocation][yLocation]-1] = true;}
			}
		}
		
		for(int i = 0; i < 9; i++){
			if(!checked[i]){sudokuFiled[x][y] = i+1; return;}
		}
	}
}



