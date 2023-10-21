package org.example.Q77;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       // public void resourceFindings () {

            List<Reader> dateFiles = new ArrayList<>();
            File indexFile = new File("MyIndex.idx");
            try (BufferedReader indexReader =

                         new BufferedReader(new FileReader(indexFile))) {
                for (String file = indexReader.readLine();
                     file != null; file = indexReader.readLine()) {
                    BufferedReader dataReader = new BufferedReader(
                            new FileReader(new File(file)));//line 1
                    dateFiles.add(dataReader); // line 2
//                processData(dataReader);//line 3
                }
            } catch (IOException e) {
//..
            } finally {
                for (Reader r : dateFiles) {
                    try {
                        r.close();
                    } catch (IOException e) {

                    }// line 4
                }
            }
        }
    }
//}

