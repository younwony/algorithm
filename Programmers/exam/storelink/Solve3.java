package exam.storelink;

public class Solve3 {
    public static void main(String[] args) {
        System.out.println(solution("a"));
        System.out.println(solution("aaaa"));
        System.out.println(solution("abcdcba"));
        System.out.println(solution("abacde"));
    }

    private static int solution(String s)
    {
        int maxPalindrome = 0;

        for (int i = 0; i < s.length(); i++) {

            int oddPalindrome = getOddPalindrome(s, i);
            int evenPalindrome = getEvenPalindrome(s, i);

            maxPalindrome = Math.max(maxPalindrome, Math.max(evenPalindrome, oddPalindrome));

        }
        return maxPalindrome;
    }

    private static int getEvenPalindrome(String s, int i) {
        int evenPalindrome = 0;

        int j = 0;

        while(i - j >= 0 && i + j + 1 < s.length() && s.charAt(i - j) == s.charAt(i + j + 1)){
            evenPalindrome += 2;
            j++;
        }
        return evenPalindrome;
    }

    private static int getOddPalindrome(String s, int i) {
        int oddPalindrome = 1;

        int j = 1;

        while(i - j >= 0 && i + j < s.length() && s.charAt(i - j) == s.charAt(i + j)){
            oddPalindrome += 2;
            j++;
        }
        return oddPalindrome;
    }
}
