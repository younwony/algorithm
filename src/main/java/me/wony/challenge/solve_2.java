package me.wony.challenge;

import java.util.LinkedList;
import java.util.Queue;

public class solve_2 {

    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
    }

    private static int solution(String s) {
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0 ; i < s.length(); i++){
            queue.add(s.charAt(i));
        }
        for(int i = 0 ; i < s.length(); i++){
            if(isRight(toString(queue))) answer++;
            queue.add(queue.poll());
        }
        return answer;
    }

    private static String toString(Queue<Character> queue) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : queue) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }

    private static boolean isRight(String s) {

        while(true){
            int size = s.length();
            s = s.replace("[]", "").replace("()", "").replace("{}", "");
            if(size == s.length()) break;
        }

        return "".equals(s);
    }
}
