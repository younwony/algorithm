package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		ArrayList<Olympic> arrayList = new ArrayList<Olympic>();
		for(int i = 0; i < n; i++){
			arrayList.add(new Olympic(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
		}
		
		Collections.sort(arrayList, new Olympic());
		for(Olympic result : arrayList){
			if(result.getRank() == k){
				System.out.println(result.getOrder());
				break;
			}
		}
	}
}

class Olympic implements Comparator<Olympic>{
	int order;
	int gold;
	int silver;
	int bronze;
	int rank;
	
	
	
	/**
	 * @작성자 wony
	 * @작성일 2020. 1. 23.
	 * @사용처
	 * 
	 */
	public Olympic() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Olympic(int order, int gold, int silver, int bronze) {
		super();
		this.order = order;
		this.rank = order;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	
	
	
	public int getOrder() {
		return order;
	}



	public void setOrder(int order) {
		this.order = order;
	}



	public int getGold() {
		return gold;
	}



	public void setGold(int gold) {
		this.gold = gold;
	}



	public int getSilver() {
		return silver;
	}



	public void setSilver(int silver) {
		this.silver = silver;
	}



	public int getBronze() {
		return bronze;
	}



	public void setBronze(int bronze) {
		this.bronze = bronze;
	}

	public int getRank() {
		return rank;
	}



	public void setRank(int rank) {
		this.rank = rank;
	}



	@Override
	public int compare(Olympic o1, Olympic o2) {
		// TODO Auto-generated method stub
		
		if(o1.getGold() == o2.getGold()){
			if(o1.getSilver() == o2.getSilver()){
				if(o1.getBronze() == o2.getBronze()){
					if(o1.getOrder() < o2.getOrder()){
						o2.setOrder(o1.getOrder());
					}else{
						o1.setOrder(o2.getOrder());
						
					}
					return 0;
				}else{
					return o2.getBronze() - o1.getBronze(); 
				}
			}else{
				return o2.getSilver() - o1.getSilver(); 
			}
		}else{
			return o2.getGold() - o1.getGold(); 
		}
		
	}
	
	
}




