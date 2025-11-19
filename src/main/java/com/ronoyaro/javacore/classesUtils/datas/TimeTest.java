package com.ronoyaro.javacore.classesUtils.datas;

import java.time.LocalTime;

public class TimeTest {
    public static void main(String[] args) {
        LocalTime localtime = LocalTime.now();
        System.out.println(localtime.getHour());
    }
}
