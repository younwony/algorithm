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
		
		// 분할되어 정렬된 데이터를 저장할 Array 생성
		int[] array = new int[Array.length];
		
		for(int i = 0; i < array.length; i++)
			array[i] = Array[i];
		
		RecursionMerge(array, 0, array.length-1);
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 7.
	 * @사용처 Merge - 분할
	 * @Todo
	 * @param array
	 * @param left
	 * @param right
	 * 
	 */
	public void RecursionMerge(int[] array, int left, int right){
		
		// 2분할 지점
		int middle = (left+right)/2;
		// Array가 데이털르 하나가질때까지 쪼갠다.
		if(left < right){
			RecursionMerge(array, left, middle); // 좌측
			RecursionMerge(array, middle + 1, right); // 우측
			CompareArray(array, left, middle, right); // 결합부분
		}
	}
	
	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 7.
	 * @사용처 Merge - 정복, 결합
	 * @Todo
	 * @param array
	 * @param left
	 * @param middle
	 * @param right
	 * 
	 */
	public void CompareArray(int[] array, int left, int middle, int right){
		
		int i = left; // 좌측 아이템 시작점
		int j = middle + 1; // 우측 아이템 시작점
		int k = left; // 아이템 넣을 index
		// 좌측 배열이 끝나거나 우측배열이 끝나기전 까지
		while(i <= middle && j <= right){
			if(Array[i] < Array[j]){
				array[k] = Array[i];
				i++;
			}
			else if(Array[j] <= Array[i]){
				array[k] = Array[j];
				j++;
			}
			k++;
		}
		
		// 우측배열이 먼저 끝낫을 경우 좌측 배열 남은 데이터 삽입
		while(i <= middle){
			array[k] = Array[i];
			k++;
			i++;
		}
		
		// 좌측배열이 먼저 끝낫을 경우 우측배열 남은 데이터 삽입
		while(j <= right){
			array[k] = Array[j];
			k++;
			j++;
		}
		
		// 정렬된 데이터 실제 배열에 삽입
		for(; left<=right; left++)
			Array[left] = array[left];
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
	public void Print(){
		for(int data : Array)
			System.out.print(data + " ");
	}
}
