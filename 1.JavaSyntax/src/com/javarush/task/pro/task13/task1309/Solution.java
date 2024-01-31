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
        grades.put("Student 1" , 4.0);
        grades.put("Student 2", 5.0);
        grades.put("Student 3" , 3.0);
        grades.put("Student 4", 2.0);
        grades.put("Student 5" , 1.0);



    }
}
