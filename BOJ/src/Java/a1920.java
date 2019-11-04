/**
 * @작성자 wony
 * @작성일 2019. 10. 30.
 * @사용처
 * @Todo
 */

package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @작성자 wony
 * @작성일 2019. 10. 30.
 * @사용처
 * @Todo
 */

public class a1920 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 10. 30.
	 * @사용처
	 * @param args
	 * @Todo
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int n,m;
		String[] nInput,mOutput;
		int[] resultData;
		
		int max = 0;
		try {
			
			n = Integer.parseInt(bufferedReader.readLine());
			nInput = bufferedReader.readLine().split(" ");
			m = Integer.parseInt(bufferedReader.readLine());
			mOutput = bufferedReader.readLine().split(" ");
			
			for(String maxData : mOutput)
				if(Integer.parseInt(maxData) > max)
					max = Integer.parseInt(maxData);
			
			resultData = new int[max];
			
			for(int i = 0; i < max; i++)
				resultData[i] = 0;
			
			
			for(int i = 0; i < max; i++) 
				resultData[Integer.parseInt(nInput[i])-1] = 1;
			
			for(int i = 0; i < n; i++) 
				bufferedWriter.write(resultData[Integer.parseInt(mOutput[i])-1]);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(bufferedReader != null) bufferedReader.close();
				if(bufferedWriter != null) {
					bufferedWriter.flush(); 
					bufferedReader.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
