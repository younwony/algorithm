package Kakao.Problem_2019_Intern;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {
	public static void main(String[] args) {
		
		int[][] board = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = new int[]{1,5,3,5,1,2,1,4};
		
        System.out.println(solution(board, moves));

    }

	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int move : moves){
        	for(int i = 0; i < board.length; i++){
        		if(board[i][move-1] != 0){
        			int nowData = board[i][move-1];
        			if(!stack.isEmpty()){
        				if(stack.peek() == nowData){
        					stack.pop();
        					answer += 2;
        				}else{
        					stack.push(nowData);
        				}
        			}else{
        				stack.push(board[i][move-1]);
        			}
        			board[i][move-1] = 0;
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
