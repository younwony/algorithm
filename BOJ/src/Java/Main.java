package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < testCount; i++) {
			
			String[] order = scanner.nextLine().split("");
			int testDataCount = Integer.parseInt(scanner.nextLine());
			String data = scanner.nextLine();
			String[] dataArray = data.substring(1, data.length()-1).split(",");
			Deque<Integer> deque = new ArrayDeque<Integer>();
			boolean reverse = false;
			
			for(int j = 0; j < testDataCount; j++)
				deque.offer(Integer.parseInt(dataArray[j]));
			int k = 0;
			int oL = order.length;
			for(k = 0; k < oL; k++) {
				if("R".equals(order[k])) reverse = !reverse;
				if("D".equals(order[k])) {
					if(deque.isEmpty())	break;
					if(reverse) deque.pollLast();
					else deque.poll();
				}
			}
			
			if(k < oL) System.out.println("error");
			else {
				StringBuilder builder = new StringBuilder();
				String result;
				builder.append("[");
				while(!deque.isEmpty()) {
					if(reverse)	builder.append(deque.pollLast() + ",");
					else builder.append(deque.poll() + ",");
				}
				if(builder.length() > 1) result = builder.substring(0,builder.length()-1);
				else result = builder.toString();
				result += "]";
				System.out.println(result);
			}
		}
		
		scanner.close();
	}
}
