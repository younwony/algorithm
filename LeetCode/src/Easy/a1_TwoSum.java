/**
 * @작성자 wony
 * @작성일 2020. 2. 20.
 * @사용처
 *
 */
package Easy;

/**
 * @작성자 wony
 * @작성일 2020. 2. 20.
 * @사용처
 * 
 */
public class a1_TwoSum {

	/**
	 * @작성자 wony
	 * @작성일 2020. 2. 20.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	
	static boolean[] visited;
	static boolean result = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,2,4}; 
		int target = 6;
		visited = new boolean[nums.length];
		combination(0, 0, nums, target);
		
		int[] result = new int[2];
		int count = 0;
		for(int i = 0 ; i < visited.length; i++){
			if(visited[i]){
				result[count++] = i;
				System.out.print(i + " ");
			}
		}
	}
	
	public static void combination(int index, int count, int[] nums, int target){
		if(count == 2){
			int sum = 0;
			for(int i = 0 ; i < visited.length; i++){
				if(visited[i]){
					sum += nums[i];
				}
			}
			if(sum == target){
				result = true;
			}
		}else{
			for(int i = index; i < nums.length; i++){
				visited[i] = true;
				combination(index+1, count+1, nums, target);
				if(result){break;}
				visited[i] = false;
			}
		}
			
	}

}
