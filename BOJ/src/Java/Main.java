package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCase = scanner.nextInt();
		
		int index = -1;
		
		int data;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 0; i < testCase; i++){
			data = scanner.nextInt();
			if(data == 0){
				arrayList.remove(index--);
			}else{
				arrayList.add(data);
				index++;
			}
		}
		
		scanner.close();
		
		int sum = 0;
		for(int i : arrayList){
			sum += i;
		}
		
		System.out.println(sum);
	}
}