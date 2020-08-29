package Kakao.Problem_2020;

public class 문자열_압축 {
    public static void main(String[] args) {
        // System.out.println(solution("aabbaccc"));
       // System.out.println(solution("ababcdcdababcdcd"));
       // System.out.println(solution("abcbc"));
        System.out.println(solution("abcababcdede"));

    }

    public static int solution(String s) {

        int answer = s.length();

        String replaceStr;
        for(int i = 1; i <= s.length() / 2; i++){
            String result = "";
            for(int j = 0; j + i <= s.length(); j++){
                replaceStr = s.substring(j,j+i);
                int replaceCnt = 1;
                int tempj = j;
                while(j + i <= s.length()){
                    if(j + i + i > s.length()){
                        if(replaceCnt > 1) j -= i;
                        break;
                    }
                    String compareStr = s.substring(j + i, j + i + i);
                    if(replaceStr.equals(compareStr)){
                        j += i;
                        replaceCnt++;
                    }else{
                        break;
                    }
                }

                if(replaceCnt > 1){
                    if("".equals(result)) {
                        result = s.substring(0, tempj) + replaceCnt + replaceStr;
                    }else{
                        result += replaceCnt+replaceStr;
                    }
                    j = tempj;
                    for(int t = 0; t < replaceCnt; t++){
                        j += i;
                    }
                    j--;
                }else if(!"".equals(result) && tempj + i == s.length()){
                    result += s.substring(tempj, tempj + i);
                }else{
                }
            }
            if(!"".equals(result) && result.length() < answer){
                System.out.println(result);
                answer = result.length();
            }
        }

        return answer;
    }
}
