package PredicateForNames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        BiFunction<List<String>,Integer,List<String>> biPredicate = ((list, length) ->{
            return list.stream().filter(e -> e.length()<=length).collect(Collectors.toList());

        });

       // biPredicate.test(names,n).forEach(e -> System.out.print(e +" "));
          biPredicate.apply(names,n).forEach(e -> System.out.println(e));
    }
}
