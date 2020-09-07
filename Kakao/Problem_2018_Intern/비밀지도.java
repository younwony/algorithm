package Kakao.Problem_2019_Intern;

public class 비밀지도 {
	
	public static void main(String[] args) {
		
		int n;
		int[] arr1;
		int[] arr2;
		
		n = 5;
		arr1 = new int[]{9, 20, 28, 18, 11};
		arr2 = new int[]{30, 1, 21, 17, 28};
        System.out.println(solution(n, arr1, arr2).toString());

    }

	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0 ; i < n; i++){
        	String binaryStr1 = String.format("%"+n+"s",Integer.toBinaryString(arr1[i])).replace(' ', '0');
        	String binaryStr2 = String.format("%"+n+"s",Integer.toBinaryString(arr2[i])).replace(' ', '0');
        	String str = "";
        	for(int j = 0; j < n; j++){
        		if(binaryStr1.charAt(j) == '1' || binaryStr2.charAt(j) == '1'){
        			str += "#";
        		}else{
        			str += " ";
        		}
        	}
        	answer[i] = str;
        }
        
        return answer;
    }
}
