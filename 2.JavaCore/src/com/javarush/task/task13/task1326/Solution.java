package com.javarush.task.task13.task1326;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner console = new Scanner(System.in);
             FileInputStream inputStream = new FileInputStream(console.nextLine());
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            List<Integer> list = new ArrayList<>();
            while (reader.ready()) {
                list.add(Integer.parseInt(reader.readLine()));
            }
            list.stream().filter(i -> i % 2 == 0).sorted().forEach(i -> System.out.println(i));

        }
    }
}
