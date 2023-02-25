package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
       grades.put("Артем Фролов", 4.0);
        grades.put("Артемий Фролов", 4.0);
        grades.put("Артем Иванов", 2.0);
        grades.put("Алексей Фролов", 3.0);
        grades.put("Ниджат Фролов", 5.5);

    }
}
