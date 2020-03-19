package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
public static int[][] bingo = new int[5][5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
<<<<<<< HEAD
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				bingo[i][j] = scanner.nextInt();
			}
		}
		
		int count = 0;
		
		while(!isBingo()){
			bingoCheck(scanner.nextInt());
			count++;
		}
		
		System.out.println(count);
	}
	
	public static void bingoCheck(int number){
		
		loop:
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
 				if(bingo[i][j] == number){
					bingo[i][j] = 0;
					break loop;
				}
			}
		}
	}
	
	public static boolean isBingo(){
		
		int bingoCount = 0;
		boolean isBingo = false;
		
		for(int i = 0; i < 5; i++){
			isBingo = false;
			for(int j = 0; j < 5; j++){
				if(bingo[i][j] == 0){
					isBingo = true;
				}else{
					isBingo = false;
					break;
				}
			}
			
			if(isBingo){
				bingoCount++;
			}
		}
		
		for(int i = 0; i < 5; i++){
			isBingo = false;
			for(int j = 0; j < 5; j++){
				if(bingo[j][i] == 0){
					isBingo = true;
				}else{
					isBingo = false;
					break;
				}
			}
			
			if(isBingo){
				bingoCount++;
			}
		}
		
		isBingo = false;
		for(int i = 0; i< 5; i++){
			if(bingo[i][i] == 0){
				isBingo = true;
			}else{
				isBingo = false;
				break;
			}
		}
		
		if(isBingo){bingoCount++;}
		
		isBingo = false;
		for(int i = 0; i< 5; i++){
			if(bingo[i][4-i] == 0){
				isBingo = true;
			}else{
				isBingo = false;
				break;
			}
		}
		if(isBingo){bingoCount++;}
		
		isBingo = bingoCount >= 3 ? true : false;
		
		return isBingo;
=======
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		
		System.out.println(a.length() < b.length() ? "no" : "go");
>>>>>>> cfcea0a0c45cedff34cf128cdb053510969dae9d
	}
}