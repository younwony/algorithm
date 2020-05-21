package Java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int result = 0;
		
		if(x > 0 && y > 0){
			result = 1;
		}else if( x < 0 && y > 0){
			result = 2;
		}else if( x < 0 && y < 0){
			result = 3;
		}else{
			result = 4;
		}
		
		System.out.println(result);

	}
	
}