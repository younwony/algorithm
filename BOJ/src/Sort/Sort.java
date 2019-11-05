/**
 * @작성자 wony
 * @작성일 2019. 11. 4.
 * @사용처
 *
 */
package Sort;

import sun.security.util.Length;

/**
 * @작성자 wony
 * @작성일 2019. 11. 4.
 * @사용처 정렬 클래스
 * 
 */
public class Sort{

	int[] Array;
	int temp;
	int left;
	int right;
	int middle;
	
	boolean searchCK;
	
	public Sort(int[] Array){
		this.Array = Array;
		this.left = 0;
		this.right = Array.length;
		this.middle = (this.left + this.right)/2;
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 4.
	 * @사용처 선택정렬
	 * @Todo
	 * 1. 주어진 리스트 중 최솟값을 찾는다.
	 * 2. 최솟값과 맨앞에 위치한 값과 교체한다.
	 * 3. 최솟값 인덱스의 위치를 제외한 나머지 리스트를 반복한다.
	 * 
	 * 시간 복잡도 = O(n^2)
	 */
	public void SelectSort(){
		int min;
		
		for(int i = 0; i < Array.length; i++){
			min = i;
			for(int j = i; j < Array.length; j++){
				if(Array[j] < Array[min])
					min = j;
			}
			temp = Array[min];
			Array[min] = Array[i];
			Array[i] = temp;
		}
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 4.
	 * @사용처 삽입정렬
	 * @Todo
	 * 1. 배열의 모든 요소를 앞에서부터 정렬된 배열부분과 비교하여, 자신의 위치를 찾아 삽입하는 정렬
	 * 2. 저장공간이 별도로 필요없는 in-place 정렬
	 * 
	 * 시간 복잡도 = O(n^2)
	 */
	public void InsertSort(){
		for(int i =1; i< Array.length; i++){
			temp = Array[i];
			int preTempIndex = i-1;
			while(preTempIndex >= 0 && Array[preTempIndex] > temp){
				Array[preTempIndex+1] = Array[preTempIndex];
				preTempIndex--;
			}
			Array[preTempIndex+1] = temp;
		}
	};
	
	public void MergeSort(){
		
		RecursionMerge(Array, 0, Array.length-1);
	}
	
	public void RecursionMerge(int[] array, int left, int right){
		
		if(array.length < 2)
			return; 
		middle = left+right/2;
		int[] arrayL = new int[middle];
		for(int i = 0; i < array.length; i++){
			if(i <= middle)
				arrayL[i] = array[i];
			else
				array[i-middle] = array[i];
		}
		RecursionMerge(arrayL, 0, middle);
		RecursionMerge(array, middle + 1, right);
		SumArray(array, arrayL, left, right);
	}
	
	public void SumArray(int[] array, int[] arrayL, int left, int right){
			
	}
	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 4.
	 * @사용처 이진탐색
	 * @Todo
	 * 
	 */
	public boolean BinarySearch(int data){
		
		if(right - left < 0){
			searchCK =  false;
			return searchCK;
		}
		
		middle = (left+right)/2;
		
		if(data == Array[middle])
			searchCK =  true;
		else if(data > Array[middle]){
			left = middle+1;
			BinarySearch(data);
		}
		else if(data < Array[middle]){
			right = middle-1;
			BinarySearch(data);
		}
		
		return searchCK;
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 4.
	 * @사용처 int Array 출력
	 * @Todo
	 * @param Array
	 * 
	 */
	public void Print(int[] Array){
		for(int data : Array)
			System.out.print(data + " ");
	}
}
