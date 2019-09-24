package Java;

import java.util.Scanner;

public class Main {

	/**
	 * @사용처 제출용 Class
	 * @Todo
	 * @param args
	 * TODO 1. 두원내에 같은점이 있는경우를 생각못함.
	 */
	static int startX = 0;
	static int startY = 0;
	static int stopX = 0;
	static int stopY = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int testCaseCount = scanner.nextInt(); //test case 개수
		
		int passCount = 0; //지나는 지점 개수
		
		int[] answer = new int[testCaseCount]; //출력 개수
		
		int testCaseCirCle = 0; //테스트 원 개수
		
		int x,y,r; // 각각 x, y, r
		
		for(int i=0; i<testCaseCount; i++){
			startX = scanner.nextInt();
			startY = scanner.nextInt();
			stopX = scanner.nextInt();
			stopY = scanner.nextInt();
			testCaseCirCle = scanner.nextInt();
			for(int j=0; j<testCaseCirCle; j++){
				x = scanner.nextInt();
				y = scanner.nextInt();
				r = scanner.nextInt();
				if(circlePassCheck(x,y,r))
						passCount++;
			}
			answer[i] = passCount;
			passCount = 0;
		}
		
		
		for(int i =0; i < testCaseCount; i++){
			System.out.println(answer[i]);
		}
	}
	
	public static boolean circlePassCheck(int x, int y, int r){
		
		//1
		if((Math.pow(startX-x,2) + Math.pow(startY, 2)) <= Math.pow(r, 2) && (Math.pow(stopX-x,2) + Math.pow(stopY, 2)) <= Math.pow(r, 2))
			return false;
		if((Math.pow(startX-x,2) + Math.pow(startY, 2)) <= Math.pow(r, 2)) 
			return true;
		if((Math.pow(stopX-x,2) + Math.pow(stopY, 2)) <= Math.pow(r, 2)) 
			return true;
		
		return false;
	}
}
