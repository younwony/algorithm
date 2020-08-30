package Kakao.Problem_2020;

public class 문자열_압축 {
    public static void main(String[] args) {
        //System.out.println(solution("aabbaccc"));
        //System.out.println(solution("ababcdcdababcdcd"));
        System.out.println(solution("abcabcdede"));

    }

    public static int solution(String s) {

        int answer = s.length();

        for(int i = 1; i <= s.length() / 2; i++){
            String replaceStr = s.substring(0, i);
            String compareStr;
            String result = "";
            int compareCnt = 1;
            int j = 0;
            for(j = i; j <= s.length() - i; j += i){
                compareStr = s.substring(j, j+i);
                if(replaceStr.equals(compareStr)){
                    compareCnt++;
                    continue;
                }
                if(compareCnt > 1){
                    result += (compareCnt+replaceStr);
                }else{
                    result += replaceStr;
                }

                replaceStr = compareStr;
                compareCnt = 1;

            }

            if(compareCnt > 1){
                result += (compareCnt+replaceStr);
            }else{
                result += replaceStr;
            }

            result += s.substring(j, s.length());
            answer = Math.min(result.length(), answer);
        }

        return answer;
    }
}
