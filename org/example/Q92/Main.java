package org.example.Q92;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            String input  = br.readLine();
            System.out.println("Input String was: " + input);
        }catch(IOException e){
            e.getStackTrace();
        }
    }
}
