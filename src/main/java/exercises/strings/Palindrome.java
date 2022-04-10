package exercises.strings;

public class Palindrome {

    public static void main(String[] args) {
        String text1 = "carerac";
        String text2 = "palindrome";
        String text3 = "citstic";
        String text4 = "20/02/20/02";

        System.out.println(isPalindrome(text1));
        System.out.println(isPalindrome(text2));
        System.out.println(isPalindrome(text3));
        System.out.println(isPalindrome(text4));
    }

    private static boolean isPalindrome(String text) {
        int splitter;
        String part1, part2;

        if (text.length() % 2 == 0) {
            splitter = text.length() / 2;
        } else {
            splitter = (text.length() - 1) / 2;
        }

        part1 = text.substring(0, splitter);
        if (text.length() % 2 == 0) {
            part2 = text.substring(splitter);
        } else {
            part2 = text.substring(splitter + 1);
        }

        if (part1.equals(new StringBuilder(part2).reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }
}
