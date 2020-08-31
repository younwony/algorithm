package Kakao.Problem_2020;

import java.util.Stack;

public class 문자열_압축 {
	public static void main(String[] args) {
        System.out.println(solution("(()())()"));
        System.out.println(solution(")("));
        System.out.println(solution(")()("));
        System.out.println(solution("()))((()"));

    }

    public static String solution(String p) {
    	String answer = "";
    	
    	// 올바르며 균형잡힌 괄호 일경우 바로 출력
    	if(isRightString(p)) return p;
    	
    	String u = "", v = "";
    	
    	String[] uv = divUVString(p);
    	u = uv[0];
    	v = uv[1];
    	
    	answer = recurSolved(u, v);
    	
        return answer;
    }
    
    /**
     *	@author : wony
     *	@date : 2020-08-31
     *  @Desc : 메인 재귀 로직
     */
    public static String recurSolved(String u, String v){
    	
    	String answer = "";
    	
    	// u, v 변환
    	String[] tempUV = divUVString(v);
    	
    	// 재귀 리턴 지정  - u, v 둘다 빈값일경우
    	if("".equals(u) &&"".equals(v)) return "";
    	
    	// u 문자열이 올바르며 균형 잡힌 괄호일경우 결과값에 문자열 추가 후 v에대해 재귀
    	if(isRightString(u)){
    		answer += u;
    		answer += recurSolved(tempUV[0], tempUV[1]);
    	}else{
    	// u 문자열이 균형잡힌 괄호일 경우
    		answer += "(";
    		answer += recurSolved(tempUV[0], tempUV[1]);
    		answer += ")";
    		answer += reversString(u.substring(1, u.length() - 1));
    		return answer;
    	}
    	
    	return answer;
    }
    
    /**
     *	@author : wony
     *	@date : 2020-08-31
     *  @Desc : 괄호 반대 처리
     */
    public static String reversString(String str){
    	String result = "";
    	
    	for(int i= 0 ; i< str.length(); i++){
    		result += str.charAt(i) == '(' ? ')' : '(';
    	}
    	
    	return result;
    }
    
    /**
     *	@author : wony
     *	@date : 2020-08-31
     *  @Desc : uv 변환 u = 올바른 괄호 문자열로 변환, v는 u이후 문자열
     */
    public static String[] divUVString(String p){
    	String u = "";
    	String v = "";
    	int left = 0, right = 0;
    	
    	String nowChar = "";
    	for(int i = 0 ; i < p.length(); i++){
    		nowChar = String.valueOf(p.charAt(i));
    		u += nowChar;
    		if("(".equals(nowChar)){
    			left++;
    		}else{
    			right++;
    		}
    		
    		if(left == right) {
    			v = p.substring(i+1, p.length());
    			break;
    		}
    	}
    	
    	String[] result = {u,v}; 
    	
    	return result;
    }
    
    /**
     *	@author : wony
     *	@date : 2020-08-31
     *  @Desc : 올바른 문자열 체크 - Stack 사용 
     */
    public static boolean isRightString(String u){
    	
    	Stack<Character> stack = new Stack<>();
    	 
    	for(int i = 0; i < u.length(); i++){
    		char nowChar = u.charAt(i);
    		if(!stack.isEmpty()){
    			if(stack.peek() == '(' && ')' == nowChar){
    				stack.pop();
    			}else{
    				stack.push(nowChar);
    			}
    		}else{
    			stack.push(nowChar);
    		}
    	}
    	
    	
    	return stack.isEmpty();
    }
}
