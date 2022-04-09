package optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<String> emptyOpt = Optional.empty();
        Optional<String> nameOpt = Optional.of("Example ");

        print(nameOpt);
        print(emptyOpt);
    }

    private static void print(Optional<String> option) {
        if (option.isPresent()) {
            System.out.println(option.get());
        } else {
            System.out.println("Option doesn't exist: " + option.orElse("Replaced String for option"));
        }
    }
}
