package Silver.Level_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class a2178_미로탐색 {

	static char[][] field;
	static int cntMin = Integer.MAX_VALUE;
	static boolean[][] visited;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] inputXY = bufferedReader.readLine().split(" ");
		int x = Integer.valueOf(inputXY[0]);
		int y = Integer.valueOf(inputXY[1]);
		
		field = new char[x][y];
		visited = new boolean[x][y];
		for(int i = 0; i < x; i++){
			field[i] = bufferedReader.readLine().toCharArray();
		}
		
		dfs(0,0,1);
		
		System.out.println(cntMin);
	}
	
	public static void dfs(int x, int y, int cnt){
		
		if(visited[visited.length - 1][visited[0].length - 1]){
			if(cnt < cntMin){
				cntMin = cnt;
			}
			return ;
		}
		
		if(isField(x+1, y)){
			if(!visited[x+1][y] && field[x+1][y] == '1'){
				visited[x+1][y] = true;
				dfs(x+1, y, cnt+1);
				visited[x+1][y] = false;
			}
		}
		if(isField(x, y+1)){
			if(!visited[x][y+1] && field[x][y+1] == '1'){
				visited[x][y+1] = true;
				dfs(x, y+1, cnt+1);
				visited[x][y+1] = false;
			}
		}
		if(isField(x-1, y)){
			if(!visited[x-1][y] && field[x-1][y] == '1'){
				visited[x-1][y] = true;
				dfs(x-1, y, cnt+1);
				visited[x-1][y] = false;
			}
		}
		if(isField(x, y-1)){
			if(!visited[x][y-1] && field[x][y-1] == '1'){
				visited[x][y-1] = true;
				dfs(x, y-1, cnt+1);
				visited[x][y-1] = false;
			}
		}
	}
	
	public static boolean isField(int x, int y){
		return (x >= 0 && x  < field.length) && (y >= 0 && y  < field[0].length); 
	}

}
