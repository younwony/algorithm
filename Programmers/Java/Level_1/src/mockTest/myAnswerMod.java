
/**
 * @작성자 wony
 * @작성일 2019. 9. 17.
 * @사용처
 * @TODO
 */
package mockTest;

import java.util.ArrayList;

/**
 * @작성자 wony
 * @작성일 2019. 9. 17.
 * @사용처  코딩테스트 - 완전 탐색 - 모의고사
 * @TODO 테스트 채첨후 68/100 점으로 불합격
 * 되지않는 테스트 케이스확인 x
 */
public class myAnswerMod {

	/**
	 * @작성자 wony
	 * @작성일 2019. 9. 17.
	 * @사용처
	 * @param args
	 * TODO
	 */
	public static void main(String[] args) {
		
		System.out.println(Solution(new int[]{1,2,3,4,5}).length);
		System.out.println(Solution(new int[]{1,3,2,4,2}).length);
        
    }
    
	public static int[] Solution(int[] answers){
		int[] answer = {};
        
		int[] noMathOne = {1,2,3,4,5};
		int[] noMathTwo = {2,1,2,3,2,4,2,5};
		int[] noMathThree = {3,3,1,1,2,2,4,4,5,5};
		
		int scoreOne = 0;
		int scoreTwo = 0;
		int scoreThree = 0;
		
		int scoreMax = 0;
		
		for(int i = 0; i<answers.length; i++){
			if(answers[i] == noMathOne[i%noMathOne.length]) scoreOne++;
			if(answers[i] == noMathTwo[i%noMathTwo.length]) scoreTwo++;
			if(answers[i] == noMathThree[i%noMathThree.length]) scoreThree++;
		}
		
		scoreMax = Math.max(scoreOne, Math.max(scoreTwo, scoreThree));
		
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		if(scoreMax == scoreOne) scoreList.add(1);
		if(scoreMax == scoreTwo) scoreList.add(2);
		if(scoreMax == scoreThree) scoreList.add(3);
		
		answer = new int[scoreList.size()];
		
		for(int i = 0; i < scoreList.size(); i++)
			answer[i] = scoreList.get(i);
		
		return answer;
	}
}
