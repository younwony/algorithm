package NWT;

import java.util.ArrayList;
import java.util.Stack;

public class Problem_2 {
    public static void main(String[] args) {
        System.out.println(solution("abcxyasdfasdfxyabc"));
        System.out.println(solution("abcxyqwertyxyabc"));
        System.out.println(solution("llttaattll"));
    }

    public static String[] solution(String s) {

        ArrayList<String> startList = new ArrayList<>();
        Stack<String> endStack = new Stack<>();

        for(int i = 1; i < s.length(); i++){

            String startStr = s.substring(0, i);

            if(s.endsWith(startStr)){
                startList.add(startStr);
                endStack.add(startStr);
                s = s.substring(i, s.length() - i);
                i = 0;
            }
        }

        if(!"".endsWith(s)){
            startList.add(s);
        }

        while(!endStack.isEmpty()){
            startList.add(endStack.pop());
        }

        return startList.toArray(new String[startList.size()]);
    }
}
