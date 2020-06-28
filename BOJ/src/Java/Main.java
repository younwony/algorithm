package Java;

import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int e = scanner.nextInt();
		int s = scanner.nextInt();
		int m = scanner.nextInt();

		int result = 0;

		int eNum,sNum,mNum;
		while(true){
			result++;
			eNum = result % 15 == 0 ? 15 : result % 15;
			sNum = result % 28 == 0 ? 28 : result % 28;
			mNum = result % 19 == 0 ? 19 : result % 19;
			if(eNum == e && sNum == s && mNum == m){
				break;
			}
		}
		System.out.println(result);
		scanner.close();
	}
		
}

