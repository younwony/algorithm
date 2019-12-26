package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		scanner.close();
		System.out.println(String.format("%.6f",r * r * Math.PI));
		System.out.println(String.format("%.6f",r * r * 2.0));
	}
	
}
