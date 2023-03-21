package SortEvenNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(e->Integer.parseInt(e)).collect(Collectors.toList());

        //String[] arr = scanner.nextLine().split(", ");

        List<String> evenNum = numbers.stream()
                //.map(e -> Integer.parseInt(e))
                .filter(e-> e%2==0)
                .map(e-> e.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ",evenNum));

       evenNum = evenNum.stream()
                .map(e -> Integer.parseInt(e))
               .sorted()
               .map(e -> e.toString())
               .collect(Collectors.toList());

        System.out.println(String.join(", ",evenNum));
    }
}
