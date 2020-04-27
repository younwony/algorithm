package Silver.Level_4;

import java.util.Scanner;

public class a1072_게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		float x = scanner.nextLong();
		float y = scanner.nextLong();
		float z = (float)(Math.floor(y/x * 100));
		
		int count = 0;
		while(true){
			count++;
			if(z != (float)(Math.floor((y+count)/(x+count) * 100)) || count > 1000000000){
				break;
			}else if(z == 99){
				count = -1;
				break;
			}
		}
		System.out.println(count > 1000000000 ? -1 : count);
	}

}
