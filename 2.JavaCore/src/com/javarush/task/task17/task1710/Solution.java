package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat output = new SimpleDateFormat("dd-MMM-yyyy");

        Person person = null;

        if (args[0].equalsIgnoreCase("-c")) {
            if (args[2].equalsIgnoreCase("м")) {
                person = Person.createMale(args[1], input.parse(args[3]));
            } else if (args[2].equalsIgnoreCase("ж")) {
                person = Person.createFemale(args[1], input.parse(args[3]));
            }
            allPeople.add(person);
            System.out.println(allPeople.size() - 1);
            //  System.out.println(allPeople.get(allPeople.size()-1));
        } else if (args[0].equalsIgnoreCase("-r")) {
            int id = Integer.parseInt(args[1]);
            if (id >= 0 && id < allPeople.size()) {
                person = allPeople.get(id);
                String sex = "";
                if (Sex.MALE.equals(person.getSex())) {
                    sex = "м";

                } else if (Sex.FEMALE.equals(person.getSex())) {
                    sex = "ж";
                }
                System.out.println(person.getName() + " " + sex + " " + output.format(person.getBirthDate()));
            }
        } else if (args[0].equalsIgnoreCase("-u")) {
            int id = Integer.parseInt(args[1]);
            if (id >= 0 && id < allPeople.size()) {
                person = allPeople.get(id);
                person.setName(args[2]);
                Sex sex = null;
                if (args[3].equalsIgnoreCase("м")) {
                    sex = Sex.MALE;
                } else if (args[3].equalsIgnoreCase("ж")) {
                    sex = Sex.FEMALE;
                }
                person.setSex(sex);
                person.setBirthDate(input.parse(args[4]));
            }
        } else if (args[0].equalsIgnoreCase("-d")) {
            int id = Integer.parseInt(args[1]);
            if (id >= 0 && id < allPeople.size()) {
                person = allPeople.get(id);
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
            }
        }


    }
}
