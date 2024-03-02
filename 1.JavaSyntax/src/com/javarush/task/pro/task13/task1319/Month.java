package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] winter = new Month[3];
        winter[0] = Month.DECEMBER;
        winter[1] = Month.JANUARY;
        winter[2] = Month.FEBRUARY;
        return winter;

    }

    public static Month[] getSpringMonths() {
        Month[] spring = new Month[3];
        spring[0] = Month.MARCH;
        spring[1] = Month.APRIL;
        spring[2] = Month.MAY;
        return spring;

    }

    public static Month[] getSummerMonths() {
        Month[] summer = new Month[3];
        summer[0] = Month.JUNE;
        summer[1] = Month.JULY;
        summer[2] = Month.AUGUST;
        return summer;
    }

    public static Month[] getAutumnMonths() {
        Month[] autumn = new Month[3];
        autumn[0] = Month.SEPTEMBER;
        autumn[1] = Month.OCTOBER;
        autumn[2] = Month.NOVEMBER;
        return autumn;
    }

}
