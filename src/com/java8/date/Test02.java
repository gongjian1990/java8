package com.java8.date;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;

public class Test02 {

    @Test
    public void test01(){

        LocalDate with = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));

        System.out.println(with);

    }

    @Test
    public void test02(){


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        String format = dateTimeFormatter.format(LocalDate.now());

        System.out.println(format);


    }

}
