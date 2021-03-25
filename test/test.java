import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    @DisplayName("Startup Coding Festival 2021 모의 테스트 문제 1")
    void test1(){
        int a, b;
        a = 37;
        b = 4;

        int sum = 0;
        int result = 0;
        while(true){
            sum = a-b+1;
            result++;
            if(sum <= b) break;

            a=sum;
        }
        result++;
        System.out.println(result);
    }
    @Test
    @DisplayName("Startup Coding Festival 2021 모의 테스트 문제 2")
    @RepeatedTest(1000)
    void test2(){
            long n = Long.valueOf((long) (Math.random() * 100));
            long m = Long.valueOf((long) (Math.random() * 100));

            /*long n = 63;
            long m = 63;*/

            long result = 0;

            long result2 = Math.min(n/5, (n+m)/12);
            /* n은 필수 값*/

            /* n 최소 필요 개수*/
            long nCnt = n / 5;

            /* m 필요 개수*/
            long mCnt = m / 7;

            /* n 묶음이 m 묶음보다 작거나 같을 경우*/
            if (nCnt <= mCnt) {
                result = nCnt;
                /* n 묵음이 m 묶음보다 클 경우*/
            } else {
                /* 결과에 최소 묶음 저장 */
                result = mCnt;
                /* 최소 묶음 을 뺀 N 값*/
                long tempN = n - 5*mCnt;
                /* 최소 묶음 을 뺀 M 나머지 값*/
                long tempM = m % 7;

                /* 나머지 추가 값*/
                long tempCnt = (tempN + tempM)/12;

                result += tempCnt;
            }
            /*System.out.println(result);*/

        if(result != result2){
            System.out.println("n : " + n + ", m : " + m + ", result : " + result + ", result 2 : " + result2);
        }
    }
}
