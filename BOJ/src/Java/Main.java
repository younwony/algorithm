package Java;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		double z = Math.sqrt(x*x + y*y);

		double nRatio = n/z;

		System.out.println((int)(x * nRatio));
		System.out.println((int)(y * nRatio));
	}
	
}