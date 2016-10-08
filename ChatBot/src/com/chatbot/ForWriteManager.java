package com.chatbot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ForWriteManager {

    StringBuilder sb = new StringBuilder();


    public static void addFile(String fileName, String text) {

        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (PrintWriter out = new PrintWriter(file.getAbsoluteFile())) {
                out.print(text);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String readFile(String fileName) throws FileNotFoundException {

        StringBuilder sb = new StringBuilder();
        final File file = new File(fileName);
        try {
            if (file.exists()) {
                try (
                        BufferedReader in = new BufferedReader(new FileReader(fileName)) //Также не забываем закрыть файл
                        ) {

                    String s;
                    while ((s = in.readLine()) != null) {
                        sb.append(s);
                        sb.append("\n");
                    }
                }
            }
            else 
            {
                System.out.println("wrong path");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public static void updateFile(String fileName, String newText) throws FileNotFoundException {
        if (new File(fileName).exists()) {

            StringBuilder sb = new StringBuilder();
            String oldFile = readFile(fileName);
            sb.append(oldFile);
            sb.append(newText);
            addFile(fileName, sb.toString());
        }
    }
}
