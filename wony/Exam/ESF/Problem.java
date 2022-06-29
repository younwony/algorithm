package ESF;

public class Problem {
    public static void main(String[] args) {
        System.out.println(solution("101", "10100010101101100"));
        System.out.println(solution("110", "110110110"));
        System.out.println(solution("000", "00000000"));
        System.out.println(solution("00", "1111111"));
    }

    public static int solution(String p, String s) {
        int answer = 0;
        int cnt = 0;

        int indexP = 0;
        int indexS = 0;

        while(indexS < s.length()){
            char cS = s.charAt(indexS);
            char cP = p.charAt(indexP);

            if(cS == cP){
                indexS++;
                indexP++;
            }else{
                indexS++;
            }

            if(indexP == p.length()){
                cnt++;
                indexP = 0;
            }
        }


        answer = s.length() - p.length() * cnt;

        if (answer == s.length()){
            answer = -1;
        }
        return answer;
    }
}
