package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testCount = scanner.nextInt();
		int h,w,n,floor;
		String ho;
		for(int i = 0; i < testCount; i++) {
			h = scanner.nextInt();
			w = scanner.nextInt();
			n = scanner.nextInt();
			floor = n%h == 0 ? h : n%h;
			ho = (((n-1)/h)+1) < 10 ? "0" + (((n-1)/h)+1) : String.valueOf((((n-1)/h)+1));
			System.out.println(floor + ho);
		}
	}
	
}
