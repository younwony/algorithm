package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= 2*n -1; i++){
			if(i <= n){
				for(int j = 1; j <= n-i + (2*i-1); j++){
					if(j <= n-i){System.out.print(" ");}
					else{System.out.print("*");}
				}
			}else{
				for(int j = 1; j <= 2*n-1-(i-n); j++){
					if(j <= i-n){System.out.print(" ");}
					else{System.out.print("*");}
				}
			}
			System.out.println();
		}
	}
}



