package com.javarush.task.pro.task05.task0505;

import java.util.Arrays;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int[] a = new int[number];
        for (int i = 0; i < a.length; i++) {
            if (number > 0) {
                a[i] = console.nextInt();
            } else break;
        }
        if (number % 2 == 0) {
            for (int i = a.length - 1; i >= 0; i--) {
                System.out.println(a[i]);
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}




