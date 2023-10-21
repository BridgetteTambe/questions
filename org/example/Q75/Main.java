package org.example.Q75;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String originalPath = "data\\projects\\a-project\\..\\..\\another-project";
        Path path = Paths.get(originalPath);
        System.out.println(path.normalize());
        System.out.println(path.toAbsolutePath());
    }
}
