package org.example.Q86;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {

        try{
            Path path = Paths.get("/u01/filestore.txt");
            boolean result = Files.deleteIfExists(path);
            if(result) System.out.println(path + "is deleted.");
            else System.out.println(path + "is not deleted.");
        }catch(IOException e){
            System.out.println("Exception");
        }
    }
}
