package com.javarush.task.pro.task04.task0412;

import java.util.Scanner;

/* 
Сумма кратных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int count = 0;
        for (count = 0; start < end; start++) {


            if (start % multiple != 0)
                continue;
            count += start ;

        }
        System.out.println(count);
    }
}

