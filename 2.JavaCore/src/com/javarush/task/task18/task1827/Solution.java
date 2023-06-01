package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            int max = 0;
            while (reader.ready()) {
                int id = Integer.parseInt(reader.readLine().substring(0, 8).trim());
                if (id > max) {
                    max = id;
                }
            }
            if (args.length != 0) {

                if (args[0].equalsIgnoreCase("-c")) {
                    String id = "";
                    String productName = "";
                    String price = "";
                    String quantity = "";
                    writer.newLine();
                    writer.write(id + productName + price + quantity);
                }
            }

        }

    }
}
