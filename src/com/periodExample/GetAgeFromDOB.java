package com.periodExample;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class GetAgeFromDOB {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1957, Month.JULY, 28);
         
        Period p = Period.between(birthday, today);
        System.out.println("DOB: "+birthday.getYear()+"/"+birthday.getMonth()+"/"+birthday.getDayOfMonth());
        System.out.println("AGE: "+p.getYears()+" years,"+p.getMonths()+" months,"+p.getDays()+" days");

    }

}