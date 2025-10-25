package com.ronoyaro.javacore.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("arquivo\\arquivo.txt");
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);

        boolean hidden = dosFileAttributes.isHidden();
        boolean readOnly = dosFileAttributes.isReadOnly();

        System.out.println(hidden);
        System.out.println(readOnly);

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);

        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);

        System.out.println(fileAttributeView.readAttributes().isReadOnly());
        System.out.println(fileAttributeView.readAttributes().isHidden());

    }
}
