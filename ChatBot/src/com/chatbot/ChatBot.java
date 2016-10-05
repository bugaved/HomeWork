package com.chatbot;

public class ChatBot {

    private static String input = null;

    public static void main(String[] args) {
        ForReadManager frm = new ForReadManager();
        while (!"close".equals(input)) {
            while (!"stop".equals(input)&&!"close".equals(input)) {
                System.out.println(frm.randomAnswer());
                System.out.println("Vvodi");
                input = frm.readInput();
            }
            if ("stop".equals(input)) {
                System.out.println("ah tak! AdvoRezhim!");
                while (!"denisko, shantazhist!".equals(input) && !"close".equals(input)) {
                    System.out.println("ya s vami ne razgovarivau");
                    input = frm.readInput();
                }
             
            }
        }
           System.exit(0);
    }
}
