package com.ronoyaro.javacore.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAttributesTest {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now().minusDays(5);
        Instant instantFiveDaysBefore = ldt1.toInstant(ZoneOffset.UTC);
        FileTime fileTimeFormatted = FileTime.from(instantFiveDaysBefore);

        Path pathTeste = Paths.get("arquivo/pasta/teste.txt");
        try{
            Path createdFile = Files.createFile(pathTeste);
            Files.setLastModifiedTime(pathTeste, fileTimeFormatted);
            System.out.println(Files.isExecutable(pathTeste));
            System.out.println(Files.isWritable(pathTeste));
            System.out.println(Files.isReadable(pathTeste));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
