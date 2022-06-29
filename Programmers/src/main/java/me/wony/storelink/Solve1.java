package me.wony.storelink;

/**
 * 11
 * 22
 * 3462
 * 235516
 */

public class Solve1 {
    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(21));
        System.out.println(solution(3462));
        System.out.println(solution(235386));
    }

    private static int solution(int num) {

        while(true){
            int digit = getDigit(num);

            if(digit % 2 == 1){
                num = (int) Math.pow(10, digit);
                digit++;
            }

            int temp = num;

            int preSum = 1;
            for (int i = digit; i > digit / 2; i--) {
                int digitPow = (int) Math.pow(10, i - 1);
                preSum *= num / digitPow;
                num %= digitPow;
            }

            int postSum = 1;
            for (int i = digit / 2; i > 0; i--) {
                int digitPow = (int) Math.pow(10, i - 1);
                postSum *= num / digitPow;
                num %= digitPow;
            }

            num = temp + 1;

            if(preSum == postSum){
                break;
            }

        }

        return num - 1;
    }

    private static int getDigit(int num) {
        int digit = 0;
        while(num > 0){
            digit++;
            num /= 10;
        }
        return digit;
    }

    private static int solution2(int num) {
        String numStr = getNumStr(String.valueOf(num-1));

        while(true){
            int digit = numStr.length();
            int preSum = 1;
            int postSum = 1;
            for(int i = 0; i < digit/2; i++){
                preSum *= numStr.charAt(i) - '0';
                postSum *= numStr.charAt(digit - i - 1) - '0';
            }

            if(preSum == postSum){
                break;
            }

            numStr = getNumStr(numStr);
        }

        return Integer.parseInt(numStr);
    }

    private static String getNumStr(String numStr) {
        numStr = String.valueOf(Integer.valueOf(numStr) + 1);

        // Num is Odd
        if(numStr.length() % 2 == 1){
            numStr = getNextEvenNumber(numStr.length());
        }

        return numStr;
    }

    private static String getNextEvenNumber(int digit) {
        String number = "1";
        for(int i = 0 ; i < digit; i++){
            number += "0";
        }
        return number;
    }
}
