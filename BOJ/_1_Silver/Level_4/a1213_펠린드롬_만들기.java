package _1_Silver.Level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a1213_펠린드롬_만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        int len = input.length();
        int[] uppers = new int[26];
        for(int i = 0; i < len; i++){
            uppers[input.charAt(i) - 'A']++;
        }

        String start = "";
        String end = "";

        // 홀수 일 경우 대문자가 개수가 1이 하나
        if(len % 2 == 1){
            if(getOddCnt(uppers) == 1){
                char middle = ' ';
                for (int i = 0; i < uppers.length; i++) {
                    char str = (char)(i + 'A');
                    if(uppers[i] % 2 == 1){
                        middle = str;
                    }
                    for (int j = 0; j < uppers[i] / 2; j++) {
                            start = start + str;
                            end = str + end;
                    }
                }

                start += middle;
            }else{
                System.out.println("I\'m Sorry Hansoo");
                return;
            }
        }else{
            for (int i = 0; i < uppers.length; i++) {
                char str = (char)(i + 'A');
                for (int j = 0; j < uppers[i] / 2; j++) {
                    start = start + str;
                    end = str + end;
                }
            }
        }

        String result = start + end;
        if("".equals(result)){
            System.out.println("I\'m Sorry Hansoo");
            return;
        }
        System.out.println(result);
    }

    private static int getOddCnt(int[] uppers) {
        int odd = 0;
        for (int upper : uppers) {
            if(upper % 2 == 1){
                odd++;
            }
        }
        return odd;
    }
}
