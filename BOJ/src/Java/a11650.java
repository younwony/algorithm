/**
 * @작성자 wony
 * @작성일 2019. 11. 15.
 * @사용처
 *
 */
package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 15.
 * @사용처 좌표 정렬
 * 
 */
public class a11650 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 15.
	 * @사용처 Comparator 사용
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		List<MapXY2> arrayList = new ArrayList<MapXY2>();
		
		for(int i = 0; i < testCount; i++){
			arrayList.add(new MapXY2(scanner.nextInt(), scanner.nextInt()));
		}
		
		scanner.close();

		Comparator<MapXY2> comparator = new Comparator<MapXY2>() {
			
			@Override
			public int compare(MapXY2 o1, MapXY2 o2) {
				// TODO Auto-generated method stub
				if(o1.getX() < o2.getX()){
					return -1;
				}else if(o1.getX() > o2.getX()){
					return 1;
				}else{
					if(o1.getY() < o2.getY()){
						return -1;
					}else if(o1.getY() < o2.getY()){
						return 1;
					}
					return 0;
				}
			}
		};
		
		
		arrayList.sort(comparator);
		
		for(MapXY2 data : arrayList)
			System.out.println(data.getX() + " " + data.getY());
		
		
		
	}

}

class MapXY2{
	
	int x;
	int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public MapXY2(int x, int y){
		this.x = x;
		this.y = y;
	}
}
