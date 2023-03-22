package AppliedArithmetics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integerArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        String command = scanner.nextLine();

        Function<int[], int[]> add = arr -> Arrays.stream(arr).map(e-> ++e).toArray();
        UnaryOperator<int[]> sub = arr -> Arrays.stream(arr).map(e-> --e).toArray();
        UnaryOperator<int[]> multiply = arr -> Arrays.stream(arr).map(e-> e *= 2).toArray();
        Consumer<int[]> printer = arr -> Arrays.stream(arr).forEach(e-> System.out.print(e + " "));

        while (!command.equals("end")){

            if(command.equals("add")){
               // integerArr = add.apply(integerArr);
                integerArr = Arrays.stream(integerArr).map(e-> ++e).toArray();
            } else if (command.equals("multiply" )) {
                integerArr = multiply.apply(integerArr);
            }else if (command.equals("subtract" )) {
                integerArr= sub.apply(integerArr);
            }else if (command.equals("print" )) {
                printer.accept(integerArr);
                System.out.println();
            }

            command = scanner.nextLine();
        }
    }
}
