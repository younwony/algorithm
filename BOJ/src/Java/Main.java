package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		int strC;
		
		for(int i = 0; i < str.length(); i++) {
			strC = (int)str.charAt(i);
			if(65 <= strC && strC <= 90) {
				strC = (strC-65+13)%26 + 65;
			}else if(97 <=strC && strC <=122) {
				strC = (strC-97+13)%26 + 97;
			}
			System.out.print((char)strC);
		}
	}
}