package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, String> map = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String str = reader.readLine();
                if (str.equalsIgnoreCase("end")) {
                    break;
                }
                int number = Integer.parseInt(str.substring(str.lastIndexOf("t") + 1));
                if (!map.containsKey(number)) {
                    map.put(number, str);
                }
            }
        }
        for (String fileName : map.values()) {
            String shortName = fileName.substring(0, fileName.lastIndexOf("."));
            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
                 BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(shortName, true))) {
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read());
                }
            }
        }

    }
}
