package KnightsOfHonor;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesArr = scanner.nextLine().split(" ");

        Consumer<String> stringConsumer = e-> System.out.printf("Sir %s\n",e);

        Arrays.stream(namesArr).forEach(stringConsumer);
    }
}
