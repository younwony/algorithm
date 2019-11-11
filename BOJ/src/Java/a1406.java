/**
 * @작성자 wony
 * @작성일 2019. 11. 11.
 * @사용처
 *
 */
package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @작성자 wony
 * @작성일 2019. 11. 11.
 * @사용처 에디터
 * 
 */
public class a1406 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 11.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder builder = new StringBuilder();
		
		try {
			
			String[] startStr = bufferedReader.readLine().split("");
			
			int testCount = Integer.parseInt(bufferedReader.readLine());
			
			String[] str = new String[startStr.length + testCount];
			
			for(int i = 0; i< str.length; i++)
				str[i] = "";
			
			for(int i = 0; i < startStr.length; i++)
				str[i] = startStr[i];
			
			String[] order;
			
			int point = startStr.length;
			
			for(int i = 0; i< testCount; i++){
				order = bufferedReader.readLine().split(" ");
				if("L".equals(order[0])) point = editorLeftMove(str, point);
				if("D".equals(order[0])) point = editorRightMove(str, point);
				if("B".equals(order[0])) editorBackSpace(str, point);
				if("P".equals(order[0])) editorPlus(str, order[1], point);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(bufferedReader != null) bufferedReader.close();
				if(bufferedWriter != null) bufferedWriter.flush(); bufferedWriter.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	static int editorLeftMove(String[] str, int point){
		if(point == 0)
			return 0;
		else
			return point-1;
		
	}
	
	static int editorRightMove(String[] str, int point){
		return point;
	}
	static void editorBackSpace(String[] str, int point){
		
	}
	static void editorPlus(String[] str, String data, int point){
		
	}

}
