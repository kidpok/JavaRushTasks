package com.javarush.task.pro.task04.task0415;

import java.math.BigDecimal;
import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double pi = 3.14;
        double s =  pi * radius * radius;
        System.out.println((int) s);

    }
}