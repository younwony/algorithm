package Java;

import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @사용처 제출용 Class
	 * @Todo 
	 * @param args
	 * TODO
	 */

	static char[][] star;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCount = scanner.nextInt();
		
		star = new char[testCount][testCount];

		star(testCount, 0, 0);
		
		try {
			for(int i=0; i<testCount; i++){
				for(int j=0; j<testCount; j++){
					bufferedWriter.write(star[i][j]);
				}
				bufferedWriter.newLine();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(bufferedWriter != null) {
					bufferedWriter.flush();
					bufferedWriter.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}
	
	public static void star(int n, int x, int y){
		if(n ==1){
			star[x][y] = '*';
			return;
		}
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(i==1 && j==1){
					starBlank(n/3, x+n/3*i, y+n/3*j);
				}else{
					star(n/3, x+n/3*i, y+n/3*j);
				}
			}
		}
	}
	
	public static void starBlank(int n, int x, int y){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				star[x+i][y+j] = ' ';
			}
		}
	}
	
}
