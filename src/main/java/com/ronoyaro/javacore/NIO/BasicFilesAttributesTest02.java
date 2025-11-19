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

        System.out.println(creationTime);
        System.out.println(lastAccessTime);
        System.out.println(lastModifiedTime);

        System.out.println("----------------------------------------");
        //Quando preciso setar novos valores utilizados a view, BasicFileAttributesView
        //getFilesAttributeView tem um metodo chamado setTimes recebendo o basicFileAttrView.class

        BasicFileAttributeView attributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);

        FileTime newLastAcessedTime = FileTime.fromMillis(System.currentTimeMillis());

        attributeView.setTimes(lastModifiedTime, newLastAcessedTime, creationTime);

        //Lendo o arquivo novamente
        creationTime = attributeView.readAttributes().creationTime();
        lastAccessTime = attributeView.readAttributes().lastAccessTime();
        lastModifiedTime = attributeView.readAttributes().lastModifiedTime();

        System.out.println(creationTime);
        System.out.println(lastAccessTime);
        System.out.println(lastModifiedTime);





    }
}
