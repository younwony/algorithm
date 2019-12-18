package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] croatiaLang = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String inputData = scanner.nextLine();
		
		scanner.close();
		int count = 0;
		while(!"".equals(inputData)){
			for(int i = 0; i < croatiaLang.length; i++){
				while(inputData.indexOf(croatiaLang[i]) >= 0){
					inputData = inputData.replaceFirst(croatiaLang[i], ",");
					count++;
				}
			}
			inputData = inputData.replace(",","");
			count += inputData.length();
			break;
		}
		System.out.println(count);
	}
	
}
