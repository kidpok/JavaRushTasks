package com.javarush.task.pro.task03.task0303;

import java.util.Scanner;

/* 
Школа или институт
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 6 && age < 18){
            System.out.println("нужно ходить в школу");
        }
        else if (age >= 18){
            System.out.println("пора в институт");
        }else {

        }


    }
}
