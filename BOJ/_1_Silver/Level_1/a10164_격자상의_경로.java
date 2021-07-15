package _1_Silver.Level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a10164_격자상의_경로 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] xArray = {0,1};
        int[] yArray = {1,0};

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        int kX = (K-1)/M;
        int kY = (K-1)%M;

        Queue<Point> queue = new LinkedList<>();

        queue.add(new Point(0,0,K == 0 ? true : false));

        int cnt = 0;

        while(!queue.isEmpty()){
            Point point = queue.poll();
            if(point.x == N - 1 && point.y == M - 1){
                if(point.isK) cnt++;
                continue;
            }

            for(int i = 0 ; i < 2; i++){
                int x = point.x + xArray[i];
                int y = point.y + yArray[i];
                boolean isK = point.isK;
                if(x < 0 || y < 0 || x >= N || y >= M){
                    continue;
                }
                if(!isK){
                    isK = x == kX && y == kY;
                }

                queue.add(new Point(x,y,isK));
            }
        }

        System.out.println(cnt);
    }

    static class Point{
        int x;
        int y;
        boolean isK;

        public Point(int x, int y, boolean isK) {
            this.x = x;
            this.y = y;
            this.isK = isK;
        }
    }
}
