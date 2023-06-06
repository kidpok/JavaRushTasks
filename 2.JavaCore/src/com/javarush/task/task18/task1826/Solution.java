package com.javarush.task.task18.task1826;

import java.io.*;
import java.nio.file.Files;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        try (FileReader reader = new FileReader(args[1]);
             FileWriter writer = new FileWriter(args[2])) {
            if (args[0].equalsIgnoreCase("-e")) {
                while (reader.ready()) {
                    int read = reader.read();
                    writer.write(read + 1);
                }
            } else if (args[0].equalsIgnoreCase("-d")) {
                while (reader.ready()) {
                    int read2 = reader.read();
                    writer.write(read2-1);
                }
            }
        }
    }

}
