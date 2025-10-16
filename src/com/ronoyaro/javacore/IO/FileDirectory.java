package com.ronoyaro.javacore.IO;

import java.io.File;
import java.io.IOException;

public class FileDirectory {
    public static void main(String[] args) {
        File directory = new File("folder");
        boolean isFileCreated = directory.mkdir();
        System.out.println(isFileCreated);
        try {
            File archive = new File(directory, "archive.txt");
            boolean isArchiveCreated = archive.createNewFile(); //criado
            File renamedFile = new File(directory, "renamedFile.txt"); // arquivo novo
            boolean isRenamed = archive.renameTo(renamedFile);  //renomeado para o arquivo novo
            System.out.println(isRenamed);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Para diretório
        File newDirectory = new File("newFolder");
        boolean isDirectoryRenamed = directory.renameTo(newDirectory);
        System.out.println(isDirectoryRenamed);

    }
}
