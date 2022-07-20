package challenge.skill_check.level_2;

public class solve_2 {
    public static void main(String[] args) {
        System.out.println(solution(new long[]{2,7}));
    }

    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            char[] bis = (0 + Long.toBinaryString(numbers[i])).toCharArray();
            for(int j = bis.length -1; j >=0; j--){
                if(bis[j] == '0'){
                    bis[j] = '1';
                    if(j + 1 != bis.length){
                        bis[j+1] = '0';
                    }
                    break;
                }
            }
            long min = Long.parseLong(new String(bis),2);
            answer[i] = min;
        }
        return answer;
    }
}
