package exam.tranbe;

import java.util.HashSet;

public class Solve2 {
    public static void main(String[] args) {

        System.out.println(solution("abac"));
        System.out.println(solution("abcd"));
        System.out.println(solution("zxzxz"));
    }

    private static int solution(String s) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int j = i; j < s.length(); j++){
                if(stringBuilder.indexOf(String.valueOf(s.charAt(j))) == -1) {
                    stringBuilder.append(s.charAt(j));
                    set.add(stringBuilder.toString());
                }else{
                    break;
                }
            }
        }

        return set.size();
    }
}
