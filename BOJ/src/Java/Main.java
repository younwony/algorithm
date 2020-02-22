package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int L,P,V;
		
		int a,b;
		
		int count = 1;
		while((L=scanner.nextInt()) != 0 && (P=scanner.nextInt()) != 0 && (V=scanner.nextInt()) != 0){
			a = V/P *L;
			b = L > V%P ? V%P : L;
			System.out.println("Case " + count++ + ": " + (a+b));
		}
		
		scanner.close();
	}
}