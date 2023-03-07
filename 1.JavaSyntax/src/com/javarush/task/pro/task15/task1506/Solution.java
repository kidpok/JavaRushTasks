package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException{
    Scanner console = new Scanner(System.in);
    String str = console.nextLine();

     List<String> list = Files.readAllLines(Path.of(str));

     for(String string: list){
         String str1 = string.replaceAll(" ", "");
         String str2 = str1.replaceAll(",", "");
         String str3 = str2.replaceAll("\\.", "");
         System.out.println(str3);

     }


    }
}

