package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] result = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		
		int x = 0;
		int y = 0;
		long z = 0;
		String a,b,c;
		a = scanner.nextLine();
		b = scanner.nextLine();
		c = scanner.nextLine();
		for(int i = 0; i < result.length; i++) {
			if(a.equals(result[i])) x = 10*i;
			if(b.equals(result[i])) y = i;
			if(c.equals(result[i])) z = (long)Math.pow(10, i);
		}
		
		scanner.close();
		System.out.println((long)(x+y)*z);
	}
}
