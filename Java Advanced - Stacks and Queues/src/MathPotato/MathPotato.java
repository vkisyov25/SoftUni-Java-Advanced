package MathPotato;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int n = scanner.nextInt();

        ArrayDeque<String> children = new ArrayDeque<>();
        Collections.addAll(children,arr);

        while(children.size() > 1){
            for(int i=1; i<n; i++){
                String currentChild  = children.pop();
                children.offer(currentChild);
            }
            String childToRemove = children.pop();
            System.out.printf("Removed %s%n",childToRemove);
        }

        String lastChild = children.peek();
        System.out.printf("Last is %s%n",lastChild);

    }
}
