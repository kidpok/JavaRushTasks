package com.javarush.task.pro.task04.task0424;

import java.util.Scanner;

/* 
Бомба в ядре планеты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);

        int i;
        i = bombInterface.nextInt();
        do {

            System.out.println(i);

        } while ((i % 10) != 0);

        //напишите тут ваш код
    }
}
