/**
 * @작성자 wony
 * @작성일 2019. 10. 25.
 * @사용처
 *
 */
package Java;

import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 10. 25.
 * @사용처
 * 
 */
public class a1019 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 10. 25.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	
	static int[] page = new int[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int bookNum = scanner.nextInt();
		
		for(int i = 0; i< page.length; i++)
			page[i] = 0;
		
		for(int i = 0; i<bookNum; i++)
			num(bookNum-i);
		
		for(int j : page)
			System.out.print(j + " ");
		
	}
	
	public static void num(int n){
		if(n<10){
			page[n%10]++;
		}else{
			num(n/10);
			num(n%10);
		}
	}

}
