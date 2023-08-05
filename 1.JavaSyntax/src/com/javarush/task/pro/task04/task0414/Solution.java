package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int i = scanner.nextInt();
        int count = 0;
        do {
            if (i <= 0 || i >= 5) {
                System.out.println(number);
                break;
            }

            System.out.println(number);
            count++;
        } while (count < i);


    }
}

