/**
 * @작성자 wony
 * @작성일 2020. 1. 26.
 * @사용처
 * @Todo
 */

package Silver.Level_4;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2020. 1. 26.
 * @사용처
 * @Todo
 */

public class a10972_다음순열 {

	/**
	 * @작성자 wony
	 * @작성일 2020. 1. 26.
	 * @사용처 
	 * @param args
	 * @Todo C++ Stl 구현해보기,  대부분이 STL의 next_permutation을 구현해서 풀이
	 */

	static boolean[] visited;
	static int[] resultArray;
	static int[] inputArray;
	static StringBuilder compareData = new StringBuilder();
	static StringBuilder saveData = new StringBuilder(); 
	static StringBuilder resultData = new StringBuilder();
	static boolean checked = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		visited = new boolean[n];
		resultArray = new int[n];
		inputArray = new int[n];
		for(int i = 0; i < n; i++) {
			compareData.append(scanner.nextInt()+" ");
		}
		dfs(n, 0);
	}
	
	public static void dfs(int n, int index) {
		if(index == n) {
			saveData.setLength(0);
			for(int i = 0; i < resultArray.length; i++) {
				if(checked) {resultData.append(resultArray[i]+" ");}
				else{saveData.append(resultArray[i]+" ");}
			}
			if(checked) {checked = false;}
			if(compareData.toString().equals(saveData.toString())) {
				checked = true;
			}
		}else {
			for(int i = 0; i < n; i++) {
				if(!visited[i]) {
					visited[i] = true;
					resultArray[index] = i + 1;
					dfs(n, index+1);
					visited[i] = false;
				}
			}
		}
	}

}
