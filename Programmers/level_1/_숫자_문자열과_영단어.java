package level_1;

public class _숫자_문자열과_영단어 {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }

    public static int solution(String s) {
        int answer = 0;

        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < arr.length; i++) {
            s = s.replace(arr[i], Integer.toString(i));
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}
