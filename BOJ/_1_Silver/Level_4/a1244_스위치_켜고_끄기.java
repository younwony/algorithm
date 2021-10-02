package _1_Silver.Level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1244_스위치_켜고_끄기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int switchCnt = Integer.parseInt(bufferedReader.readLine());
        boolean[] switches = new boolean[switchCnt + 1];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i < switches.length; i++) {
            switches[i] = "1".equals(stringTokenizer.nextToken());
        }

        int studentCnt = Integer.parseInt(bufferedReader.readLine());
        while(studentCnt-- > 0){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int sex = Integer.parseInt(stringTokenizer.nextToken());
            int switchIndex = Integer.parseInt(stringTokenizer.nextToken());

            if(sex == 1){
                for(int i = 1; i * switchIndex < switches.length; i++){
                    switches[i * switchIndex] = !switches[i * switchIndex];
                }
            }else{
                for(int i = 0; i <= switchCnt/2; i++){
                    try {
                        if(switches[switchIndex - i] == switches[switchIndex + i]){
                            switches[switchIndex - i] = !switches[switchIndex - i];
                            switches[switchIndex + i] = !switches[switchIndex + i];
                        }else{
                            break;
                        }
                    }catch (ArrayIndexOutOfBoundsException e){
                        break;
                    }
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < switches.length; i++) {
            stringBuilder
                    .append(switches[i] ? 1 : 0)
                    .append(" ");
        }

        System.out.println(stringBuilder.toString());
    }
}
