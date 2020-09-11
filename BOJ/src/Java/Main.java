package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.sun.xml.internal.ws.util.StringUtils;

public class Main {
	
	
	static char[][] signArray = {{'+','-','*'},{'+','*','-'},{'-','+','*'},{'-','*','+'},{'*','-','+'},{'*','+','-'}};
	
	public static void main(String[] args) {
		
        System.out.println(solution("100-200*300-500+20")); 

    }

	public static long solution(String expression) {
        long answer = Integer.MIN_VALUE;
        
        Queue<Integer> numberList = new LinkedList<Integer>();
        Queue<Character> signList = new LinkedList<Character>();
        
        String number = "";
        
        for(int i = 0; i < expression.length(); i++){
        	char exChar = expression.charAt(i);
        	if(Character.isDigit(exChar)){
        		number += exChar;
        	}else{
        		numberList.offer(Integer.valueOf(number));
        		signList.offer(exChar);
        		number = "";
        	}
        }
        numberList.add(Integer.valueOf(number));
        
        long sum = 0;
        Queue<Integer> numberListTemp = new LinkedList<>();
        Queue<Character> signListTemp = new LinkedList<Character>();
        for(char[] signArrayOne : signArray){
        	sum = 0;
        	numberListTemp.addAll(numberList);
        	signListTemp.addAll(signList);
        	for(char sign : signArrayOne){
        		while(!numberListTemp.isEmpty() || !signListTemp.isEmpty()){
        			if(signListTemp.peek() == sign){
        				int aNumber = numberListTemp.poll();
        				int bNumber = numberListTemp.poll();
        				sum += calculation(aNumber, bNumber, signListTemp.poll());
        			}
        		}
        	}
        	
        	answer = Math.max(Math.abs(sum),answer);
        }
        
        return answer;
    }
	
	public static int calculation(int a, int b, char sign){
		if(sign == '+') return a+b;
		if(sign == '-') return a-b;
		return a*b;
	}
}


