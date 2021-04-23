package me.wony.level_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 모의고사Test {
    @Test
    void solution(){
        String test = "C#DEFGAB";
        String[] split = test.split("(?=[A-Z])");
        for (String s : split) {
            System.out.println(s);
        }
    }

    @Test
    void solution2(){
        String test = "CCB#CCB";
        String[] split = test.split("CCB#");
        for (String s : split) {
            System.out.println(s);
        }
    }

}