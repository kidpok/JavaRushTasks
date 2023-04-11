package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat implements CanClimb, CanRun {
    }

    public class Dog implements CanRun {

    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
    }

    public interface CanFly {
        static void fly() {

        }
    }

    public interface CanClimb {
       static void climb() {

        }
    }

    public interface CanRun {
       static   void run() {

        }
    }

}
