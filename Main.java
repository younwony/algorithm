import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCnt = Integer.valueOf(br.readLine());
        for (int i = 0; i < testCnt; i++) {
            String[] inputNM = br.readLine().split(" ");
            long n = Long.valueOf(inputNM[0]);
            long m = Long.valueOf(inputNM[1]);

            /* n은 필수 값*/

            /* n 최소 필요 개수*/
            long nCnt = n/5;

            /* n+m 개수 */
            long nmCnt = (n+m)/12;

            /**
             * n은 필수로 최소 5개씩은 들어가야한다.
             *
             * 경우의 수
             *
             * 1. n을 5개씩 묶음으로 나눈 값 -> m만 충족되면 최대 교환 가능 개수
             * 2. n만을 12개로 나눌경우 -> m이 없을 때 개수 n+m /12 -> (n:9 + m:3, n:12 + m:0)의 케이스, (n:0 + m:123123)의 케이스의 경우 1번 경우의 수에서 걸러진다.
             *
             * 따라서 n을 5개로 묶은 값과 n+m을 12로 나눈 값의 최솟값을 구하면 된다.
             */
            long result = Math.min(nCnt, (n+m)/12);

            System.out.println(result);
        }
    }
}
