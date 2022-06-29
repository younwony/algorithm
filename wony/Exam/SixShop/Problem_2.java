package SixShop;

import java.util.Arrays;

public class Problem_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,2,1}));
        System.out.println(solution(new int[]{3,2,1,2}));
    }
    public static int[] solution(int[] grade) {
        int[] answer = new int[grade.length];
        int[] temp = grade.clone();
        Arrays.sort(temp);

        for (int i = 0; i < grade.length; i++) {
            int cnt = 1;
            for (int j = temp.length - 1; j >= 0; j--) {
                if(grade[i] == temp[j]) {
                    break;
                }
                cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
