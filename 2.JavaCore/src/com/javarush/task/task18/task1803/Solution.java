package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/*
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> map = new HashMap<>();
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(console.readLine())) {
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                if (!map.containsKey(read)) {
                    map.put(read, 1);
                } else {
                    map.put(read, map.get(read) + 1);
                }
            }
        }
        Collection<Integer> values = map.values();
        ArrayList<Integer> list = new ArrayList<>(values);
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        Set<Integer> set = new HashSet<>();
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() == max) {
                set.add(entry.getKey());
            }
        }
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
    }
}
