package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишите тут ваш код
        return null;
    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            String oneHex = String.valueOf(hexNumber.charAt(i));
            String fourBit = "";
            if (oneHex.equals("0")) {
                fourBit = "0000";
            } else if (oneHex.equals("1")) {
                fourBit = "0001";
            } else if (oneHex.equals("2")) {
                fourBit = "0010";
            } else if (oneHex.equals("3")) {
                fourBit = "0011";
            } else if (oneHex.equals("4")) {
                fourBit = "0100";
            } else if (oneHex.equals("5")) {
                fourBit = "0101";
            } else if (oneHex.equals("6")) {
                fourBit = "0110";
            } else if (oneHex.equals("7")) {
                fourBit = "0111";
            } else if (oneHex.equals("8")) {
                fourBit = "1000";
            } else if (oneHex.equals("9")) {
                fourBit = "1001";
            } else if (oneHex.equals("a")) {
                fourBit = "1010";
            } else if (oneHex.equals("b")) {
                fourBit = "1011";
            } else if (oneHex.equals("c")) {
                fourBit = "1100";
            } else if (oneHex.equals("d")) {
                fourBit = "1101";
            } else if (oneHex.equals("e")) {
                fourBit = "1110";
            } else if (oneHex.equals("f")) {
                fourBit = "1111";
            }
            binaryNumber = binaryNumber + fourBit;
        }

        return binaryNumber;
    }
}
