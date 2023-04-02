package easy;

public class PermMissingElem {

    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        int n = A.length + 1;
        int total = (n * (n + 1)) / 2;
        return total - sum;
    }
}
