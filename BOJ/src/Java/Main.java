package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		
		System.out.println(a.length() < b.length() ? "no" : "go");
	}
}