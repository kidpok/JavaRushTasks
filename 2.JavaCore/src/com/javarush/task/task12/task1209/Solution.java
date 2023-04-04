package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int i, int a) {
        if (i < a) {
            return i;
        } else return a;
    }

    public static long min(long i, long a) {
        if (i < a ){
            return i;
        }else return a;
    }

    public static double min(double i, double a) {
       if(i< a) {
           return i;
       }else return a;
    }
}
