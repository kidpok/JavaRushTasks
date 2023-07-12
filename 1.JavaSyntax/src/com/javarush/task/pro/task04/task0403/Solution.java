package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isBreak = false;
        int sum = 0;
        while (scanner.hasNextInt()){
            int a = scanner.nextInt();
            sum = sum + a;
        }
        System.out.println(sum);
    }
}