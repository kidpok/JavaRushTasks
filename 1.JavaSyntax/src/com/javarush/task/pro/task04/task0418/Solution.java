package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner console = new Scanner(System.in);
        boolean i = console.nextBoolean();
        if (i){
            int a = (int) Math.ceil(glass);
            System.out.println(a);
        }else {
           int b = (int) Math.floor(glass);
            System.out.println(b);
        }
        //напишите тут ваш код


    }
}