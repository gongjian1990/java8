package com.test.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class Test01 {

    @Test
    public void test01(){

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate+",----对比---"+new Date());

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

    }

    @Test
    public void test02(){

        LocalDate localDate = LocalDate.of(2018,3,15);

        System.out.println(localDate);

    }

    @Test
    public void test03(){

        LocalDate localDate = LocalDate.now();
        LocalDate plusDays = localDate.plusDays(10);

        System.out.println(plusDays);
    }

    @Test
    public void test04(){
        LocalDate localDate = LocalDate.now();

        LocalDate localDate1 = localDate.withDayOfMonth(5);

        System.out.println(localDate1);


        int dayOfMonth = localDate.getDayOfMonth();

        System.out.println(dayOfMonth);

        boolean after = localDate.isAfter(localDate1);

        System.out.println(after);
    }


}
