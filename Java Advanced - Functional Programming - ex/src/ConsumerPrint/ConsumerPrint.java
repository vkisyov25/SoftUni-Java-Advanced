package ConsumerPrint;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesArr = scanner.nextLine().split(" ");

        Consumer<String> stringConsumer = e-> System.out.println(e);

        Arrays.stream(namesArr).forEach(stringConsumer);
    }
}
