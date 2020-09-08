package Kakao.Problem_2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

import Java.Main.person;

public class 실패율 {
public static void main(String[] args) {
		
		int N;
		int[] stages;
		N = 5;
		stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(solution(N, stages));
        N = 4;
        stages = new int[]{4,4,4,4,4};
        System.out.println(solution(N, stages));

    }

	public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        int personCnt = stages.length;
        
        int[] stagePersonCnt = new int[N + 1];
        for(int stage : stages){
        	if(stage == N+1) continue;
        	stagePersonCnt[stage]++;
        }
        
        ArrayList<person> failDiv = new ArrayList<>();
        
        double div;
        for(int i = 1 ; i < N + 1; i++ ){
        	div = personCnt <= 0 ? 0 : stagePersonCnt[i]/(double)personCnt; 
        	failDiv.add(new person(i, div));
        	personCnt -= stagePersonCnt[i];
        }
        
        Collections.sort(failDiv, new person());
        
        for(int i = 0 ;i < N; i++){
        	answer[i] = failDiv.get(i).index;
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
	
	public static class person implements Comparator<person>{
		int index;
		double div;
		
		public person(int index, double div) {
			super();
			this.index = index;
			this.div = div;
		}

		public person() {
			super();
		}


		@Override
		public int compare(person o1, person o2) {
			// TODO Auto-generated method stub
			if(o1.div < o2.div){
				return 1;
			}else if(o1.div > o2.div){
				return -1;
			}else{
				return o1.index - o2.index;
			}
		}
	}
}
