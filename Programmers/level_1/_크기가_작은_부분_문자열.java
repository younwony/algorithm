package level_1;

import java.math.BigInteger;

public class _크기가_작은_부분_문자열 {
    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("2", "1"));
    }

    public static int solution(String t, String p) {
        int answer = 0;
        BigInteger pBig = new BigInteger(p);
        for(int i = 0; i < t.length() - p.length() + 1; i++) {
            String substring = t.substring(i, i + p.length());
            BigInteger bigInteger = new BigInteger(substring);
            if(bigInteger.compareTo(pBig) < 1) {
                answer++;
            }
        }

        return answer;
    }
}
