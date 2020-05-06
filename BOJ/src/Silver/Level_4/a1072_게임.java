package Silver.Level_4;

import java.util.Scanner;

public class a1072_게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		float x = scanner.nextLong();
		float y = scanner.nextLong();
		float z = (float)(Math.floor(y/x * 100));
		
		int targetZ = 0;
		int left = 0;
		int right = 1000000001;
		int result = -1;
		int middle;
		while(left <= right){
			middle  = (left + right)/2;
			
			if(z == 99){
				middle = -1;
				break;
			}
			
			targetZ = (int)(Math.floor((y+middle)/(x+middle)*100));
			
			if (z >= targetZ){
				  result = middle + 1;
				  left = middle + 1;
		    }
	        else{right = middle - 1;}
		}
		
		System.out.println(result);
	}

}
