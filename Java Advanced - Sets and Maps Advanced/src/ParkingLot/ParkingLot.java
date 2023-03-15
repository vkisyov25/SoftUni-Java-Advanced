package ParkingLot;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(", ");

        Set<String> set = new HashSet<>();

        while (!arr[0].equals("END")){


            if(arr[0].equals("IN")){
                set.add(arr[1]);
            } else if (arr[0].equals("OUT")) {
                set.remove(arr[1]);
            }

            if(set.isEmpty()){
                System.out.println("Parking Lot is Empty");
            }



            arr = scanner.nextLine().split(", ");
        }


        // creates Iterator oblect.
        Iterator itr = set.iterator();

        // check element is present or not. if not loop will
        // break.
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
