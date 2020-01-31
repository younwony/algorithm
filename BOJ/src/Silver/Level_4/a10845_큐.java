/**
 * @작성자 wony
 * @작성일 2019. 11. 11.
 * @사용처
 *
 */
package Silver.Level_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @작성자 wony
 * @작성일 2019. 11. 11.
 * @사용처 큐(Queue)
 * 
 */
public class a10845_큐 {

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
		
		try {
			int testCount = Integer.parseInt(bufferedReader.readLine());
			
			int[] queue = new int[testCount];
			
			for(int i = 0; i < testCount; i++)
				queue[i] = 0;
			
			String[] order;
			
			for(int i = 0; i < testCount; i++){
				order = bufferedReader.readLine().split(" ");
				if("push".equals(order[0]))
					queuePush(queue, Integer.parseInt(order[1]));
				if("pop".equals(order[0]))
					bufferedWriter.write(queuePop(queue) + "\n");
				if("size".equals(order[0]))
					bufferedWriter.write(queueSize(queue) + "\n");
				if("empty".equals(order[0]))
					bufferedWriter.write(queueEmpty(queue) + "\n");
				if("front".equals(order[0]))
					bufferedWriter.write(queueFront(queue) + "\n");
				if("back".equals(order[0]))
					bufferedWriter.write(queueBack(queue) + "\n");
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
	
	public static void queuePush(int[] queue, int data){
		for(int i = 0; i < queue.length; i++){
			if(queue[i] == 0){
				queue[i] = data;
				break;
			}
		}
	}
	
	public static int queuePop(int[] queue){
		
		int data;
		
		data = queue[0] == 0 ? -1 : queue[0];
		
		for(int i = 0; i < queue.length-1; i++){
			queue[i] = queue[i+1];
		}
		
		return data;
	}
	
	public static int queueSize(int[] queue){
		int queueSizeCount = 0;
		while(queue[queueSizeCount] != 0)
			queueSizeCount++;
		return queueSizeCount;
	}	
	
	public static int queueEmpty(int[] queue){
		if(queue[0] == 0)
			return 1;
		else
			return 0;
	}
	
	public static int queueFront(int[] queue){
		if(queue[0] == 0)
			return -1;
		else
			return queue[0];
	}
	public static int queueBack(int[] queue){
		
		int queueSize = queueSize(queue);
		
		if(queueSize == 0)
			return -1;
		else
			return queue[queueSize-1];
	}

}
