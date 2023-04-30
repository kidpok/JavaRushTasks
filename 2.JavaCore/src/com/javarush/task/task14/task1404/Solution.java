package com.javarush.task.task14.task1404;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Коты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        while (!(key = reader.readLine()).equals("")){
            Cat cat = CatFactory.getCatByKey(key);
            System.out.println(cat.toString());
        }

    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            if (key.equals("vaska")) {
                cat = new MaleCat("Василий");
            } else if (key.equals("murka")) {
                cat = new FemaleCat("Мурочка");
            } else if (key.equals("kiska")) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
