/**
 * @작성자 wony
 * @작성일 2019. 11. 5.
 * @사용처
 *
 */
package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @작성자 wony
 * @작성일 2019. 11. 5.
 * @사용처 수 정렬하기 2
 * 
 */
public class a2751 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 5.
	 * @사용처 1 <= testCount <= 1,000,000
	 * @Todo
	 * 
	 * Arrays.sort() 사용시 시간초과
	 * List.sort() 사용시 성공
	 * 
	 * Arrays.sort는 퀵
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int testCount = Integer.parseInt(bufferedReader.readLine());
			
			List<Integer> testList = new ArrayList<Integer>();
			for(int i = 0; i < testCount; i++){
				testList.add(Integer.parseInt(bufferedReader.readLine()));
			}
			
			testList.sort(null);
			
			for(int data : testList)
				bufferedWriter.write(data + "\n");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			try {
				if(bufferedReader != null) bufferedReader.close();
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

}
