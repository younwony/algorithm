package Gold.Level_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a9466_팀프로젝트 {

	static int count = 0;
	static int[] field;
	static boolean[] visited;
	static boolean[] finished;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.valueOf(bufferedReader.readLine());
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < testCase; i++){
			int personCnt = Integer.valueOf(bufferedReader.readLine());
			field = new int[personCnt+1];
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			for(int x = 1; x <= personCnt; x++){
				field[x] = Integer.valueOf(stringTokenizer.nextToken());
			}
			
			int resultCnt =  0;
			visited = new boolean[personCnt+1];
			finished = new boolean[personCnt+1];
			for(int x = 1; x <= personCnt; x++){
				if(!visited[x])	dfs(x);
			}
			
			result.append(resultCnt).append("\n");
			
		}
		
		System.out.println(result.toString());

	}
	
	public static void dfs(int x){
		
		visited[x] = true;
		int nextX = field[x];
		
		if(!visited[nextX]){
			dfs(nextX);
		}else{
			if(!finished[nextX]){
				for(int i = nextX; i != x; i = field[i]){
					count++;
				}
				count++;
			}
		}
		
		finished[x] = true;
		
	}

}
