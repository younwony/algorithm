/**
 * @작성자 wony
 * @작성일 2020. 2. 21.
 * @사용처
 *
 */
package _1_Silver.Level_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a9465_스티커 {

	/* DP로 풀이*/
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < testCase; i++){
			int n = Integer.parseInt(bufferedReader.readLine());
			int[][] field = new int[2][n];

			for(int j = 0 ; j < 2; j ++){
				StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
				int index = 0;
				while(stringTokenizer.hasMoreTokens())
					field[j][index++] = Integer.parseInt(stringTokenizer.nextToken());
			}

			int[][] dp = new int[2][n];
			dp[0][0] = field[0][0];
			dp[1][0] = field[1][0];
			dp[0][1] = field[0][1] + dp[1][0];
			dp[1][1] = field[1][1] + dp[0][0];
			for(int index = 2; index < n; index++){
				dp[0][index] = Math.max(dp[1][index-2]+ field[0][index], Math.max(dp[1][index-1] + field[0][index], dp[0][index-1]));
				dp[1][index] = Math.max(dp[0][index-2]+ field[1][index], Math.max(dp[0][index-1] + field[1][index], dp[1][index-1]));
			}

			System.out.println(Math.max(dp[0][n-1],dp[1][n-1]));

		}
	}
	
	/* 아래는 시간초과 (DFS 풀이)*/
	static int[][] field;
	static boolean[][] visited;
	static ArrayList<Point> saveList = new ArrayList<>();
	static int[] xArray = {-1,0,0,1};
	static int[] yArray = {0,-1,1,0};
	static int max;

	public static void main2(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < testCase; i++){
			int n = Integer.parseInt(bufferedReader.readLine());
			field = new int[2][n];
			visited = new boolean[2][n];
			max = Integer.MIN_VALUE;

			for(int j = 0 ; j < 2; j ++){
				StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
				int index = 0;
				while(stringTokenizer.hasMoreTokens())
					field[j][index++] = Integer.parseInt(stringTokenizer.nextToken());
			}

			dfs();
			System.out.println(max);
		}
	}

	private static void dfs() {
		if(isAllVisited()){
			int sum = 0;
			for (Point point : saveList) {
				sum += field[point.x][point.y];
			}
			max = Math.max(max,sum);
		}

		for(int x = 0; x < 2; x++){
			for(int y = 0; y < field[0].length; y++){
				if(!visited[x][y]){
					Point point = new Point(x,y);
					saveList.add(point);
					updateVisit();

					dfs();

					updateVisit();
					saveList.remove(point);
				}
			}
		}
	}

	private static void updateVisit() {
		visited = new boolean[2][visited[0].length];
		for (Point point : saveList) {
			visited[point.x][point.y] = true;
			for(int i = 0 ; i < 4; i++){
				int nextX = point.x + xArray[i];
				int nextY = point.y + yArray[i];
				if(isField(nextX,nextY))
					visited[nextX][nextY] = true;
			}
		}
	}

	private static boolean isField(int nextX, int nextY) {
		return nextX >= 0 && nextY >=0 && nextX < 2 && nextY < field[0].length;
	}

	private static boolean isAllVisited() {
		for (boolean[] booleans : visited) {
			for (boolean visit : booleans) {
				if(!visit) return false;
			}
		}
		return true;
	}

	static class Point{
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
