package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCase = Integer.parseInt(scanner.next());
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		
		for(int i = 0; i < testCase; i++) {
			hashMap.put(scanner.next(), scanner.next());
		}
		
		scanner.close();
		
		ArrayList<String> keySet = new ArrayList<String>(hashMap.keySet());
		
		keySet.sort(null);
		Collections.reverse(keySet);
		
		
		for(String key : keySet) {
			if("enter".equals(hashMap.get(key))){
				System.out.println(key);
			}
		}
	}
}