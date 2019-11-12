/**
 * @작성자 wony
 * @작성일 2019. 11. 12.
 * @사용처
 *
 */
package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


/**
 * @작성자 wony
 * @작성일 2019. 11. 12.
 * @사용처 단어정렬
 * 
 */
public class a1181 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 12.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			int testCount = Integer.parseInt(bufferedReader.readLine());
			
			String[] inputArray = new String[testCount];
			
			String inputData;
			for(int i = 0; i< testCount; i++){
				inputData = bufferedReader.readLine();
				if(Arrays.asList(inputArray).indexOf(inputData) == -1)
					inputArray[i] = inputData;
				else
					inputArray[i] = "";
			}
			
			Arrays.sort(inputArray);
			
			for(String data : inputArray){
				if(!"".equals(data))
					bufferedWriter.write(data + "\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				if(bufferedReader !=  null) bufferedReader.close();
				if(bufferedWriter != null){bufferedWriter.flush(); bufferedWriter.close();}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}

}
