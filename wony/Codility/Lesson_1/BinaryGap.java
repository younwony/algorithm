package Lesson_1;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(32));
    }

    public static int solution(int N) {
        int result = 0;

        String binaryString = Integer.toBinaryString(N);

        for(int i = 0; i < binaryString.length(); i++){
            char charAt = binaryString.charAt(i);
            if(charAt == '1'){
                int len = 0;
                for(int j = i+1; j < binaryString.length(); j++){
                    char at = binaryString.charAt(j);
                    if(at == '0'){
                        len++;
                        if(j == binaryString.length() - 1){
                            len = 0;
                        }
                    }

                    if(at == '1'){
                        i = j - 1;
                        break;
                    }
                }
                result = Math.max(result, len);
            }
        }

        return result;
    }
}
