package com.ronoyaro.javacore.NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Ronald\\IdeaProjects\\first-steps-java\\newFolder\\renamedFile.txt");
        Path p2 = Paths.get("C:","Users\\Ronald\\IdeaProjects\\first-steps-java\\newFolder\\renamedFile.txt");
        Path p3 = Paths.get("C:","Users","Ronald","IdeaProjects","first-steps-java","newFolder","renamedFile.txt");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());

    }
}
