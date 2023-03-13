package BasicStackOperations;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int N = arr[0];
        int S = arr[1];
        int X = arr[2];

        int[] arr1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i< N; i++){
            stack.push(arr1[i]);
        }
        for(int i=0; i<S; i++){
            stack.pop();
        }

        if(stack.isEmpty()){
            System.out.println("0");
        }else {
            if(stack.contains(X)){
                System.out.println("true");
            }else{
                int length = stack.size();
                int minNum = Integer.MAX_VALUE;
                for(int i=0; i<length; i++){
                    int popnum = stack.pop();
                    //int popnum1 = stack.pop();
                    if(popnum<minNum){
                        minNum = popnum;
                    }
                }
                System.out.println(minNum);
            }
        }
    }
}
