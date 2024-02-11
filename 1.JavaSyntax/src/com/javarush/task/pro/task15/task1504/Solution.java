package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try (InputStream input = Files.newInputStream(Path.of(scanner.nextLine()));
             OutputStream output = Files.newOutputStream(Path.of(scanner.nextLine()))
        ) {
            byte[] bytesIn = input.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];

            for (int i = 0; i < bytesIn.length; i = i + 2) {
                if (i < bytesIn.length - 1) {
                    bytesOut[i + 1] = bytesIn[i];
                    bytesOut[i] = bytesIn[i + 1];
                } else bytesOut[i] = bytesIn[i];
            }
            output.write(bytesOut);
        }


    }
}

