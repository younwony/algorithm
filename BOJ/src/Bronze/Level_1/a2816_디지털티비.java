/**
 * @작성자 wony
 * @작성일 2019. 12. 5.
 * @사용처
 *
 */
package Bronze.Level_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


/**
 * @작성자 wony
 * @작성일 2019. 12. 5.
 * @사용처
 * 
 */
public class a2816_디지털티비 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 12. 5.
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
			ArrayList<String> brodCase = new ArrayList<String>();
			int kbs1Index,kbs2Index;
			
			for(int i = 0; i < testCount; i++)
				brodCase.add(bufferedReader.readLine());
			
			kbs1Index = brodCase.indexOf("KBS1");
			kbs2Index = brodCase.indexOf("KBS2");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(bufferedReader != null) bufferedReader.close();
				if(bufferedWriter != null){bufferedWriter.flush(); bufferedWriter.close();}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
