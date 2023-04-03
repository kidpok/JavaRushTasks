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
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        Path pathOne = Path.of(console.nextLine());

        try (InputStream inputStream = Files.newInputStream(pathOne);
             OutputStream outputStream = Files.newOutputStream(Path.of(console.nextLine()))) {

            byte[] bytes = inputStream.readAllBytes();
            byte[] copyBytes = new byte[bytes.length];
            for (int i = 0; i < bytes.length; i = i + 2) {
                if (i < bytes.length - 1) {
                    copyBytes[i + 1] = bytes[i];
                    copyBytes[i] = bytes[i + 1];
                } else {
                    copyBytes[i] = bytes[i];
                }
            }
            outputStream.write(copyBytes);
        }
    }
}

