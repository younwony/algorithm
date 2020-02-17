package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for(int i = 0; i < 8; i++){
			map.put(scanner.nextInt(), i);
		}
		
		scanner.close();
		
		Iterator<Integer> iterator = map.descendingKeySet().iterator();
		
		StringBuilder builder = new StringBuilder();
		
		int sum =0;
		int score;
		int[] scoreArray = new int[5];
		
		for(int i = 0; i< 5; i++){
			score = iterator.next();
			sum += score;
			scoreArray[i] = map.get(score);
		}
		
		Arrays.sort(scoreArray);
		
		for(int i : scoreArray){
			builder.append(i+1 + " ");
		}
		
		System.out.println(sum);
		System.out.println(builder.toString());
	}
}