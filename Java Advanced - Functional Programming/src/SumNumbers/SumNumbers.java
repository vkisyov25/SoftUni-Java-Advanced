package SumNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(e->Integer.parseInt(e)).collect(Collectors.toList());

        int sum = numbers.stream().mapToInt(e->Integer.parseInt(String.valueOf(e))).sum();

        System.out.printf("Count = %d\n",numbers.size());
        System.out.printf("Sum = %d",sum);
    }
}
