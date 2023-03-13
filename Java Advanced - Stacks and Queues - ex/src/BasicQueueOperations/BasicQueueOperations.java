package BasicQueueOperations;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int N = arr[0];
        int S = arr[1];
        int X = arr[2];

        int[] arr1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i< N; i++){
            stack.offer(arr1[i]);
        }
        for(int i=0; i<S; i++){
            stack.poll();
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
                    int pollNum = stack.poll();
                    if(pollNum<minNum){
                        minNum = pollNum;
                    }
                }
                System.out.println(minNum);
            }
        }
    }
}
