package Programmers.Level_1.신규아이디추천;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test(){
        //String new_id = "...!@BaT#*..y.abcdefghijklm";
        //String new_id = "z-+.^.";
        //String new_id = "=.=";
        //String new_id =	"123_.def";
        //String new_id = "abcdefghijklmn.p";
        String new_id = "abcdefghijklmn.";

        String answer = getString(new_id);
        while(answer != getString(answer)){
            answer = getString(answer);
        }
        System.out.println(answer);
    }

    private String getString(String new_id) {
        //1
        String s = new_id.toLowerCase();
        //2
        String s2 = s.replaceAll("[^0-9a-z.\\-_]", "");
        //3
        while(s2.indexOf("..") > -1){
            s2 = s2.replace("..", ".");
        }
        String s3 = s2;
        //4
        if(s3.charAt(0) == '.') {
            s3 = s3.substring(1);
        }
        if(s3.length() > 0 && s3.charAt(s3.length()-1) == '.') {
            s3 = s3.substring(0, s3.length()-1);
        }
        //5
        String s4 = s3;
        if("".equals(s3)) s4 = "a";

        //6
        String s5 = s4;
        if(s4.length() >= 16){
            s5 = s4.substring(0, 15);
        }

        //7
        String s6 = s5;
        while(s6.length() <= 2){
            char c = s6.charAt(s6.length()-1);
            s6 += c;
        }

        String answer = s6;
        return answer;
    }
}