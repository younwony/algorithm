package _1_Silver.Level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a13702_이상한_술집 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int[] person = new int[N];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < person.length; i++) {
            person[i] = Integer.parseInt(bufferedReader.readLine());
            min = Math.min(person[i],min);
        }
        int start = 0;
        int end = min;
        int mid = (start+end)/2;
        while(end >= start){
            mid = (start+end)/2;
            int cnt = getCnt(mid, person);
            if(cnt < K){
                end = mid - 1;
            }
            if(cnt >= K){
                start = mid + 1;
            }
        }
        System.out.println(mid);


    }

    private static int getCnt(int mid, int[] person) {
        int sum = 0;
        for (int p : person) {
            sum += p/mid;
        }
        return sum;
    }
}
