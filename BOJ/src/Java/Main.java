package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		scanner.nextLine();
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		String[] order;
		
		for(int i = 0; i < testCount; i++){
			order = scanner.nextLine().split(" ");
			if("push_front".equals(order[0])) deque.offerFirst(Integer.parseInt(order[1]));
			if("push_back".equals(order[0])) deque.offerLast(Integer.parseInt(order[1]));
			if("pop_front".equals(order[0])) if(deque.isEmpty()) System.out.println(-1); else System.out.println(deque.poll());
			if("pop_back".equals(order[0])) if(deque.isEmpty()) System.out.println(-1); else System.out.println(deque.pollLast());
			if("size".equals(order[0])) System.out.println(deque.size());
			if("empty".equals(order[0])) if(deque.isEmpty()) System.out.println(1); else System.out.println(0);
			if("front".equals(order[0])) if(deque.isEmpty()) System.out.println(-1); else System.out.println(deque.peek());
			if("back".equals(order[0])) if(deque.isEmpty()) System.out.println(-1); else System.out.println(deque.peekLast());
		}
		
		scanner.close();
	}
}
