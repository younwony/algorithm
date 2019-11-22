package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
		int testCount = scanner.nextInt();
		
		int documentSize, count, resultLocation;
		
		for(int i = 0; i< testCount; i++){
			Queue<Integer> queue = new LinkedList<Integer>();
			documentSize = scanner.nextInt();
			resultLocation = scanner.nextInt();
			for(int j = 0; j < documentSize; j++)
				queue.offer(scanner.nextInt());
			
			count = 0;
			
			while(resultLocation != -1){
				if(queueGreateThenData(queue)){
					if(resultLocation == 0) resultLocation += queue.size();
					else{
						queue.offer(queue.poll());
						resultLocation--;
					}
				}else{
					count++;
					if(resultLocation == 0){
						System.out.println(count);
					}else{
						queue.poll();
					}
					resultLocation--;
				}
			}
			
		}
		scanner.close();
	}
	
	public static boolean queueGreateThenData(Queue<Integer> queue){
		
		int data = queue.peek();
		
		while(data != 9){
			data++;
			if(queue.contains(data))
				return true;
		}
		
		return false;
	}
}
