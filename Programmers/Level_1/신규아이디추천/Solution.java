package Programmers.Level_1.신규아이디추천;

public class Solution {

    public String solution(String new_id) {

        String answer = "";

        /*
         * 1. 대문자 -> 소문자 치환
         * */
        answer = new_id.toLowerCase();

        /*
         * 2. 소문자, 숫자, -, _, . 를 제외한 문자 제거
         * */
        answer = answer.replaceAll("[^0-9a-z.\\-_]", "");

        /*
         * 3. .문자 2번 연속 -> . 하나로 치환
         * */
        while(answer.indexOf("..") > -1){
            answer = answer.replace("..", ".");
        }

        /*
         * 4. .문자 처음이나 끝에 위치할 경우 제거
         * */
        if(answer.charAt(0) == '.') {
            answer = answer.substring(1);
        }
        if(answer.length() > 0 && answer.charAt(answer.length()-1) == '.') {
            answer = answer.substring(0, answer.length()-1);
        }

        /*
         * 5. 빈 문자열 -> a 대입
         * */
        if("".equals(answer)) answer = "a";

        /*
         * 6. 문자열이 16자 이상이면 15문자를 제외한 나머지 문자 제거, 제거 후 . 문자가 마지막 문자면 .문자 제거
         * */
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
        }
        if(answer.length() > 0 && answer.charAt(answer.length()-1) == '.') {
            answer = answer.substring(0, answer.length()-1);
        }

        /*
         * 7. 문자열이 2자 이하라면, 문자열의 마지막 문자를 길이가 3자 될때까지 반복
         * */
        while(answer.length() <= 2){
            char c = answer.charAt(answer.length()-1);
            answer += c;
        }

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
