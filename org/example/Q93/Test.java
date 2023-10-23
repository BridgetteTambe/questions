//package org.example.Q93;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.stream.Stream;
//
//import static jdk.internal.org.jline.utils.InfoCmp.Capability.lines;
//
//public class Test {
//
//    public static void main(String[] args) {
//        try{
//           //line1
//            lines.map(l -> l.toUpperCase()).forEach(line ->{
//                try{
//                    Files.write(Paths.get("outputFile_to_path"),
//                            line.getBytes(), StandardOpenOption.CREATE);
//
//            }catch (IOExeption e){
//                    e.printStackTRace();
//
//            }
//            });
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}
