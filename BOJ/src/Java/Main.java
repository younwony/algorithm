package Java;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int n = scanner.nextInt();
		int m = 0;
		int totalN = 2*n -1;
		int totalm;
		boolean isM = true;
		for(int i = 0; i < totalN; i++){
			totalm = 2*(n-m)-1;
			for(int j = 0; j < m; j++){
				str.append(" ");
			}
			for(int j = 0; j < totalm; j++){
				str.append("*");
			}
			if(m == n-1){
				isM = !isM;
			}
			if(isM){
				m++;
			}else{
				m--;
			}
			str.append("\n");
		}

		scanner.close();
		System.out.println(str.toString());
	}
}

