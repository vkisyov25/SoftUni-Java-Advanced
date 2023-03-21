package FindEvensOrOdds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String command = scanner.nextLine();

        List<Integer> integerList = new ArrayList<>();
        for(int i=arr[0]; i<=arr[1]; i++ ){
            integerList.add(i);
        }


        Predicate<Integer> integerPredicate;
        if(command.equals("even")){
            integerPredicate = e -> e % 2 == 0;
        }else {
            integerPredicate = e -> e % 2 != 0;
        }


        integerList.stream()
                .filter(integerPredicate)
                //.collect(Collectors.toList());
                .forEach(e -> System.out.printf("%d ",e));

    }
}
