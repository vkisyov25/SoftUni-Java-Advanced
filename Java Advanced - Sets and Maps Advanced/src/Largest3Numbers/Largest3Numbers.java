package Largest3Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(scanner.nextLine()
                .split(" "))
                .map(e-> Integer.parseInt(e))
                .sorted(
                        (left,right) ->{
                            int result = right.compareTo(left);
                            return  result;
                        }

                )
                .collect(Collectors.toList());


        for (int i=0; i<list.size(); i++){
            if(i==3){
                break;
            }
            System.out.printf("%d ",list.get(i));


        }
    }
}
