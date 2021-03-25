
/**
 * @작성자 wony
 * @작성일 2019. 9. 17.
 * @사용처
 * @TODO
 */
package Programmers.Level_1.mockTest;

/**
 * @작성자 wony
 * @작성일 2019. 9. 17.
 * @사용처  코딩테스트 - 완전 탐색 - 모의고사
 * @TODO 테스트 채첨후 68/100 점으로 불합격
 * 되지않는 테스트 케이스확인 x
 */
public class myAnswer {

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
        
        int mathNoAnswer = 0;
        
        int answersSize = answers.length;
        
        int[] mathNoOne = new int[answersSize];
        int[] mathNoTwo = new int[answersSize];
        int[] mathNoThree = new int[answersSize];
        
        int mathNoOneAnswer = 0;
        int mathNoTwoAnswer = 0;
        int mathNoThreeAnswer = 0;
        
        for(int order = 0; order < answersSize; order++){
            mathNoOne[order] = ++mathNoAnswer;
            if(mathNoAnswer == 6)
                mathNoAnswer = 0;
        }
                              
        for(int order = 0; order < answersSize; order++){
            if(order%2 == 0){
                mathNoTwo[order] = 2;
            }else{
                switch(order%8){
                    case 1 : mathNoTwo[order] = 1; break;
                    case 3 : mathNoTwo[order] = 3; break;
                    case 5 : mathNoTwo[order] = 4; break;
                    case 7 : mathNoTwo[order] = 5; break;
                }
            }
        }
        
         for(int order = 0; order < answersSize; order++){
            switch(order%10){
                case 0 : mathNoAnswer = 3; break;
                case 2 : mathNoAnswer = 1; break;
                case 4 : mathNoAnswer = 2; break;
                case 6 : mathNoAnswer = 4; break;
                case 8 : mathNoAnswer = 5; break;
            }
            mathNoThree[order] = mathNoAnswer;
        }
             
             
        for(int i = 0; i < answersSize; i++){
            if(mathNoOne[i] == answers[i])
                mathNoOneAnswer++;
            if(mathNoTwo[i] == answers[i])
                mathNoTwoAnswer++;
            if(mathNoThree[i] == answers[i])
                mathNoThreeAnswer++;
        }
                     
        return equalsAnswers(mathNoOneAnswer,mathNoTwoAnswer, mathNoThreeAnswer);
	}
	
    public static int[] equalsAnswers(int mathNoOneAnswer, int mathNoTwoAnswer, int mathNoThreeAnswer){
                       
        if(mathNoOneAnswer>mathNoTwoAnswer){
            if(mathNoOneAnswer>mathNoThreeAnswer){
                return new int[]{1};
            }else if(mathNoOneAnswer == mathNoThreeAnswer){
                return new int[]{1,3};
            }else{
                return new int[]{3};
            }
        }else if (mathNoTwoAnswer>mathNoOneAnswer){
            if(mathNoTwoAnswer>mathNoThreeAnswer){
                return new int[]{2};
            }else if(mathNoTwoAnswer == mathNoThreeAnswer){
                return new int[]{2,3};
            }else{
                return new int[]{3};
            }
        }else{
            if(mathNoOneAnswer>mathNoThreeAnswer){
                return new int[]{1,2};
            }else if(mathNoOneAnswer == mathNoThreeAnswer){
                return new int[]{1,2,3};
            }else{
                return new int[]{3};            
            }
        }
    }       
}
