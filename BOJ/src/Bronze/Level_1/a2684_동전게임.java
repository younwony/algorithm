package Bronze.Level_1;

import java.util.Scanner;

public class a2684_동전게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.nextLine();
		
		for(int i = 0 ;i < n; i++) {
			System.out.println(scanner.nextLine().length());
		}
	}

}
