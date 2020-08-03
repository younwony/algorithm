package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	static boolean[][] isNode;
	static Map<Integer, Boolean> isVisited = new HashMap<>();
	static Stack<Integer> stack = new Stack<>();
	static Queue<Integer> queue = new LinkedList<>();
	static StringBuilder dfsResult = new StringBuilder();
	static StringBuilder bfsResult = new StringBuilder();
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] inputSplitData = bufferedReader.readLine().split(" ");
		
		int n = Integer.valueOf(inputSplitData[0]);
		int m = Integer.valueOf(inputSplitData[1]);
		int v = Integer.valueOf(inputSplitData[2]);

		// 인접행렬로 그래프 구현
		isNode = new boolean[n+1][n+1];
		
		String[] nodeXY;
		int x,y;
		for(int i = 0 ; i < m; i++){
			nodeXY = bufferedReader.readLine().split(" ");
			x = Integer.valueOf(nodeXY[0]);
			y = Integer.valueOf(nodeXY[1]);
			
			isNode[x][y] = true;
			isNode[y][x] = true;
			
			isVisited.put(x, false);
			isVisited.put(y, false);
		}
		
		// 방문 체크 변수
		
		// 시작점 v 체크
		isVisited.put(v, true);
		
		stack.push(v);
		
		dfs(v);
		
		for(int i : isVisited.keySet()){
			isVisited.put(i, false);
		}
		
		queue.offer(v);
		isVisited.put(v, true);
		bfs(v);
		
		System.out.println(dfsResult.toString());
		System.out.println(bfsResult.toString());
	}
	
	public static void dfs(int start){
		
		if(isVisited()){
			while(!stack.isEmpty()){
				dfsResult.append(stack.pop() + " ");
			}
			return ;
		}
		
		dfsResult.append(stack.pop() + " ");
		
		for(int j = 1; j < isNode.length; j++){
			if(isNode[start][j] && !isVisited.get(j)){
				isVisited.put(j,true);
				stack.push(j);
				dfs(j);
			}
		}
			
	}
	
	public static void bfs(int start){
			
		if(isVisited()){
			while(!queue.isEmpty()){
				bfsResult.append(queue.poll() + " ");
			}
			return ;
		}
		
		bfsResult.append(queue.poll() + " ");
		
		for(int j = 1; j < isNode.length; j++){
			if(isNode[start][j] && !isVisited.get(j)){
				isVisited.put(j,true);
				queue.offer(j);
			}
		}
		if(!queue.isEmpty()){
			bfs(queue.peek());
		}
	}
	
	public static boolean isVisited(){
		boolean result = true;
		
		for(int i : isVisited.keySet()){
			if(!isVisited.get(i)){
				result = false;
			}
		}
		
		return result;
	}
}


