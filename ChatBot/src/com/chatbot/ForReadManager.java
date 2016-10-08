package com.chatbot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ForReadManager {

   
    String changed = null;

    public String readChat(String path) { //read whole txt file, i just add that function for some reason

        BufferedReader br = null;
        String chatter = null;

        try {
            br = new BufferedReader(new FileReader(path));
            chatter = br.readLine();
            if (chatter == null) {
                System.out.println("not found file");
            }
        } catch (IOException ex1) {
        } finally {
            try {
                br.close();
            } catch (IOException ex2) {
            }
        }
        return chatter;
    }

    public void changeChat(String x) {
        
        if (x != null) {
            readChat(x);
        }

    }

    public String readInput() { //read user input
        BufferedReader brui = new BufferedReader(new InputStreamReader(System.in));
        String userInput = null;
        try {
            userInput = brui.readLine();
        } catch (IOException ex) {
        }
        return userInput;
    }

    public String randomAnswer(String path) { //get random answer for chat.
        String finalAnswer = null;
        String chatter = readChat(path);
        String[] answer = chatter.split(";");
        Random randomGenerator = new Random();
        int randomInt = +randomGenerator.nextInt(10) * answer.length / 10;
        while (finalAnswer == null) {
            finalAnswer = answer[randomInt];
        }
        return finalAnswer;
    }
}
