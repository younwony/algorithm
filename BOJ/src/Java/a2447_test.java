/**
 * @작성자 wony
 * @작성일 2019. 10. 22.
 * @사용처
 *
 */
package Java;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 10. 22.
 * @사용처
 * 
 */
public class a2447_test {

	/**
	 * @작성자 wony
	 * @작성일 2019. 10. 22.
	 * @사용처 별찍기 test 2번째
	 * @Todo 
	 * 중요 1. System.out.print 를 사용했더니 시간 초과가 났다 .앞서 학습한대로 다량의 데이터 출력에는 BufferWriter를 사용하도록 꼭 잊지말자!
	 * 2. 배열 초기화하지않고 공백값까지 넣어주는 함수 를 적용했다. -> 배열 초기화한후 사용하는게 더 빠르다.
	 * 3. String 형으로 2차원 배열을 선언 했다 .-> 단순 문자이기에 char 형으로 선언하는게 훨씬 메모리와 시간측면으로 이득을 볼수 있다. 실제로 테스트 결과 String -> 35007KB, 404ms  char -> 24800KB, 352ms 로 차이가 심함.
	 * 현재 소스는 공백값 넣어주는 함수
	 * @param args
	 * 
	 */
	
	static String[][] star;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCount = scanner.nextInt();
		
		star = new String[testCount][testCount];

		star(testCount, 0, 0);
		
		try {
			for(int i=0; i<testCount; i++){
				for(int j=0; j<testCount; j++){
					bufferedWriter.write(star[i][j]);
				}
				bufferedWriter.newLine();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(bufferedWriter != null) {
					bufferedWriter.flush();
					bufferedWriter.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}
	
	public static void star(int n, int x, int y){
		if(n ==1){
			star[x][y] = "*";
			return;
		}
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(i==1 && j==1){
					starBlank(n/3, x+n/3*i, y+n/3*j);
				}else{
					star(n/3, x+n/3*i, y+n/3*j);
				}
			}
		}
	}
	
	public static void starBlank(int n, int x, int y){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				star[x+i][y+j] = " ";
			}
		}
	}

}
