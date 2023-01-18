package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        for (int sum = 0; sum < 5 ; sum++){

            int number1 = scanner.nextInt();
            count = count + number1;

        }
        System.out.println(count/5);
        //напишите тут ваш код
    }
}
