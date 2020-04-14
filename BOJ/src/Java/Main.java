package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String str;
		
		boolean isgun = true;
		Stack<String> stack = new Stack<>();
		while(!".".equals(str = scanner.nextLine())){
			isgun = true;
			stack.clear();
			
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) == '('){
					stack.push("(");
				}
				if(str.charAt(i) == ')'){
					if(stack.isEmpty() || !"(".equals(stack.peek())){isgun = false; break;}
					stack.pop();
				}
				if(str.charAt(i) == '['){
					stack.push("[");
				}
				if(str.charAt(i) == ']'){
					if(stack.isEmpty() || !"[".equals(stack.peek())){isgun = false; break;}
					stack.pop();
				}
			}
			
			if(stack.isEmpty() && isgun){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
		
		scanner.close();
	}
}