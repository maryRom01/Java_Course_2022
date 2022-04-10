package exercises.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelsConsonants {
    public static void main(String[] args) {
        String text = "Routes and other application-specific logic can live in as many files as you wish, " +
                "in any directory structure you prefer. ";
        //vowels = 45, a, e, i, o, u, y
        //consonants = 54
        countCharacters(text);

        String text1 = "I am happy";
        findNumberOfVowelsAndConsonants(text1);
        findNumberOfVowelsAndConsonantsStream(text1);
    }

    private static void countCharacters(String text) {
        char[] array = text.toLowerCase().toCharArray();
        int counterVowels = 0, counterConsonants = 0;
        List<Character> characters = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
        List<Character> symbols = new ArrayList<>(Arrays.asList('.', ',', '-', ' '));
        for (int i = 0; i < array.length; i++) {
            if (!symbols.contains(array[i])) {
                if (characters.contains(array[i])) {
                    counterVowels++;
                } else {
                    counterConsonants++;
                }
            }
        }
        System.out.println(counterVowels);
        System.out.println(counterConsonants);
    }

    private static void findNumberOfVowelsAndConsonants(String input) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        String vowels = "aeiouy";
        String normalized = input.toLowerCase().trim();
        char[] normalizedArray = normalized.toCharArray();
        for (char c : normalizedArray) {
            if (vowels.indexOf(c) != -1) {
                vowelsCount++;
            } else if (c != ' ') {
                consonantsCount++;
            }
        }
        System.out.println(vowelsCount);
        System.out.println(consonantsCount);
    }

    public static void findNumberOfVowelsAndConsonantsStream(String input) {
        String vowels = "aeiouy";
        String normalized = input.toLowerCase().trim();

        List<Integer> letters = normalized.chars()
                .filter(Character::isAlphabetic)
                .boxed()
                .collect(Collectors.toList());

        long vowelsCount = letters.stream()
                .filter(c -> vowels.indexOf(c) != -1)
                .count();

        long consonantsCount = letters.stream().count() - vowelsCount;

        System.out.println(vowelsCount);
        System.out.println(consonantsCount);
    }
}
