package Java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int tempn = n;
		
		for(int i = 1; i <= 2*n - 1; i++){
			if(i <= n){
				for(int j = 0; j < i; j++){
					System.out.print("*");
				}
			}else{
				tempn--;
				for(int j = 0; j < tempn; j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
}