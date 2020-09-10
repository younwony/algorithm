package Kakao.Problem_2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

import Java.Main.person;

public class 카카오프렌즈_컬러링북 {
	static int[] xArray = {-1,1,0,0};
	static int[] yArray = {0,0,-1,1};
	
	public static void main(String[] args) {
		int m;
		int n;
		int[][] picture;
		
		m = 6;
		n = 4;
		picture = new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		
        System.out.println(solution(m, n, picture)); //4

    }

	 public static int[] solution(int m, int n, int[][] picture) {
		 
		boolean[][] visited = new boolean[m][n];
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        for(int i = 0 ; i < m; i++){
        	for(int j = 0 ; j < n; j++){
        		if(!visited[i][j] && picture[i][j] != 0){
        			int sizeArea = 0;
        			numberOfArea++;
        			sizeArea = dfs(picture, sizeArea, visited, i, j);
        			if(sizeArea > maxSizeOfOneArea){
        				maxSizeOfOneArea = sizeArea;
        			}
        		}
        	}
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
	 
	 public static int dfs(int[][] picture, int sizeArea, boolean[][] visited , int i, int j){
		visited[i][j] = true;
		sizeArea++;
		for(int k = 0 ; k < 4; k++){
			int tempI = i + xArray[k];
			int tempJ = j + yArray[k];
			if(tempI >= 0 && tempI < visited.length && tempJ >= 0 && tempJ < visited[0].length){
				if(!visited[tempI][tempJ] && picture[i][j] == picture[tempI][tempJ]){
					sizeArea = dfs(picture, sizeArea, visited, tempI, tempJ);
				}
			}
		}
		
		return sizeArea;
		 
	 }
}
