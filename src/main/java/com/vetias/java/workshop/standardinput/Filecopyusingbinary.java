package com.vetias.java.workshop.standardinput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopyusingbinary {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("nature.jpeg");
            FileOutputStream outputStream = new FileOutputStream("output.jpeg")) {
            
            byte[] chunk = new byte[1024];
            int byteRead;
            
            while ((byteRead = inputStream.read(chunk)) != -1) {
                outputStream.write(chunk, 0, byteRead);
            }
        } catch (IOException e) {
            System.out.println("Error in reading or writing file");
        }
    }
}
