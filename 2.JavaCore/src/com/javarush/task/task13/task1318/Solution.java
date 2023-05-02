package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try(FileInputStream inputStream = new FileInputStream(str); BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
        while (reader.ready()){
            String s = reader.readLine();
            System.out.println(s);
        }
        }
    }
}