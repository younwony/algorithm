package Java;

import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[] x = new int[n];

		long result = 0;

		for(int i = 0 ; i< n; i++){
			x[i] = scanner.nextInt();
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j<n; j++){
				result += Math.abs(x[i] - x[j]);
			}
		}

		System.out.println(result);
	}
}

