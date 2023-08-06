package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean bl = scanner.nextBoolean();

        double db ;
        if (bl) {
            db =  Math.ceil(glass);
        } else {
            db = Math.floor(glass);
        }

        System.out.println((int) db);

    }
}