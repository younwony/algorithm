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
import java.util.Stack;

/**
 * @작성자 wony
 * @작성일 2019. 11. 11.
 * @사용처 에디터
 * 
 */
public class b1406 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 11.
	 * @사용처 두개의  Stack Lib을 사용
	 * @Todo
	 * 
	 * 결과값 도출을 위해 시작할때 넣엇던 stackL을 stackR로 다 옮긴다.(LIFO 의 영향)
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder builder = new StringBuilder();
		
		Stack<String> stackL = new Stack<String>();
		Stack<String> stackR = new Stack<String>();
		
		
		try {
			String[] startStr = bufferedReader.readLine().split("");
			
			for(String data : startStr)
				stackL.push(data);
			
			int testCount = Integer.parseInt(bufferedReader.readLine());
			
			String[] order;
			for(int i = 0; i < testCount; i++){
				order = bufferedReader.readLine().split(" ");
				if("L".equals(order[0])) if(!stackL.empty()) stackR.push(stackL.pop());
				if("D".equals(order[0])) if(!stackR.empty()) stackL.push(stackR.pop());
				if("B".equals(order[0])) if(!stackL.empty()) stackL.pop();
				if("P".equals(order[0])) stackL.push(order[1]);
			}
			
			while(!stackL.empty())			//결과값 도출을 위해 시작할때 넣엇던 stackL을 stackR로 다 옮긴다.(LIFO 의 영향)
				stackR.push(stackL.pop());
			while(!stackR.empty())
				builder.append(stackR.pop());
			
			bufferedWriter.write(builder.toString());
			
			
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
}
