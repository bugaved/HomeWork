package com.chatbot;

import static com.chatbot.ForWriteManager.addFile;
import static com.chatbot.ForWriteManager.updateFile;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatBot {

    private static String input = "test";
    public static String path = "C:\\chat.txt";
    private static final String fileName = "C://log.txt";
    public static String textLog = "start";

    public static void main(String[] args) {
        addFile(fileName, textLog);
        boolean changed = input.startsWith("changeChat");
        ForReadManager frm = new ForReadManager();
        while (!"close".equals(input)) {

            while (!"stop".equals(input) && !"close".equals(input) && changed != true) {
                String randomas = " " + frm.randomAnswer(path) + " ";
                System.out.println(randomas);
                try {
                    updateFile(fileName, randomas);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Vvodi");
                input = frm.readInput();
                try {
                    updateFile(fileName, input);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                }
                changed = input.startsWith("changeChat");
                System.out.println(changed);

                if ("stop".equals(input)) {
                    System.out.println("ah tak! AdvoRezhim!");
                    try {
                        updateFile(fileName, " ah tak! AdvoRezhim! ");
                                } catch (FileNotFoundException ex) {
                        Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    while (!"denisko, shantazhist!".equals(input) && !"close".equals(input) && changed != true) {
                        System.out.println("ya s vami ne razgovarivau");
                        try {
                            updateFile(fileName, " ya s vami ne razgovarivau ");
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        input = frm.readInput();
                        try {
                            updateFile(fileName, input);
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                if (changed == true) {
                    String[] inputParts = input.split(" ");
                    if (inputParts.length == 2) {
                        input = inputParts[1];
                        path = input;
                        changed = false;
                    } else {
                        System.out.println("wrong path");
                        try {
                            updateFile(fileName, "wrong path");
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(ChatBot.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.exit(0);
                    }
                }

            }
        }
        System.exit(0);
    }
}
