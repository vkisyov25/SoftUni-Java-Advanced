package ReverseNumbersWithAStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i< arr.length; i++){
            stack.push(Integer.parseInt(arr[i]));
        }

        for(int i=0; i<stack.size(); i++){
            int first = stack.pop();
            stack.offer(first);
        }

        int lendth = stack.size();
        for(int i=0; i<lendth; i++){
            System.out.print(stack.pop());
            System.out.print(" ");
        }
    }
}
