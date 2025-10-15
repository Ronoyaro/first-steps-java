package com.ronoyaro.javacore.IOs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Vamo estudar javaaaaaaa\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
