package Programmers.Level_1.신규아이디추천;

public class Solution {

    public String solution(String new_id) {
        //1
        String s = new_id.toLowerCase();
        //2
        String s2 = s.replaceAll("[^a-z.\\-_]", "");
        //3
        while(s2.indexOf("..") > -1){
            s2 = s2.replace("..", ".");
        }
        String s3 = s2;
        //4
        if(s3.charAt(0) == '.') {
            s3 = s3.substring(1);
        }
        if(s3.charAt(s3.length()-1) == '.') {
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

    /**
     * Best Practice
     */
    public String BestSolution(String new_id) {
        String answer = "";
        /*
         * 1. 대문자 -> 소문자 치환
         * */
        String temp = new_id.toLowerCase();

        /*
         * 2. 소문자, 숫자, -, _, . 를 제외한 문자 제거
         * */
        temp = temp.replaceAll("[^-_.a-z0-9]","");

        /*
         * 3. .문자 2번 연속 -> . 하나로 치환
         * */
        temp = temp.replaceAll("[.]{2,}",".");

        /*
         * 4. .문자 처음이나 끝에 위치할 경우 제거
         * */
        temp = temp.replaceAll("^[.]|[.]$","");

        /*
         * 5. 빈 문자열 -> a 대입
         * */
        if(temp.equals(""))
            temp+="a";

        /*
         * 6. 문자열이 16자 이상이면 15문자를 제외한 나머지 문자 제거, 제거 후 . 문자가 마지막 문자면 .문자 제거
         * */
        if(temp.length() >=16){
            temp = temp.substring(0,15);
            temp=temp.replaceAll("^[.]|[.]$","");
        }

        /*
         * 7. 문자열이 2자 이하라면, 문자열의 마지막 문자를 길이가 3자 될때까지 반복
         * */
        if(temp.length()<=2)
            while(temp.length()<3)
                temp+=temp.charAt(temp.length()-1);

        answer=temp;
        return answer;
    }
}
