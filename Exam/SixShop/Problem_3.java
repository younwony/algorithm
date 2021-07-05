package SixShop;

public class Problem_3 {
    public static void main(String[] args) {

//        System.out.println(solution(15));
        System.out.println(solution(7));
    }

    public static int solution(int n) {
        int answer = 0;

        int five = n/5;
        n %= 5;
        int three = n/3;
        n %= 3;
        while(true){
            if(n == 0){
                answer = five + three;
                break;
            }
            if(five == 0){
                answer = -1;
                break;
            }

            five--;
            n += three * 3 + 5;
            three = n/3;
            n %= 3;
        }

        return answer;
    }
}
