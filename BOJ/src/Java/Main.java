package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		int needNum = scanner.nextInt();
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 0; i < testCase; i++) {
			arrayList.add(scanner.nextInt());
		}
		
		scanner.close();
		
		int count = 0;
		
		arrayList.sort(null);
		
		int index;
		for(int i = 0; i < testCase; i++) {
			
			if(arrayList.get(i) > needNum/2) {
				break;
			}
			
			index = arrayList.indexOf(needNum - arrayList.get(i));
			if(index != -1 && index != i) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
}