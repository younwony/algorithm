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

		StringBuilder str = new StringBuilder();

		for(int i = 0; i < 2*n; i++){
			if(i % 2 == 0){
				for(int j = 0; j < n; j++){
					if(j % 2 == 0){
						str.append("*");
					}else{
						str.append(" ");
					}
				}
			}else{
				for(int j = 0; j < n; j++){
					if(j % 2 == 0){
						str.append(" ");
					}else{
						str.append("*");
					}
				}
			}

			str.append("\n");
		}

		scanner.close();

		System.out.println(str.toString());
	}
}

