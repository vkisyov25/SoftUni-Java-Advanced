package DecimalToBinaryConverter;

import java.util.ArrayDeque;
import java.util.Scanner;

public class decToBin {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();


        if (num==0){
            System.out.println("0");
        }else {

            boolean is = true;
            int ostatyk=0;
            while (is){
                ostatyk = num % 2;
                num = num/2;

                stack.push(ostatyk);

                if(num ==0){
                    is=false;
                }
            }
        }

        int stackSize = stack.size(); //защото като pop-ваме се променя(намалява) размера
        for (int i=0; i<stackSize; i++){
            System.out.println(stack.pop());
        }
    }

}
