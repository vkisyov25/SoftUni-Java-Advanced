package FindTheSmallestElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(e->Integer.parseInt(e)).collect(Collectors.toList());

        Function<List<Integer>,Integer> func =  list1 ->{
            int minimum = list1.stream().min(Integer::compareTo).get();
            return list1.lastIndexOf(minimum);
        };

        System.out.println(func.apply(list));

    }
}
