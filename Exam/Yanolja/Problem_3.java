package Yanolja;

public class Problem_3 {
    public static void main(String[] args) {
        System.out.println(solution("23"));
        System.out.println(solution("0081"));
        System.out.println(solution("022"));
    }

    public static int solution(String S) {
        // write your code in Java SE 8
        int sSum = getStrSum(S);

        int result = sSum % 3 == 0 ? 1 : 0;

        for (int i = 0; i < S.length(); i++) {
            int sIndexInt = S.charAt(i) - '0';

            int tempSum = sSum - sIndexInt;

            for (int j = 0; j < 10; j++) {
                if(sIndexInt != j){
                    if((tempSum + j)%3 == 0){
                        result++;
                    }
                }
            }
        }

        return result;
    }

    private static int getStrSum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
             sum += s.charAt(i) - '0';
        }

        return sum;
    }
}
