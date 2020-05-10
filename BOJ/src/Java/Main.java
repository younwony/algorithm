package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] ab = scanner.nextLine().split(" ");
		String[] a = ab[0].split("");
		String[] b = ab[1].split("");
		
		scanner.close();
		
		long aSum = 0;
		long bSum = 0;
		for(int i = 0 ; i< a.length; i++) {
			aSum += Integer.parseInt(a[i]);
		}
		for(int i = 0 ; i< b.length; i++) {
			bSum += Integer.parseInt(b[i]);
		}
		
		System.out.println(aSum*bSum);
	}
}