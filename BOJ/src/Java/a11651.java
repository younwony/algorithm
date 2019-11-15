/**
 * @작성자 wony
 * @작성일 2019. 11. 15.
 * @사용처
 *
 */
package Java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 15.
 * @사용처 좌표정렬2
 * 
 */
public class a11651 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 15.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		List<MapXY> arrayList = new ArrayList<MapXY>();
		
		for(int i = 0; i < testCount; i++){
			arrayList.add(new MapXY(scanner.nextInt(), scanner.nextInt()));
		}
		
		scanner.close();

		Comparator<MapXY> comparator = new Comparator<MapXY>() {
			
			@Override
			public int compare(MapXY o1, MapXY o2) {
				// TODO Auto-generated method stub
				if(o1.getY() == o2.getY()){
					return Integer.compare(o1.getX(), o2.getX());
				}else 
					return Integer.compare(o1.getY(), o2.getY());
			}
		};
		
		
		arrayList.sort(comparator);
		
		for(MapXY data : arrayList)
			System.out.println(data.getX() + " " + data.getY());
	}

}

class MapXY{
	
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
	
	public MapXY(int x, int y){
		this.x = x;
		this.y = y;
	}
}