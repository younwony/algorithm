package _0_Bronze.Level_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a1373_2진수_8진수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        StringBuilder result = new StringBuilder();

        int len = input.length();
        int mod = 3 - len % 3;
        for(int i = 0; i < mod; i++){
            input = "0" + input;
        }

        for(int i = 0; i < input.length(); i += 3){
            int digit = 0;
            for(int j = 0; j < 3; j++){
                int num = input.charAt(i + j) - '0';
                num *= Math.pow(2, 2 - j);

                digit += num;
            }
            result.append(digit);
        }

        System.out.println(result.toString());
    }
}
