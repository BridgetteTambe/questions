package org.example.Q32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;

//public class Main {
//
//    private String [] strings = {"ASDTYUKKJNGBVGYGHYJKI","sdghyuilo;.kmngbghtf","34567890-543"};
//    public void write(String filename){
//
//try(FileChannel fileChannel = new FileOutputStream(new FileChannel(filename));){
//        for(String str: strings){
//            ByteBuffer buffer = ByteBuffer.wrap(str.getBytes());
//            fileChannel.write(buffer);
//        }
//
//    }catch(IOException e){
//        e.printStackTrace();
//    }
//
//
//    public static void main(String[] args) {
//        Main test = new Main();
//    test.write("file_to_path");
//    }
//}
