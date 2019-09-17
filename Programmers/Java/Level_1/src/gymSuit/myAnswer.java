/**
 * @작성자 wony
 * @작성일 2019. 9. 17.
 * @사용처
 * TODO
 */
package gymSuit;

import java.util.Arrays;

/**
 * @작성자 wony
 * @작성일 2019. 9. 17.
 * @사용처
 * TODO
 */
public class myAnswer {

	/**
	 * @작성자 wony
	 * @작성일 2019. 9. 17.
	 * @사용처
	 * @Todo
	 * @param args
	 * TODO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(5, new int[]{2,4}, new int[]{1,3,5}));
		System.out.println(solution(5, new int[]{2,4}, new int[]{3}));
		System.out.println(solution(3, new int[]{3}, new int[]{1}));
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 9. 17.
	 * @사용처
	 * @Todo
	 * @param n : 전체 학생 수
	 * @param lost : 도난당한 학생들의 번호가 담긴 배열
	 * @param reserve : 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
	 * @return 체육수업을 들을 수 있는 학생의 최댓값
	 * TODO
	 */
	public static int solution(int n, int[] lost, int[] reserve){
		int answer = 0;
		
		answer = n - lost.length;

		for(int i : lost){
//			Arrays.
		}
		
		return answer;
	}

}
