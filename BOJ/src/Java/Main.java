package Java;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] mn = scanner.nextLine().split(" ");
		BigInteger m = new BigInteger(mn[0]);
		BigInteger n = new BigInteger(mn[1]);
		System.out.println(m.divide(n));
		System.out.println(m.mod(n));
	}
	
}