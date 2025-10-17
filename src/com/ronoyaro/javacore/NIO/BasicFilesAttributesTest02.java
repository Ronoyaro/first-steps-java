package com.ronoyaro.javacore.NIO;

import javax.naming.directory.BasicAttribute;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFilesAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("arquivo/pasta/teste.txt");

        //BasicFileAttributes para ler o arquivo baseado no SO
        //chamando o Files.readAttributes
        BasicFileAttributes readAttributes = Files.readAttributes(path, BasicFileAttributes.class);

       //FileTime para retornar quando os arquivos foram criados, acessados e modificados

        FileTime creationTime = readAttributes.creationTime();
        FileTime lastAccessTime = readAttributes.lastAccessTime();
        FileTime lastModifiedTime = readAttributes.lastModifiedTime();

        //Quando preciso setar novos valores utilizados a view, BasicFileAttributesView
        //getFilesAttributeView tem um metodo chamado setTimes recebendo o basicFileAttrView.class

        BasicFileAttributeView attributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);



    }
}
