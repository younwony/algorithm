package SixShop;

public class Problem_1 {
    public static void main(String[] args) {
//        System.out.println(solution("xyZA", "ABCxy"));
        System.out.println(solution("AxA", "AyA"));
    }

    static String answer = "";
    public static String solution(String s1, String s2) {
        answer = s1 + s2;
        solved(s1, s2);
        solved(s2, s1);

        return answer;
    }

    private static void solved(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            String substring = s1.substring(i);
            if(s2.startsWith(substring)){
                String s = s1.substring(0, i) + s2;
                compare(s);
            }
        }
    }

    private static void compare(String s) {
        if(s.length() < answer.length()){
            answer = s;
        }
        if(s.length() == answer.length() && s.compareTo(answer) < 0){
            answer = s;
        }
    }

}
