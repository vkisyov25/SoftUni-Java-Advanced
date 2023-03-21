package CountUppercaseWords;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        String[] textArr = scanner.nextLine().split(" ");

        Predicate<String> stringPredicate = e -> Character.isUpperCase(e.charAt(0));

        List<String> upperCaseWords = Arrays.stream(textArr)
                .filter(stringPredicate)
                .collect(Collectors.toList());

        System.out.println(upperCaseWords.size());
        Consumer<String> stringConsumer = e-> System.out.println(e);
        upperCaseWords.forEach(stringConsumer);
    }
}
