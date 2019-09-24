package Java;

import java.util.Scanner;

public class Main {

	/**
	 * @사용처 제출용 Class
	 * @Todo
	 * @param args
	 * TODO
	 */
static int[][] fivoMem = new int[40][2];
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fivoMem[0][0] = 1; 
		fivoMem[0][1] = 0; 
		fivoMem[1][0] = 0; 
		fivoMem[1][1] = 1; 
		
		fibonacci();
		
		Scanner scanner = new Scanner(System.in);
		
		int testCaseCount = scanner.nextInt();
		
		String[] answer = new String[testCaseCount];
		
		for(int i = 0; i < testCaseCount; i++){
			answer[i] = fibonacciAnswer(scanner.nextInt());
		}
		
		for (int i = 0; i < testCaseCount; i++) {
			System.out.println(answer[i].toString());
		}
		
	}
	
	public static void fibonacci() {
	    for(int i= 2; i<40; i++){
	    	fivoMem[i][0] = fivoMem[i-2][0] + fivoMem[i-1][0];
	    	fivoMem[i][1] = fivoMem[i-2][1] + fivoMem[i-1][1];
	    }
	}
	
	public static String fibonacciAnswer(int i){
		int a,b = 0;
		if(i == 0){
			return "1 0";
		}else if(i == 1){
			return "0 1";
		}else{
			a = fivoMem[i-2][0] + fivoMem[i-1][0];
			b = fivoMem[i-2][1] + fivoMem[i-1][1];
			return a + " " + b;
		}
	}
}
