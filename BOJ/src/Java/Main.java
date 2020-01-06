package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCount = scanner.nextInt();
		HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		int start, end, nowTime;
		int count = 0;
		for(int i = 0; i < testCount; i++){
			start = scanner.nextInt();
			end = scanner.nextInt();
			map.put(end, start);
		}
		scanner.close();
		
		ArrayList<Integer> endTime = new ArrayList<Integer>(map.keySet());
		endTime.sort(null);
		nowTime = 0;
		for(int i = 0; i < endTime.size(); i++){
			if(nowTime <= map.get(endTime.get(i))){
				nowTime = endTime.get(i);
				count++;
			}
		}
		System.out.println(count);
	}
}
