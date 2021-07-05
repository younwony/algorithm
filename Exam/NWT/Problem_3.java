package NWT;

public class Problem_3 {
    public static void main(String[] args) {
        System.out.println(solution("aabcbcd", "abc"));
        System.out.println(solution("aaaaabbbbb", "ab"));
    }

    public static int solution(String s, String t) {
        int result = 0;

        int tLen = t.length();
        while(true){
            int sLen = s.length();
            s = s.replace(t, "");
            int tCnt = (sLen - s.length()) / tLen;
            if(tCnt == 0){
                break;
            }
            result += tCnt;
        }

        return result;
    }
}
