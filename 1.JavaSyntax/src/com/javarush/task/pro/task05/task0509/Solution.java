package com.javarush.task.pro.task05.task0509;
/*
Таблица умножения
*/

import java.util.Arrays;

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                 MULTIPLICATION_TABLE[i][j]  = (j+1) * (i+1);
                System.out.print( MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
