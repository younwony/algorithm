package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int nO = scanner.nextInt();
		int nX = n-nO;
		int cO = scanner.nextInt();
		int cX = n-cO;
		
		int o = nO > cO ? cO : nO;
		int x = nX > cX ? cX : nX;
		
		System.out.println(o+x);
	}
}