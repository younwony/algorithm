/**
 * @작성자 wony
 * @작성일 2019. 10. 2.
 * @사용처
 * TODO
 */
package Bronze.Level_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @작성자 wony
 * @작성일 2019. 10. 2.
 * @사용처
 * TODO
 */
public class a2438_별찍기_1 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 10. 2.
	 * @사용처 * 찍기 buffer 사용
	 * @Todo
	 * @param args
	 * TODO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int a = Integer.parseInt(bufferedReader.readLine());
			for(int i = 0 ; i< a; i++){ 
				for(int j = 0; j <= i; j++)
					bufferedWriter.write("*");
				bufferedWriter.newLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				bufferedReader.close();
				bufferedWriter.flush();
				bufferedWriter.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
