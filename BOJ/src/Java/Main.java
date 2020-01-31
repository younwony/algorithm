package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	static int zeroCount = 0;
	static int[][] sudoku = new int[9][9];
	static ArrayList<int[]> arrayList = new ArrayList<int[]>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				sudoku[i][j] = scanner.nextInt();
				if(sudoku[i][j] == 0){
					arrayList.add(new int[]{i,j});
					zeroCount++;
				}
			}
		}
		scanner.close();
		solvedBackTraking(0);
		
	}
	
	public static void solvedBackTraking(int index){
		if(zeroCount == index){
			for(int i = 0; i < 9; i++){
				for(int j = 0; j < 9; j++){
					System.out.print(sudoku[i][j] + " ");
				}
				System.out.println();
			}
			System.exit(0);
		}else{
			int[] zeroFiled = arrayList.get(index);
			for(int i = 1; i <10; i++){
				sudoku[zeroFiled[0]][zeroFiled[1]] = i;
				if(LineCheck(zeroFiled[0],zeroFiled[1]) && NineCheck(zeroFiled[0],zeroFiled[1])){
					solvedBackTraking(index+1);
				}
				sudoku[zeroFiled[0]][zeroFiled[1]] = 0;
			}
		}
	}
	
	public static boolean LineCheck(int x, int y){
		
		int checkNum = sudoku[x][y];
		
		for(int i = 0; i < 9; i++){
			if((checkNum == sudoku[x][i] && i != y)|| (checkNum == sudoku[i][y] && i != x)){
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean NineCheck(int x, int y){
		
		int checkNum = sudoku[x][y];
		
		int nX = x/3;
		int nY = y/3;
		
		for(int i = nX*3; i < nX*3 + 3; i++){
			for(int j = nY*3; j < nY*3 + 3; j++){
				if(checkNum == sudoku[i][j] && i != x && j != y){
					return false;
				}
			}
		}
		
		return true;
	}
}




