package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String testNum = scanner.nextLine();
		
		scanner.close();
		
		String n,m;
		
		boolean isResult = false;
		
		for(int i = 0; i < testNum.length(); i++) {
			n = testNum.substring(0,i);
			m = testNum.substring(i, testNum.length());
			if(isEqual(n, m)) {
				isResult = true;
				break;
			}
		}
		
		System.out.println(isResult ? ("1".equals(testNum) ? "NO" :"YES") : "NO");
	}
	
	public static boolean isEqual(String n, String m) {
		int nCount = 1;
		int mCount = 1;
		
		for(int i = 0; i < n.length(); i++) {
			nCount *= n.charAt(i) - '0';
		}
		for(int i = 0; i < m.length(); i++) {
			mCount *= m.charAt(i) - '0';
		}
		
		return nCount == mCount;
	}
}