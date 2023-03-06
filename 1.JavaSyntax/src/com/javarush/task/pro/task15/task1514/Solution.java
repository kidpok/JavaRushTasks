package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path pathOne = Path.of(str1);
        Path pathTwo = Path.of(str2);

        try {
            System.out.println(pathOne.relativize(pathTwo));
        } catch (Exception e) {

        }

        }
    }


