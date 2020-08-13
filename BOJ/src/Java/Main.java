package Java;

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

	static boolean[] visited;
	static ArrayList<Integer> inputList = new ArrayList<>();
	static ArrayList<String> result = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.valueOf(bufferedReader.readLine());
		
		String inputData = bufferedReader.readLine();
		
		visited = new boolean[n];
		
		for(int i = 0; i < n; i++){
			visited[i] = true;
			inputList.add(i+1);
			dfs(i);
			inputList.clear();
			visited[i] = false;
		}
		
		int index = result.indexOf(inputData);
		
		System.out.println(index+1 == result.size() ? -1 : result.get(index+1));
		
	}
	
	public static void dfs(int index) {
		
		if(inputList.size() == visited.length){
			StringBuilder str = new StringBuilder();
			for(int i : inputList){
				str.append(i).append(" ");
			}
			result.add(str.substring(0, str.length()-1).toString());
		}
		
		for(int i = 0; i < visited.length; i++){
			if(!visited[i]){
				visited[i] = true;
				inputList.add(i+1);
				dfs(index);
				visited[i] = false;
				inputList.remove(inputList.indexOf(i+1));
			}
		}
	}
}


