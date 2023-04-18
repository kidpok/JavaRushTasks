package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main1(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int numberOne = console.nextInt();
        int numberTwo = console.nextInt();
        for (int i = Math.min(numberTwo, numberOne); i > 0; i--) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                System.out.println(i);
                break;
            }

        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str1 = console.nextLine();
        String str2 = console.nextLine();
        BigInteger in = new BigInteger(str1);
        BigInteger in2 = new BigInteger(str2);
        System.out.println(in.gcd(in2));
    }
}
