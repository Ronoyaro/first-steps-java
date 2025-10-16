package com.ronoyaro.javacore.IO;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isFileCreated = file.createNewFile();
            System.out.println("Created: "+isFileCreated);
            System.out.println("Path: " +file.getPath());
            System.out.println("Path Absolute: "+file.getAbsolutePath());
            System.out.println("is directory: " +file.isDirectory());
            System.out.println("is file: " +file.isFile());
            System.out.println("is hidden: " +file.isHidden());
            System.out.println("last modified: " +file.lastModified());
            System.out.println("last modified: " + Instant.ofEpochMilli(file.lastModified()));
            if(file.exists()) {
                boolean isDeleted = file.delete();
                System.out.println(isDeleted);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
