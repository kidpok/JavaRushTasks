package com.javarush.task.pro.task11.task1101;

/* 
Солнечная система — наш дом
*/

public class Solution {

    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около " + solarSystem.age + " лет.");
        System.out.println("В Солнечной системе " + solarSystem.planetsCount + " известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из " + solarSystem.starsCount + " звезды.");
        System.out.println("Звезды по имени " + solarSystem.starName + ".");
        System.out.println("Расстояние к центру галактики составляет " + solarSystem.galacticCenterDistance + " световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}
