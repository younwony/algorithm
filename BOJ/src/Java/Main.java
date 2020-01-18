package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		scanner.close();
		int count = 0;
		for(int i = 0; i < data.length(); i++) {
			if(momo(String.valueOf(data.charAt(i)))) {count++;}
		}
		System.out.println(count);
	}
	
	public static boolean momo(String str) {
		if("a".equals(str) || "e".equals(str) || "i".equals(str) || "o".equals(str) || "u".equals(str)) {return true;}
		else {return false;}
	}
}



