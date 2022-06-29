package me.wony.challenge_5;

public class solve_3 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"1110","100111100","0111111010"}));
//        System.out.println(solution(new String[]{"0"}));
//        System.out.println(solution(new String[]{"1"}));
//        System.out.println(solution(new String[]{"10"}));
//        System.out.println(solution(new String[]{"01"}));
//        System.out.println(solution(new String[]{"0111111010"}));
    }

    public static String[] solution(String[] s) {
        String REPLACE = "110";
        String[] answer = new String[s.length];
        for(int i = 0 ; i < answer.length; i++){
            String temp = s[i];
            while(temp.indexOf(REPLACE) > -1) {
                temp = temp.replace(REPLACE, "");
            }
            int replaceCnt = (s[i].length() - temp.length())/3;

            StringBuilder re = new StringBuilder();
            String substring = "";
            String substring2 = temp;
            int index1 = temp.indexOf("1");
            if(index1 > -1){
                substring = temp.substring(0, index1);
                substring2 = temp.substring(index1);
            }
            re.append(substring);
            for(int j = 0; j < replaceCnt; j++){
                re.append(REPLACE);
            }
            re.append(substring2);

            System.out.println(re.toString());
            answer[i] = temp;
        }
        return answer;
    }
}
