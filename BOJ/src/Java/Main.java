package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		scanner.close();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 1 ; i <= n; i++){
			queue.offer(i);
		}
		
		int i = 1;
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("<");
		while(!queue.isEmpty()){
			if(i%k == 0){
				builder.append(queue.poll()+", ");
			}else{
				queue.offer(queue.poll());
			}
			i++;
		}
		builder.delete(builder.lastIndexOf(","), builder.length());
		builder.append(">");
		
		System.out.println(builder.toString());
	}
}