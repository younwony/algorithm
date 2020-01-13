package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		DP(n, m);
		
		System.out.println(count);
	}
	
	public static void DP(int n, int m){
		if(n == 1 && m == 1){
			return ;
		}else if(n == 1){
			count += m-1;
			return ;
		}else if(m == 1){
			count += n-1;
			return ;
		}
		if(n < m){
			count++;
			if(m%2 == 1){
				DP(n, m/2);
				DP(n, (m/2)+1);
			}else{
				DP(n, m/2);
				DP(n, m/2);
			}
		}else{
			count++;
			if(n%2 == 1){
				DP(n/2, m);
				DP(n/2+1, m);
			}else{
				DP(n/2, m);
				DP(n/2, m);
			}
		}
	}
}



