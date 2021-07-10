package NWT;

import java.util.Arrays;

public class Problem_1 {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{13000, 88000, 10000}, new int[]{30, 20}));
        System.out.println(solution(new int[]{32000, 18000, 42500}, new int[]{50, 20, 65}));
    }

    public static int solution(int[] prices, int[] discounts) {
        int answer = 0;

        Arrays.sort(prices);
        Arrays.sort(discounts);

        int min = Math.min(prices.length, discounts.length);

        for (int i = 0; i < min; i++) {
            int discount = discounts[discounts.length - 1 - i];
            int price = prices[prices.length - 1 - i];
            prices[prices.length - 1 - i] = price - (price * discount/100);
        }

        for (int price : prices) {
            answer += price;
        }

        return answer;
    }
}
