package com.ronoyaro.javacore.classesUtils.datas;

import com.sun.security.jgss.GSSUtil;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Map;

public class ZoneTest {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.of("America/Bahia"));

        ZoneId zoneIdChicago = ZoneId.of("America/Chicago");
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedChigadoDateTime = now.atZone(zoneIdChicago);

        Instant nowInstant = Instant.now();
        ZonedDateTime zonedChicagoInstant = nowInstant.atZone(zoneIdChicago);

        System.out.println(zonedChicagoInstant);
        System.out.println(zonedChigadoDateTime);

        ZoneOffset min = ZoneOffset.MIN;// -18:-00;
        ZoneOffset max = ZoneOffset.MAX;//+18:00

        ZoneOffset zoneOffsetManaus = ZoneOffset.of("+10:00");

        OffsetDateTime offsetNow = now.atOffset(zoneOffsetManaus);
        System.out.println(offsetNow);

        OffsetDateTime offSetInstant = nowInstant.atOffset(zoneOffsetManaus);
        System.out.println(offSetInstant);
    }
}
