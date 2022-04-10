package normalizedata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String first = "  First";
        String second = " Second ";
        String third = "Third ";
        String forth = " FORTH";
        String fifth = "   ";

        List<String> lines = new ArrayList<String>(Arrays.asList(first, second, third, forth, fifth));
        lines.stream().forEach(s -> System.out.println(s.trim()));

        List<String> trimmed = lines.stream()
                .map(String::trim)
                .collect(Collectors.toList());
        System.out.println(trimmed);

        List<String> withoutSpaces = trimmed.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        List<String> normalizedLines = withoutSpaces.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(normalizedLines);

        List<String> upperCaseFirstLetter = normalizedLines.stream()
                .map(s ->
                    new StringBuilder(s).replace(0, 1, String.valueOf(s.charAt(0)).toUpperCase()).toString()
                    )
                .collect(Collectors.toList());
        System.out.println(upperCaseFirstLetter);
    }
}
