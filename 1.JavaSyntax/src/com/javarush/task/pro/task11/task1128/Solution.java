package com.javarush.task.pro.task11.task1128;

/* 
Текстовые цифры
*/

public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        switch (digit) {
            case '0':
                result = "ноль";
            case '1':
                result = "один";
            case '2':
                result = "два";
            case '3':
                result = "три";
            case '4':
                result = "четыре";
            case '5':
                result = "пять";
            case '6':
                result = "шесть";
            case '7':
                result = "семь";
            case '8':
                result = "восемь";
            case '9':
                result = "девять";
        }
        return result;
    }
}
