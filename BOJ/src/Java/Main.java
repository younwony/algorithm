package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		 int n = scanner.nextInt();
		 int m = scanner.nextInt();
		 int k = scanner.nextInt();
		 
		 scanner.close();
		 
		 while(k != 0){
			 if((double)n/2 >= m) n--;
			 else m--;
			 k--;
		 }
		 
		 System.out.println(n/2 > m ? m : n/2);
	}
}
