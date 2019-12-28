/**
 * @작성자 wony
 * @작성일 2019. 12. 28.
 * @사용처
 * @Todo
 */

package Silver;

import java.util.Scanner;
import java.util.Stack;

/**
 * @작성자 wony
 * @작성일 2019. 12. 28.
 * @사용처
 * @Todo
 */

public class a15651_N과M_3 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 28.
	 * @사용처
	 * @param args
	 * @Todo
	 */

	static Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		
		backTracking(n, m);
	}
	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 28.
	 * @사용처 Multiset Permutation(중복순열)
	 * @param n
	 * @param m
	 * @Todo
	 */
	public static void backTracking(int n, int m){
		if(m == 0){
			try {
				for(int i = 0; i < stack.size(); i++)
					System.out.print(stack.get(i) + " ");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println();
		}else{
			for(int i = 1; i <= n; i++){
				stack.push(i);
				backTracking(n, m-1);
				stack.pop();
			}
		}
	}

}
