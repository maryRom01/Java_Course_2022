package exercises.strings;

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
        //--------------------------------
        String literalA = "abc"; //literalA refers to the same String as literalB
        String literalB = "abc";

        System.out.println("literalA == literalB " + (literalA == literalB));
        System.out.println("literalA.equals(literalB) " + literalA.equals(literalB));

        String objectA = new String("abc"); //objectA does not refer to objectB
        String objectB = new String("abc");

        //equals() compare true values of strings rather than references and pointers
        System.out.println("literalA == objectA " + (literalA == objectA));
        System.out.println("objectA == objectB " + (objectA == objectB));
        System.out.println("literalA.equals(objectA) " + literalA.equals(objectA));
        System.out.println("objectA.equals(objectB) " + objectA.equals(objectB));
    }
}
