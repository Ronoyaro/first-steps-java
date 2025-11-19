package com.ronoyaro.javacore.classesUtils.datas;

import java.time.*;

public class DurationTest {
    private static LocalTime time;

    public static void main(String[] args) {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeAfterYears = LocalDateTime.now().plusYears(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        Duration duration = Duration.between(dateTimeNow, dateTimeAfterYears);
        Duration duration1 = Duration.between(timeNow, timeMinus7Hours);
        Duration duration2 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));

        System.out.println(duration);
        System.out.println(duration1);
        System.out.println(duration2);




    }
}
