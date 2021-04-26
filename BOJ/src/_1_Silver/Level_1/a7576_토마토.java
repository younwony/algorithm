package Silver.Level_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class a7576_토마토 {

	static int[][] field;
	static int[] xArray = {1, 0, -1, 0};
	static int[] yArray = {0, 1, 0, -1};
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] intXY = bufferedReader.readLine().split(" ");
		
		int x = Integer.valueOf(intXY[1]);
		int y = Integer.valueOf(intXY[0]);
		
		field = new int[x][y];
		
		
		Queue<tomato> queue = new LinkedList<tomato>();
		
		for(int i = 0 ; i < x; i++){
			String[] yfield = bufferedReader.readLine().split(" ");
			for(int j = 0; j < y; j++){
				field[i][j] = Integer.valueOf(yfield[j]);
				if(field[i][j] == 1){
					queue.offer(new tomato(i, j, 1));
				}
			}
		}
		
		int result = bfs(queue);
		
		for(int i= 0 ; i < x; i++){
			for(int j = 0 ; j < y; j++){
				if(field[i][j] == 0){
					result = -1;
				}
			}
		}
		
		System.out.println(result);
	}
	
	public static int bfs(Queue<tomato> queue){
		int result = 0;
		
		while(!queue.isEmpty()){
			tomato tomato = queue.poll();
			for(int i= 0 ; i< 4; i++){
				int x= tomato.x + xArray[i];
				int y = tomato.y + yArray[i];
				if(isField(x, y)){
					if(field[x][y] == 0){
						field[x][y] = 1;
						result = tomato.cnt + 1;
						queue.offer(new tomato(x, y, result));
					}
				}
			}
		}
		
		return result == 0 ? 0 : result-1;
	}
	
	public static boolean isField(int x, int y){
		return (x >= 0 && x < field.length) && (y >= 0 && y < field[0].length);
	}
	
}

class tomato{
	int x;
	int y;
	int cnt;
	public tomato(int x, int y, int cnt) {
		super();
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
	
	
}
