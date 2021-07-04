package SixShop;

import java.util.LinkedList;
import java.util.Queue;

public class Problem_4 {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{4,2,2,5,3}));
        System.out.println(solution(1, new int[]{100,1,50,1,1}));
    }

    static int index;

    public static int[] solution(int N, int[] coffee_times) {
        int[] answer = new int[coffee_times.length];

        index = 0;

        Queue<Coffee> wait = new LinkedList<>();
        for (int i = 0; i < coffee_times.length; i++) {
            wait.add(new Coffee(coffee_times[i], i));
        }

        Queue<Coffee> machine = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        while(!wait.isEmpty()){
            Coffee coffee = wait.poll();
            machine.add(coffee);
            if(machine.size() == N){
                solvedMachine(answer, machine, min);
                min = Integer.MAX_VALUE;
            }
        }
        while(!machine.isEmpty()) {
            solvedMachine(answer, machine, min);
        }

        return answer;
    }

    private static void solvedMachine(int[] answer, Queue<Coffee> machine, int min) {
        for (Coffee machineCoffie : machine) {
            min = Math.min(min, machineCoffie.time);
        }

        for(int i = 0; i < machine.size(); i++){
            Coffee poll = machine.poll();
            poll.time -= min;
            if(poll.time == 0){
                answer[index++] = poll.index + 1;
            }else{
                machine.add(poll);
            }
        }
    }

    static class Coffee {
        int time;
        int index;

        public Coffee(int time, int index) {
            this.time = time;
            this.index = index;
        }
    }
}
