package me.wony.challenge.weekly;

public class solve_1 {
    public static void main(String[] args) {
        System.out.println(solution(3,20,4));
        System.out.println(solution(2500,1_000_000_000,2500));
    }

    private static long solution(int price, int money, int count) {
        /* count + 1L 인 이유는 Long으로 형변환 하지않으면 Int형으로 판별되어 Int Max Value 이상의 값은 오버플로우 된다. */
        long answer = (count * (count+1L) / 2) * price - money;

        return answer < 0 ? 0 : answer;
    }
}
