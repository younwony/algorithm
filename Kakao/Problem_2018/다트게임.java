package Kakao.Problem_2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

import Java.Main.person;

public class 다트게임 {
	public static void main(String[] args) {
		
        System.out.println(solution("1S*2T*3S"));

    }

	 public static int solution(String dartResult) {
	        int answer = 0;
	        
	        Stack<Integer> stack = new Stack<>();
	        
	        for(int i = 0; i < dartResult.length(); i++){
	        	switch (dartResult.charAt(i)) {
				case 'S':
					break;
				case 'D':
					stack.push((int)Math.pow(stack.pop(), 2));
					break;
				case 'T':
					stack.push((int)Math.pow(stack.pop(), 3));
					break;
				case '*': if(stack.size() == 1){
					stack.push(stack.pop() * 2);
				}else{
					int data1 = stack.pop() * 2;
					int data2 = stack.pop() * 2;
					stack.push(data2);
					stack.push(data1);
				}
					break;
				case '#':
					stack.push(-stack.pop());
					break;
				default:
					int dartScore = dartResult.charAt(i) - '0';
					if(dartScore == 1 && i + 1 < dartResult.length()){
						if(dartResult.charAt(i + 1) == '0'){
							dartScore = 10;
							i++;
						}
					}
					stack.push(dartScore);
					break;
				}
	        }
	        
	        for(int data : stack){
	        	answer += data;
	        }
	        
	        return answer;
	    }
}
