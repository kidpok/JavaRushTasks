package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        Thread thread = new Thread(new SpecialThread());
        thread.run();
        list.add(thread);

        Thread thread1 = new Thread(new SpecialThread());
        thread1.run();
        list.add(thread1);
        Thread thread2 = new Thread(new SpecialThread());
        thread2.run();
        list.add(thread2);
        Thread thread3 = new Thread(new SpecialThread());
        thread3.run();
        list.add(thread3);
        Thread thread4 = new Thread(new SpecialThread());
        thread4.run();
        list.add(thread4);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
