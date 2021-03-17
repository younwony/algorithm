package Programmers.Level_2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(2, 10, new int[]{7,4,5,6}));
        System.out.println(solution.solution(100, 100, new int[]{100}));
        System.out.println(solution.solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}));
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        /* 결과 값 */
        int answer = 0;

        /* 다리에 있는 트럭을 저장할 큐 */
        Queue<Integer> bridege = new LinkedList<>();

        /* 하나의 트럭씩 보내기 */
        for (int truck : truck_weights) {

            /* 트럭이 다리에 진입할 때 까지의 loop */
            while(true){
                /* 다리 위에 트럭이 없을 경우 */
                if(bridege.isEmpty()){
                    /* 다리 위에 트럭 추가 */
                    bridege.offer(truck);
                    /* 결과 값에 시간(1초) 추가 */
                    answer++;
                    /* 종료 */
                    break;

                /* 다리 위에 트럭이 있을 경우 */
                }else{

                    /* 다리 위에 트럭이 꽉차있을 경우 */
                    if(bridege.size() == bridge_length){
                        /* 다리 위에서 트럭 내보내기 */
                        bridege.poll();
                    }

                    /* 현재 다리 무게 */
                    int bridegeWeight = getBridegeWeight(bridege);

                    /* 현재 다리 무게(bridegeWeight) 에 새로운 트럭(truck)이 들어갈 때 다리(weight) 버틸 수 있을 때*/
                    if(bridegeWeight + truck <= weight){
                        /* 다리 위에 트럭 추가 */
                        bridege.offer(truck);
                        /* 결과 값에 시간(1초) 추가 */
                        answer++;
                        /* 종료 */
                        break;

                    /* 현재 다리 무게(bridegeWeight) 에 새로운 트럭(truck)이 들어갈 때 다리(weight) 버틸 수 없을 때*/
                    }else if(bridegeWeight + truck > weight){
                        /* 시간 측정을 위한 0 무게를 가지는 트럭 추가 */
                        bridege.offer(0);
                        /* 결과 값에 시간(1초) 추가 */
                        answer++;
                    }
                }

            }
        }

        /* 마지막 트럭이 진입한 후 현재시간(answer)에 다리의 길이(bridge_length)를 더해서 시간을 구한다.*/
        return answer + bridge_length;
    }

    /* 현재 다리 위 무게 합계 */
    private int getBridegeWeight(Queue<Integer> bridege) {
        int result = 0;
        for (Integer integer : bridege) {
            result += integer;
        }
        return result;
    }
}