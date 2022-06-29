package Yanolja;

public class Problem_4 {
    public static void main(String[] args) {

        System.out.println(solution(6,1,1));
        System.out.println(solution(1,3,1));
        System.out.println(solution(0,1,8));
    }

    static char[] strArray;
    static boolean[] visited;
    static String result;

    public static String solution(int A, int B, int C) {
        // write your code in Java SE 8
        result = "";

        int sum = A + B + C;
        strArray = new char[sum];
        visited = new boolean[sum];

        for (int i = 0; i < sum; i++) {
            char ch;
            if(i < A){
                ch = 'a';
            }else if(i < A+B){
                ch = 'b';
            }else{
                ch = 'c';
            }
            strArray[i] = ch;
        }

        dfs(0,"");

        return result;
    }

    private static void dfs(int index, String str) {

        if(index == strArray.length){
            return;
        }

        for (int i = 0; i < strArray.length; i++) {
            if(!visited[i]){
                String nextStr = str + strArray[i];
                if(isNonConStr(nextStr)){
                    solvedCheck(nextStr);
                    visited[i] = true;
                    dfs(index+1, nextStr);
                    visited[i] = false;
                }
            }
        }
    }


    private static boolean isNonConStr(String str) {

        if(str.indexOf("aaa") > -1){
            return false;
        }

        if(str.indexOf("bbb") > -1){
            return false;
        }

        if(str.indexOf("ccc") > -1){
            return false;
        }

        return true;
    }

    private static void solvedCheck(String nextStr) {
        if(nextStr.length() > result.length()){
            result = nextStr;
        }
    }
}
