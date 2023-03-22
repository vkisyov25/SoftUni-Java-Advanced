package CustomMinFunction;

import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr  = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        try {
            Function<int[],Integer> findMinElement =(e)->{
                //public Integer apply(int [] arr){
                int minimum = e[0];
                for(Integer num : e){
                    if(minimum>num){
                        minimum=num;
                    }
                }
                return minimum;
                //}
            };

            System.out.println(findMinElement.apply(arr));
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }
}
