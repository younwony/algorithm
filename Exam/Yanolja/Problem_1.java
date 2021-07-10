package Yanolja;

import java.util.Arrays;

public class Problem_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,1,3,5,4}));
        System.out.println(solution(new int[]{1,2,3}));
        System.out.println(solution(new int[]{2,3,4,1,5}));
        System.out.println(solution(new int[]{1,3,4,2,5,100000}));
    }

    public static int solution(int[] A) {
        int result = 0;
        boolean[] nArray = new boolean[100001];
        for (int number : A) {
            nArray[number] = true;
            if(isOn(nArray, number)){
                result++;
            }
        }

        return result;
    }

    private static boolean isOn(boolean[] nArray, int number) {
        for (int i = 1; i < number; i++) {
            if(!nArray[i]){
                return false;
            }
        }
        return true;
    }
}
