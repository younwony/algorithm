package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {

		int[] moneys = new int[]{50000,10000,5000,1000,500,100,50,10};
		String[] paperAndCoin = new String[]{"지페","지페","지페","지페","동전","동전","동전","동전"};
		String[] units = new String[]{"장","장","장","장","개","개","개","개"};

		Scanner scanner = new Scanner(System.in);

		System.out.print("받으신 금액을 입력하세요 : ");
		int money = scanner.nextInt();
		System.out.print("상품 가격을 입력하세요 : ");
		int price = scanner.nextInt();

		int modMoney = money - price;

		if(modMoney < 0){
			System.out.println("금액이 부족 합니다.");
		}else{
			int change = modMoney;

			for (int i = 0; i < moneys.length; i++) {
				System.out.println(moneys[i] + "원권 " + paperAndCoin[i] + " " +  modMoney/moneys[i] + units[i]);
				modMoney %= moneys[i];
			}

			System.out.println("거스름돈 : " + change + "원");
		}
	}
}


