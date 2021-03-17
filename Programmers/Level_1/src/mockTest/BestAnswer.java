/**
 * @작성자 wony
 * @작성일 2019. 9. 17.
 * @사용처
 * TODO
 */
package Programmers.Level_1.src.mockTest;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * @작성자 wony
 * @작성일 2019. 9. 17.
 * @사용처
 * TODO
 */
public class BestAnswer {

	/**
	 * @작성자 wony
	 * @작성일 2019. 9. 17.
	 * @사용처
	 * @param args
	 * @TODO
            if(answer[i] == a[i%a.length]) {score[0]++;} 사용예 확인 좋은방법!
            ramda 함수 사용으로 오류표시(java8 Stream()API에 대해 간략히 기술
	 * 
	 */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(int[] answer) {
        //각각 반복되는 구간 저장
		int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        //각각 점수 저장할 배열 선언
        // * 배열로 할시 속도저하가 일어난다 차라리 객채를 3개 생성해서 하는 편이 더빠른 속도를 가질 수 있다.
        int[] score = new int[3];
        
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        
        //maxScore 로 최대값 구하기
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        //중복 데이터 확인을 위해 list 생성 후 값 넣기
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        
        /*stream() -> java8 부터 사용가능한 api 로 데이터소스를 추상화하고, 데이터를 다루는데 자주 사용되는 메서드들을 정의해놓앗다.
         * 1. 스트림은 데이터 소스를 변경하지 않는다.
         * 2. 스트림은 일회용이다. 한번 사용후 닫히므로 필요시 stream 을 재생성 해야한다.
         * 3. 스트림은 작업을 내부 반복으로 처리한다.(내부 반복 -> 반복문을 메서드 내부에 숨길 수 있다.)
         * 
         * 연산은 중간연산, 최종연산으로 분류
         * 1. 중간연산 : 연산결과를 스트림으로 반환하기에 중간연산을 연속해서 사용이 가능(map(), flatMap()등)
         * 2. 최종연산 : 스트림의 요소를 소모하면서 연산을 수행하기 때문에 단 한번만 연산이 가능하다.(reduce(), collect()등) 사용후 Stream 이 닫힌다.
         * */ 
        
       // return list.stream().mapToInt(i->i.intValue()).toArray(); //ramda 함수 사용
        return null;
    }

}
