package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int L = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		
		int aMod = (int)Math.ceil((double)A/C);
		int bMod = (int)Math.ceil((double)B/D);
		System.out.println(aMod > bMod ? L - aMod : L - bMod);
	}
}