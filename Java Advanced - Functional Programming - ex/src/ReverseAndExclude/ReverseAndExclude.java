package ReverseAndExclude;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(e->Integer.parseInt(e)).collect(Collectors.toCollection(ArrayList::new));
        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(list);

        BiFunction<ArrayList<Integer>,Integer, ArrayList<Integer>> func = ((list1,num) -> {
            return list1.stream().filter(e -> e%num !=0).collect(Collectors.toCollection(ArrayList::new));
        } );

        func.apply(list,n).forEach(e -> System.out.print(e +" "));
    }
}
