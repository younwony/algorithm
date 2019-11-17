package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); // 인원
		
		int K = scanner.nextInt(); // K순서
		
		scanner.close();
		
		Deque<Integer> deque = new ArrayDeque<Integer>(); 
		
		for(int i = 1; i <= N; i++)
			deque.offer(i);
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("<");
		
		while(deque.size() != 0) {
			for(int i = 1; i < K; i++) 
				deque.offer(deque.poll());
			builder.append(deque.poll() + ", ");
		}
		
		builder.replace(builder.length()-2, builder.length(),"");
		
		builder.append(">");
		
		System.out.println(builder.toString());
	}
}
