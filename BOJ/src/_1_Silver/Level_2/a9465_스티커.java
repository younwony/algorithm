/**
 * @작성자 wony
 * @작성일 2020. 2. 21.
 * @사용처
 *
 */
package Silver.Level_2;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2020. 2. 21.
 * @사용처
 * 
 */
public class a9465_스티커 {

	/**
	 * @작성자 wony
	 * @작성일 2020. 2. 21.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	
	static int[][] dataArray;
	static boolean[][] visited;
	static int sum = 0;
	static int max = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCase = scanner.nextInt();
		
		int colum; 
		
		for(int i = 0; i < testCase; i++){
			colum = scanner.nextInt();
			dataArray = new int[2][colum];
			visited = new boolean[2][colum];
			for(int j = 0; j < 2; j++){
				for(int k = 0; k < colum; k++){
					dataArray[j][k] = scanner.nextInt();
				}
			}
			dfs();
			System.out.println(sum);
		}
		
		scanner.close();
	}
	
	public static void dfs(){
		boolean result = false;
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < visited[0].length; j++){
				if(visited[i][j]){
					result = true;
				}else{
					result = false;
					break;
				}
			}
			if(!result){
				break;
			}
		}
		
		if(result){
			if(sum > max){
				max = sum;
			}
		}
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < visited[0].length; j++){
				if(!visited[i][j]){
					isVisited(i, j);
					sum += dataArray[i][j];
					dfs();
					sum -= dataArray[i][j];
					isVisited(i, j);
				}
			}
		}
	}
	
	public static void isVisited(int i, int j){
		visited[i][j] = !visited[i][j];
		
		if(i-1 >= 0){ visited[i-1][j] = visited[i][j];}
		if(i+1 <= 1){ visited[i+1][j] = visited[i][j];}
		if(j-1 >= 0){ visited[i][j-1] = visited[i][j];}
		if(j+1 < visited[0].length){ visited[i][j+1] = visited[i][j];}
	}

}
