package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCount = scanner.nextInt();
		ArrayList<MettingRoom> arrayList = new ArrayList<MettingRoom>();
		for(int i = 0; i< testCount; i++){
			arrayList.add(new MettingRoom(scanner.nextInt(), scanner.nextInt()));
		}
		scanner.close();
		Collections.sort(arrayList);
		
		int nowTime = 0;
		int count = 0;
		for(MettingRoom result : arrayList){
			if(nowTime <= result.startTime){
				count++;
				nowTime = result.endTime; 
			}
		}
		System.out.println(count);
	}
}

class MettingRoom implements Comparable<MettingRoom>{
	int startTime;
	int endTime;
	
	public MettingRoom(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	/**
	 * @작성자 wony
	 * @작성일 2020. 1. 8.
	 * @사용처
	 * @param o
	 * @return
	 * 
	 */
	@Override
	public int compareTo(MettingRoom o) {
		// TODO Auto-generated method stub
		if(this.endTime < o.endTime){
			return -1;
		}else if(this.endTime == o.endTime){
			return Integer.compare(this.startTime, o.startTime);
		}
		return 1;
	}
}
