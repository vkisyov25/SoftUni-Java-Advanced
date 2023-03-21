package AddVAT;

import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> list = Arrays.stream(scanner.nextLine().split(", ")).map(e -> Double.parseDouble(e)).collect(Collectors.toList());

        list = list.stream()
                .map(e -> e + (e * 0.2))
                .collect(Collectors.toList());

        Consumer<Double> stringConsumer = e -> System.out.printf("%.2f\n",e);
        System.out.println("Prices with VAT:");
        list.forEach(stringConsumer);
    }
}
