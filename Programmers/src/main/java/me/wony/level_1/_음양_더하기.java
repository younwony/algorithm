package me.wony.level_1;

public class _음양_더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++){
            answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i];
        }
        return answer;
    }
}
