package Gold.Level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a9466_텀프로젝트 {

	static int count = 0;
	static int[] field;
	static boolean[] visited;
	static boolean[] cycle;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.valueOf(bufferedReader.readLine());
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < testCase; i++){
			count = 0;
			int personCnt = Integer.valueOf(bufferedReader.readLine());
			field = new int[personCnt+1];
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			for(int x = 1; x <= personCnt; x++){
				field[x] = Integer.valueOf(stringTokenizer.nextToken());
			}
			
			visited = new boolean[personCnt+1];
			cycle = new boolean[personCnt+1];
			for(int x = 1; x <= personCnt; x++){
				if(!visited[x] && !cycle[x])dfs(x);
			}
			
			result.append(personCnt - count).append("\n");
			
		}
		
		System.out.println(result.toString());

	}
	
	public static void dfs(int x){
		
		visited[x] = true;
		
		int nextX = field[x];
		
		if(!visited[nextX]){
			dfs(nextX);
		}else{
			if(!cycle[nextX]){
				while(x != nextX){
					nextX = field[nextX];
					count++;
				}
				count++;
			}
		}
		
		cycle[x] = true;
		
	}

}
