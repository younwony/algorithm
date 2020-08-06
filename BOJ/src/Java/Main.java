package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
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
		
//		dfs(0,0,1);
		Queue<point> queue = new LinkedList<>();
		visited[0][0] =true;
		queue.offer(new point(0, 0, 1));
		System.out.println(bfs(queue));
//		System.out.println(cntMin);
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
	
	public static int bfs(Queue<point> queue){
		
		int[] xArray = {1, 0, -1, 0};
		int[] yArray = {0, 1, 0, -1};
		int result = 0;
		while(!queue.isEmpty()){
			point point = queue.poll();
			for(int i =0 ; i< 4; i++){
				int x= point.x + xArray[i];
				int y= point.y + yArray[i];
				if(isField(x, y)){
					if(field[x][y] == '1' && !visited[x][y]){
						if(x == field.length - 1 && y == field[0].length - 1){
							result = point.cnt+1;
							break;
						}
						queue.offer(new point(x, y, point.cnt + 1));
						visited[x][y] = true;
					}
				}
			}
			if(result > 0){
				break;
			}
		}
		return result;
	}
	
	public static boolean isField(int x, int y){
		return (x >= 0 && x  < field.length) && (y >= 0 && y  < field[0].length); 
	}
}

class point{
	int x;
	int y;
	int cnt;
	public point(int x, int y, int cnt) {
		super();
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}


