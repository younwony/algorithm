package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		StringBuilder result = new StringBuilder();
		
		for(int i = 2 ; i * i <= n; i++){
			if(n % i == 0){
				result.append(i).append("\n");
				n /= i;
				i--;
			}
		}
		
		if(n > 1) result.append(n);
		
		System.out.println(result.toString());
	}
}


