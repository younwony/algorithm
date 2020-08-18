package Silver.Level_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class a1932_정수삼각형 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.valueOf(bufferedReader.readLine());
		
		int[][] dp = new int[n][n];
		int[][] cost = new int[n][n];
		
		String[] costIArray;
		
		for(int i = 0; i < n; i++){
			costIArray = bufferedReader.readLine().split(" ");
			for(int j = 0; j < costIArray.length; j++){
				cost[i][j] = Integer.valueOf(costIArray[j]);
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		dp[0][0] = cost[0][0];
		
		for(int i = 1 ; i < n; i++){
			for(int j = 0; j <= i; j++){
				if(j > 0 && j < i){
					dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + cost[i][j]; 
				}else if(j == 0){
					dp[i][j] = dp[i-1][j] + cost[i][j];
				}else if(i == j){
					dp[i][j] = dp[i-1][j-1] + cost[i][j];
					
				}
				
				if(dp[i][j] > max){
					max = dp[i][j];
				}
			}
		}
		
		System.out.println(max);
		
	}

}
