package Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static ArrayList<Integer> imsi_A_arr;
	public static ArrayList<Integer> imsi_B_arr;
	public static ArrayList<Integer> imsi_B_order_arr;

	public static void main(String[] args) {

		// 변수 초기화
		BufferedReader br = null;
		int N = 0;
		int S = 0;

		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();

		// 임시로 사용할 배열 초기화
		imsi_A_arr = new ArrayList<Integer>();
		imsi_B_arr = new ArrayList<Integer>();
		imsi_B_order_arr = new ArrayList<>();	// imsi_B_arr와 B 배열 비교해서 B배열 순서 담기

		StringTokenizer imsi = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));

			N = Integer.parseInt(br.readLine());


			imsi = new StringTokenizer(br.readLine(), " ");
			for(int i = 0 ; i < N ; i++) {
				imsi_A_arr.add(i, Integer.parseInt(imsi.nextToken()));
				A.add(i, imsi_A_arr.get(i));
			}

			imsi = new StringTokenizer(br.readLine(), " ");
			for(int i = 0 ; i < N ; i++) {
				B.add(i, Integer.parseInt(imsi.nextToken()));
				imsi_B_arr.add(i, B.get(i));
			}

			imsi_B_arr.sort(Comparator.reverseOrder());

			for(int i = 0 ; i < B.size() ; i++) {

				imsi_B_order_arr.add(i, B.indexOf(imsi_B_arr.get(i)));
			}
			if(result > 0){
				break;
			}
		}
		return result;
	}
	
	public static boolean isField(int x, int y){
		return (x >= 0 && x  < field.length) && (y >= 0 && y  < field[0].length); 
	}
}

class point{
	int x;
	int y;
	int cnt;
	public point(int x, int y, int cnt) {
		super();
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}


