package _1_Silver.Level_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class a1969_DNA {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        HashMap<Character, Integer> dnaCtoI = new HashMap<>();
        HashMap<Integer, Character> dnaItoC = new HashMap<>();
        dnaCtoI.put('A', 0);
        dnaCtoI.put('T', 1);
        dnaCtoI.put('G', 2);
        dnaCtoI.put('C', 3);
        dnaItoC.put(0, 'A');
        dnaItoC.put(1, 'T');
        dnaItoC.put(2, 'G');
        dnaItoC.put(3, 'C');

        int[][] dnas = new int[m][4];
        for(int i = 0; i < n; i++){
            String dna = bufferedReader.readLine();
            for(int j = 9; j < m; j++){
                char c = dna.charAt(j);
                dnas[j][dnaCtoI.get(c)]++;
            }
        }

    }
}
