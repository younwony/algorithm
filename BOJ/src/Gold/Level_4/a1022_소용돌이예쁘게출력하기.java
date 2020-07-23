package Gold.Level_4;

public class a1022_소용돌이예쁘게출력하기 {
	
	static long[][] field = new long[15000][15000];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createField();
		System.out.println("test");
	}
	
	public static void createField(){
		field[5000][5000] = 1;
		long count = 2;
		int x = 5000;
		int y = 5000;
		
		int move = 1;
		
		boolean isPlus = true;
	
		while(move < 10000){
			if(isPlus){
				for(int i = 1; i <= move; i++){
					field[x + i][y] = count++;
				}
				x += move;
				for(int i = 1; i <= move; i++){
					field[x][y + i] = count++;
				}
				y += move;
			}else{
				for(int i = 1; i <= move; i++){
					field[x - i][y] = count++;
				}
				x -= move;
				for(int i = 1; i <= move; i++){
					field[x][y - i] = count++;
				}
				y -= move;
			}
			move++;
		}
		
	}

}
