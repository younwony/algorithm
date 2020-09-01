package Java;

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		int[][] key, lock;
		
		key = new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
		lock = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		
        System.out.println(solution(key, lock));

    }

	public static boolean solution(int[][] key, int[][] lock) {
        boolean answer = false;
        
        int[][][] lockField = SquarePoint(lock);
        for(int i = 0 ; i< 4; i++){
        	if(isUnlock(lockField[i], key)){
        		answer = true;
        		break;
        	}
        }
        return answer;
    }
	
	public static int[][][] SquarePoint(int[][] lock){
		int[] xy = new int[4];
		
		int maxX = Integer.MIN_VALUE;
		int maxY = Integer.MIN_VALUE;
		int minX = Integer.MAX_VALUE;
		int minY = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < lock.length; i++){
			for(int j = 0 ; j < lock[0].length; j++){
				if(lock[i][j] == 0){
					maxX = Math.max(i,maxX);
					maxY = Math.max(i,maxY);
					minX = Math.min(i, minX);
					minY = Math.min(i, minY);
				}
			}
		}
		
		xy[0] = minX;
		xy[1] = minY;
		xy[2] = maxX;
		xy[3] = maxY;
		
		int lockFieldXSize = maxX - minX + 1; 
		int lockFieldYSize = maxY - minY + 1; 
		
		//4 는 4개의 회전 필드
		int[][][] lockField = new int[4][lockFieldXSize][lockFieldYSize];
		
		
		// 회전 로직 추가
		for(int i = 0 ; i < lock.length; i++){
			for(int j = 0 ; j < lock[0].length; j++){
				if(lock[i][j] == 0){
					lockField[0][i - minX][j - minY] = 1;
				}
			}
		}
		
		return lockField;
	}
	
	/**
	 *	@author : wony
	 *	@date : 2020-09-01
	 *  @Desc : lockFiled가 key 에 존재 하는지 확인
	 */
	public static boolean isUnlock(int[][] lockField, int[][] key){
		boolean result = false;
		boolean unlock = true;
		
		key:
		for(int i = 0 ; i < key.length; i++){
			for(int j = 0; j < key[0].length; j++){
				unlock = true;
				lock:
				for(int locki = 0; locki < lockField.length; locki++){
					for(int lockj = 0; lockj < lockField[0].length; lockj++){
						if(key[i][j] != lockField[locki][lockj]){
							unlock = false;
							break lock;
						}
					}
				}
				if(unlock){
					result = true;
					break key;
				}
				
			}
		}
		
		return result;
	}
    
}


