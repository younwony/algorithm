package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().split("-");
		StringBuilder result = new StringBuilder();
		
		for(String data : str) {
			result.append(data.charAt(0));
		}
		
		scanner.close();
		
		System.out.println(result.toString());
	}
}