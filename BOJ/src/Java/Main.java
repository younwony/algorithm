package Java;

import java.math.BigInteger;
import java.util.*;

public class Main {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			int n = scanner.nextInt();
			scanner.nextLine();

			String[] result = new String[2];

			StringBuilder str = new StringBuilder();

			for(int i = 0 ; i < n; i++){
				result = scanner.nextLine().split(",");
				str.append(Integer.parseInt(result[0]) + Integer.parseInt(result[1]));
				str.append("\n");
			}

			System.out.println(str.toString());
		}
}

