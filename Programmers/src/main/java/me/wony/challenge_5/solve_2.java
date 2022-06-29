package me.wony.challenge_5;

public class solve_2 {

    public static void main(String[] args) {
        System.out.println(solution(new long[]{2,7}));
    }

    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            long number = numbers[i];
            char[] bis = (0 + Long.toBinaryString(number)).toCharArray();
            for(int j = bis.length-1; j >= 0; j--){
                if(bis[j] == '0'){
                    bis[j] = '1';
                    if(j + 1 != bis.length){
                        bis[j + 1] = '0';
                    }
                    break;
                }
            }

            answer[i] = Long.parseLong(new String(bis),2);
        }
        return answer;
    }
}
