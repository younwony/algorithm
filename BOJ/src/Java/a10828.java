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
 * @사용처 스택
 * 
 */
public class a10828 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 11.
	 * @사용처 스택(Stack - 배열구현)
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
			
			int[] stack = new int[testCount];
			
			for(int i= 0; i< testCount; i++)
				stack[i] = 0;
			
			
			String[] order;
			
			for(int i =0; i < testCount; i++){
				order = bufferedReader.readLine().split(" ");
				if("push".equals(order[0]))
					stackPush(stack, Integer.parseInt(order[1]));
				if("pop".equals(order[0]))
					bufferedWriter.write(stackPop(stack) + "\n");
				if("size".equals(order[0]))
					bufferedWriter.write(stackSize(stack) + "\n");
				if("empty".equals(order[0]))
					bufferedWriter.write(stackEmpty(stack) + "\n");
				if("top".equals(order[0]))
					bufferedWriter.write(stackTop(stack) + "\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally{
			try {
				if(bufferedReader != null) bufferedReader.close();
				if(bufferedWriter != null) bufferedWriter.flush(); bufferedWriter.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public static void stackPush(int[] stack, int data){
		for(int i = stack.length -1 ; i > 0; i--){
			stack[i] = stack[i-1];
		}
		stack[0] = data;
	}
	
	public static int stackPop(int[] stack){
		
		int data;
		
		if(stack[0] == 0)
			data = -1;
		else
			data = stack[0];
		
		for(int i = 0; i < stack.length-1; i++)
			stack[i] = stack[i+1];
		
		return data;
	}
	
	public static int stackSize(int[] stack){
		
		int sizeCount = 0;
		
		for(int data : stack)
			if(data != 0)
				sizeCount++;
		
		return sizeCount; 
	}	
	
	public static int stackEmpty(int[] stack){
		if(stack[0] == 0)
			return 1;
		else
			return 0;
	}
	
	public static int stackTop(int[] stack){
		if(stack[0] == 0)
			return -1;
		else
			return stack[0];
	}
}
