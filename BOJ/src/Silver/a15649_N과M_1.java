/**
 * @작성자 wony
 * @작성일 2019. 12. 27.
 * @사용처
 *
 */
package Silver;

import java.util.Scanner;
import java.util.Stack;

/**
 * @작성자 wony
 * @작성일 2019. 12. 27.
 * @사용처
 * 
 */
public class a15649_N과M_1 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 27.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	static boolean[] visited;
	static Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		visited = new boolean[n+1];
		scanner.close();
		
		backTracking(n, m);
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 27.
	 * @사용처 Permutation(순열)
	 * @Todo
	 * @param n
	 * @param m
	 * 
	 */
	public static void backTracking(int n, int m){
		if(m == 0){
			try {
				int i = 0;
				while(stack.indexOf(i) != -1){
					System.out.print(stack.get(i++));
				}
				System.out.println();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println();
		}else{
			for(int i = 1; i <= n; i++){
				if(stack.contains(i)){continue;}
				stack.push(i);
				backTracking(n, m-1);
				stack.pop();
			}
		}
	}
/*	public static void backTracking(int n, int m){
		if(m == 0){
			for(int i = 0; i < visited.length; i++){
				if(visited[i]) System.out.print(i + " ");
			}
			System.out.println();
		}else{
			for(int i = 1; i <= n; i++){
				if(visited[i]){continue;}
				visited[i] = true;
				backTracking(n, m-1);
				visited[i] = false;
			}
		}
	}
*/
}
