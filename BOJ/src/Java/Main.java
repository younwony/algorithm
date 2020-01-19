package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean nextCheck = true;
		
		for(int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		while(!queue.isEmpty()) {
			if(nextCheck) {
				System.out.print(queue.poll() + " ");
			}else {
				queue.offer(queue.poll());
			}
			nextCheck = !nextCheck;
		}
		
	}
}



