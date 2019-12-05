package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		int count = 0;
		if(n == 1)
			count = 1;
		else if(n == 2){
			if(m <= 6){
				count = (m+1)/2;
			}else
				count = 4;
		}else{
			if(m <= 4){
				count = m;
			}else if(m <= 6){
				count = 4;
			}else
				count = m-2;
		}
		System.out.println(count);
	}
}
