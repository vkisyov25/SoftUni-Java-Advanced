package FilterByAge;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nLines = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<nLines; i++){
            String[] currentTextArr = scanner.nextLine().split(", ");

            String name = currentTextArr[0];
            int age = Integer.parseInt(currentTextArr[1]);

            if(map.get(name)==null){
                map.put(name,age);
            }
        }

        String condition = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        BiPredicate<Integer,Integer> fillterPredicate;
        if(condition.equals("older")){
            fillterPredicate  =  (age1, age2)-> age1 >= age2;
        }else {
            fillterPredicate  =  (age1, age2)-> age2 >= age1;
        }

        Consumer<Map.Entry<String,Integer>>printConsumer ;
        if(format.equals("name")){
            printConsumer = e -> System.out.println(e.getKey());
        } else if (format.equals("age")) {
            printConsumer = e -> System.out.println(e.getKey());
        }else {
            printConsumer = e -> System.out.printf("%s - %d\n", e.getKey(),e.getValue());
        }

        map.entrySet()
                .stream()
                .filter(e -> fillterPredicate.test(e.getValue(),ageLimit))
                .forEach(printConsumer);

    }
}
