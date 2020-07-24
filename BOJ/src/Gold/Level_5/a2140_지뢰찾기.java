package Gold.Level_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class a2140_지뢰찾기 {

	static char[][] inputArray;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.valueOf(bufferedReader.readLine());
			inputArray = new char[n][n];
			
			for(int i = 0; i < n; i++){
				inputArray[i] = bufferedReader.readLine().toCharArray();
			}
			
			int i = 0;
			int j = 0;
			int way = 0;
			while(true){
				isCheck(i , j);
				if(way == 0){
					j++;
					if(j == n){
						way++;
					}
				}else if(way == 1){
					i++;
					if(i == n){
						way++;
					}
				}else if(way == 2){
					j--;
					if(j == -1){
						way++;
					}
				}else{
					i--;
					if(i == -1){
						break;
					}
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(bufferedReader != null){bufferedReader.close();}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public static void isCheck(int i, int j){
		int boomCount = inputArray[i][j];
		if(i == 0 && j == 0 && boomCount > 0){
			inputArray[i + 1][j + 1] = '*';
		}
		if(isField(i + 1 , j)){}
			
	}
	
	public static boolean isField(int i, int j){
		
		return i >= 0 && i < inputArray.length && j >= 0 && j < inputArray.length;
		
	}

}
