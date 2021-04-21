package me.wony.level_2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class _프렌즈4블록 {

    public static void main(String[] args) {
//        System.out.println(solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}));
        System.out.println(solution(6, 6, new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"}));
    }

    static String[][] field;
    static int cnt = 0;
    private static int solution(int m, int n, String[] board) {
        //given
        field = new String[m][n];
        for (int i = 0; i < field.length; i++) {
            field[i] = board[i].split("");
        }

        //when
        while (true) {
            HashSet<String> point = new HashSet<>();
            for (int i = 0; i < field.length - 1; i++) {
                for (int j = 0; j < field[0].length - 1; j++) {
                    if (isBlock(i, j)) {
                        addPoint(i, j, point);
                    }
                }
            }
            if(point.isEmpty()) break;
            removeBlock(point);
            sortBlock();
        }

        return cnt;
    }

    private static void removeBlock(HashSet<String> point) {
        for (String pointXY : point) {
            String[] pointArray = pointXY.split(",");
            field[Integer.parseInt(pointArray[0])][Integer.parseInt(pointArray[1])] = "";
            cnt++;
        }
    }

    private static void addPoint(int i, int j, HashSet<String> point) {
        point.add(i + "," + j);
        point.add((i+1) + "," + (j+1));
        point.add((i+1) + "," + j);
        point.add(i + "," + (j+1));
    }

    private static void sortBlock() {
        for (int i = 0; i < field[0].length; i++) {
            for (int j = field.length-1; j >= 0; j--) {
                if(field[j][i].isEmpty()){
                    for(int k = j-1; k >= 0; k--){
                        if(!field[k][i].isEmpty()){
                            field[j][i] = field[k][i];
                            field[k][i] = "";
                            break;
                        }
                    }
                }
            }
        }
    }

    private static boolean isBlock(int i, int j) {
        String block = field[i][j];
        if(block.isEmpty()) return false;
        if(!block.equals(field[i+1][j])) return false;
        if(!block.equals(field[i][j+1])) return false;
        if(!block.equals(field[i+1][j+1])) return false;
        return true;
    }
}
