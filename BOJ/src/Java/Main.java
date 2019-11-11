package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int testCount = Integer.parseInt(bufferedReader.readLine());
			
			int[] deque = new int[testCount];
			
			for(int i = 0; i < testCount; i++)
				deque[i] = 0;
			
			String[] order;
			
			for(int i = 0; i < testCount; i++){
				order = bufferedReader.readLine().split(" ");
				if("push_front".equals(order[0]))
					dequePush_Front(deque, Integer.parseInt(order[1]));
				if("push_back".equals(order[0]))
					dequePush_Back(deque, Integer.parseInt(order[1]));
				if("pop_front".equals(order[0]))
					bufferedWriter.write(dequePop_Front(deque) + "\n");
				if("pop_back".equals(order[0]))
					bufferedWriter.write(dequePop_Back(deque) + "\n");
				if("size".equals(order[0]))
					bufferedWriter.write(dequeSize(deque) + "\n");
				if("empty".equals(order[0]))
					bufferedWriter.write(dequeEmpty(deque) + "\n");
				if("front".equals(order[0]))
					bufferedWriter.write(dequeFront(deque) + "\n");
				if("back".equals(order[0]))
					bufferedWriter.write(dequeBack(deque) + "\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(bufferedReader != null) bufferedReader.close();
				if(bufferedWriter != null) bufferedWriter.flush(); bufferedWriter.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public static void dequePush_Front(int[] deque, int data){
		for(int i = deque.length -1; i > 0; i--){
			deque[i] = deque[i-1];
		}
		deque[0] = data;
	}
	
	public static void dequePush_Back(int[] deque, int data){
		for(int i = 0; i < deque.length; i++){
			if(deque[i] == 0){
				deque[i] = data;
				break;
			}
		}
	}
	
	public static int dequePop_Front(int[] deque){
		int data = deque[0] == 0 ? -1 : deque[0];
		
		for(int i = 0; i < deque.length - 1; i++)
			deque[i] = deque[i+1];
			
		return data;
	}
	
	public static int dequePop_Back(int[] deque){
		
		int data = -1;
		
		for(int i = deque.length-1; i>= 0; i--){
			if(deque[i] != 0){
				data = deque[i];
				deque[i] = 0;
				break;
			}
		}
		return data;
	}
	
	public static int dequeSize(int[] deque){
		int dequeSizeCount = 0;
		for(int i = 0; i < deque.length; i++){
			if(deque[i] != 0)
				dequeSizeCount++;
		}
		return dequeSizeCount;
	}	
	
	public static int dequeEmpty(int[] deque){
		return deque[0] == 0 ? (deque[deque.length-1] == 0 ? 1 : 0) : 0;
	}
	
	public static int dequeFront(int[] deque){
		return deque[0] == 0 ? -1 : deque[0];
	}
	
	public static int dequeBack(int[] deque){
		int data = -1;
		
		for(int i = deque.length-1; i >=0; i--){
			if(deque[i] != 0){
				data = deque[i];
				break;
			}
		}
		
		return data;
	}
}
