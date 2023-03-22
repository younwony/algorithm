package Lesson_2;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
    }

    private static String[] words = {"aya", "ye", "woo", "ma"};
    private static Set<String> wordItem = new HashSet<>();
    public static int solution(String[] babbling) {
        int answer = 0;
        setWordSet("", 0);

        for (String babble : babbling) {
            if(wordItem.contains(babble)){
                answer++;
            }
        }

        return answer;
    }

    private static void setWordSet(String wordSet, int index) {
        if(index == words.length){
            return;
        }

        for (String word : words) {
            String nextWordSet = wordSet + word;
            wordItem.add(nextWordSet);
            setWordSet(nextWordSet, index + 1);
        }
    }
}
