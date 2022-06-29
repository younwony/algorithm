package me.wony.challenge;

public class solve_1 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,7,12}, new boolean[]{true, false, true}));
    }

    private static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            int absolute = absolutes[i];
            if(signs[i]) answer += absolute;
            else answer -= absolute;
        }
        return answer;
    }
}
