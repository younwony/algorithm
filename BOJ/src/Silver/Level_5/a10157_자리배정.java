/**
 * @작성자 wony
 * @작성일 2020. 2. 24.
 * @사용처
 *
 */
package Silver.Level_5;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2020. 2. 24.
 * @사용처
 * 
 */
public class a10157_자리배정 {

	/**
	 * @작성자 wony
	 * @작성일 2020. 2. 24.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int person = scanner.nextInt();
		
		scanner.close();
		
		int[][] filed = new int[m][n];
		
		int[] signX = {1,0,-1,0};
		int[] signY = {0,1,0,-1};
		
		int count = 1;
		
		int sign = 0;
		int startI = 0;
		int startJ = 0;
		
		boolean isXY = true;
		boolean result = true;
		n--;
		while(result){
			if(isXY){
				for(int j = 0; j < m; j++){
					if(count == person){result = !result; break;}
					filed[startI][startJ] = count++;
					System.out.println(startI + " , " + startJ + " = " + filed[startI][startJ]);
					startI += signX[sign];
					startJ += signY[sign];
				}
				m--;
			}else{
				for(int j = 0; j < n; j++){
					if(count == person){result = !result; break;}
					filed[startI][startJ] = count++;
					System.out.println(startI + " , " + startJ + " = " + filed[startI][startJ]);
					startI += signX[sign];
					startJ += signY[sign];
				}
				n--;
			}
			isXY = !isXY;
			sign = (sign + 1)%4;
		}
		
		if(person > n*m){System.out.println(0);}
		else{System.out.println(startI + " " + startJ);}
	}

}
