package com.javarush.task.pro.task14.task1412;

/* 
Группировка исключений
*/

public class Solution {

    public static void main(String[] args) {
        try {
            System.out.println("Программа работает от забора");
            Thread.sleep(1000);
            System.out.println("до обеда");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Произошло исключение на букву N");
        } catch (ClassCastException e) {
            System.out.println("Произошло исключение на букву C");
        } catch ( IllegalStateException | InterruptedException | IllegalArgumentException e) {
            System.out.println("Произошло исключение на букву I");
        }
    }
}
