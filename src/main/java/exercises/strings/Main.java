package exercises.strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "Text messaging, or texting, is the act of " +
                "composing and sending electronic messages, " +
                "typically consisting of alphabetic and numeric characters, " +
                "between two or more users of mobile devices, desktops/laptops, " +
                "or another type of compatible computer. " +
                "Text messages may be " +
                "sent over a cellular network, or may also be sent " +
                "via an Internet connection. \n" +
                "The term originally referred to messages sent using the " +
                "Short Message Service (SMS)? ";  //67 words
        String[] sentences = text.split("\\.|\\?|\\!");
        System.out.println("The text has " + sentences.length + " sentences.");

        String[] words = text.split(" |-|/");
        System.out.println("The text has " + words.length + " words");

        System.out.println("The text has " + text.length() + " characters");
    }
}
