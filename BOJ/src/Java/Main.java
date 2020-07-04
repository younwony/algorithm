package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] abc = new int[3];

		for(int i = 0; i < 3; i++){
			abc[i] = scanner.nextInt();
		}

		Arrays.sort(abc);

		scanner.nextLine();

		String inputStr = scanner.nextLine();

		StringBuilder result = new StringBuilder();

		for(int i = 0; i < inputStr.length(); i++){
			if(inputStr.charAt(i) == 'A'){
				result.append(abc[0] + " ");
			}else if(inputStr.charAt(i) == 'B'){
				result.append(abc[1] + " ");
			}else{
				result.append(abc[2] + " ");
			}
		}

		System.out.println(result.toString());
	}
}

