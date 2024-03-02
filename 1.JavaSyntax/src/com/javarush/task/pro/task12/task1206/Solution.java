package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        char[] charArray = string.toCharArray();
        int digits = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(Character.isDigit(charArray[i])){
                digits++;
            }
        }
        return digits;
    }

    public static int countLetters(String string) {
        char[] charArray = string.toCharArray();

        int digits = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])){
                digits = digits + 1;
            }
        }
        return digits;
    }

    public static int countSpaces(String string) {
        char[] charSpace = string.toCharArray();

        int digits = 0;
        for (int i = 0; i < charSpace.length; i++) {
            if(Character.isSpace(charSpace[i])){
                digits = digits + 1;
            }
        }
        return digits;
    }
}
