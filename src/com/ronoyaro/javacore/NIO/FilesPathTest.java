package com.ronoyaro.javacore.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesPathTest {
    public static void main(String[] args) {
        Path directoryPath = Paths.get("arquivo");
        Path directoriesPath = Paths.get("arquivo\\pasta\\subpasta");
        try {
            if(Files.notExists(directoryPath) && Files.notExists(directoriesPath)) {

                Path directoryCreated = Files.createDirectory(directoryPath);
                Path directoriesCreated = Files.createDirectories(directoriesPath);

                Path filePath = Paths.get(directoryCreated.toString(), "arquivo.txt");
                Path archiveCreated = Files.createFile(filePath);

                Path source = filePath;
                Path target = Paths.get(filePath.getParent().toString(), "renamed.txt");
                Path targetCopy = Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
