package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new LinkedHashMap<>();

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            while (reader.ready()) {
                String string = reader.readLine();
                String id = string.substring(0, 8).trim();
                if (!map.containsKey(id)) {
                    map.put(id, string);
                }
            }
            if (args.length != 0) {
                if (args[0].equalsIgnoreCase("-u")) {
                    String id = args[1].trim();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry.getKey().equalsIgnoreCase(id)) {
                            String put = map.put(id, checkLength(args[2], 30)
                                                       + checkLength(args[3], 8)
                                                          + checkLength(args[4], 4));
                        }
                    }
                } else if (args[0].equalsIgnoreCase("-d")) {
                    String id = args[1].trim();
                    map.entrySet().removeIf(entry -> entry.getKey().equalsIgnoreCase(id));
                }

            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    writer.write(checkLength(entry.getKey(), 8) + entry.getValue());
                    writer.newLine();
                }
            }

        }
    }

    private static String checkLength(String str, int limit) {
        StringBuilder builder = new StringBuilder(str);
        if (str.length() > limit) {
            return str.substring(0, limit);
        } else {
            while (builder.length() != limit) {
                builder.append(" ");
            }
            return builder.toString();
        }
    }
}
