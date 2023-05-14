package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] split = url.substring(url.indexOf("?") + 1).split("&");
        for (String str : split) {
            System.out.print((str.contains("=") ? str.substring(0, str.indexOf("=")) : str) + " ");
        }
        System.out.println();
        for (String str : split) {
            if (str.contains("obj")) {
                String value = str.substring(str.indexOf("=") + 1);

                try {
                    alert(Double.parseDouble(value));
                } catch (NumberFormatException e) {
                    alert(value);
                }
            }
        }


    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
