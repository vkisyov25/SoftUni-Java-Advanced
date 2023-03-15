package PeriodicTable;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> set = new TreeSet<>();

        for(int i=0; i<n; i++ ){
            String[] arr = scanner.nextLine().split(" ");

            for(int j=0; j<arr.length; j++){
                set.add(arr[j]);
            }
        }

        // creates Iterator oblect.
        Iterator itr = set.iterator();

        // check element is present or not. if not loop will
        // break.
        while (itr.hasNext()) {
            System.out.printf("%s ",itr.next());
        }
    }
}
