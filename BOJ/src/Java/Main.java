package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] coinType = new int[scanner.nextInt()];
		int k = scanner.nextInt();
		for(int i = 0; i < coinType.length; i++)
			coinType[i] = scanner.nextInt();
		scanner.close();
		
		int count = 0;
		for(int i = coinType.length-1; i >=0; i--){
			if(k/coinType[i] != 0){
				count += k/coinType[i];
				k %= coinType[i];
			}
		}
		System.out.println(count);
	}
}
