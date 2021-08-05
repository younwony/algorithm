package me.wony.challenge_5;

public class solve_1 {

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for(; left <= right; left++){
            answer = isOdd(left) ? answer - left : answer + left;
        }
        return answer;
    }

    private static boolean isOdd(int left) {
        int sqrt = (int) Math.sqrt(left);

        return Math.pow(sqrt,2) == left;
    }
}
