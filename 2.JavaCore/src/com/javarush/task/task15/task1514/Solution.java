package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static{
        labels.put( 2.2, "Приает");
        labels.put( 2.3, "Прет");
        labels.put( 2.12, "Приет");
        labels.put( 2.123, "Пет");
        labels.put( 2.124, "Приат");
    }
    public static void main(String[] args) {

        System.out.println(labels);

    }
}
