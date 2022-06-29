package Wanted_2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Problem_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        String[] input = bufferedReader.readLine().split(" ");
        ArrayList<Person> personArrayList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            int max = Integer.parseInt(input[i]);
            if (i >= K - 1){
                max--;
            }
            personArrayList.add(new Person(i+1, max));
        }

        Collections.sort(personArrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.max == o2.max){
                    return o1.index - o2.index;
                }
                return o1.max - o2.max;
            }
        });

        StringBuilder result = new StringBuilder();
        for (Person person : personArrayList) {
            result.append(person.index).append(" ");
        }

        System.out.println(result.toString());
    }

    static class Person {
        int index;
        int max;

        public Person(int index, int max) {
            this.index = index;
            this.max = max;
        }

    }
}
