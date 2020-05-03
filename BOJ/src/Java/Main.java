package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		boolean[] isCheck = new boolean[31];
		
		isCheck[0] = true;
		
		for(int i = 0 ; i < 28; i++) {
			isCheck[scanner.nextInt()] = true;
		}
		
		for(int i = 0; i < isCheck.length; i++) {
			if(!isCheck[i]){System.out.println(i);}
		}
	}
}