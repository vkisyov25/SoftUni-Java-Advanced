package MaximumElement;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0; i<N; i++){
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

            int command = arr[0];
            if(command==1){
                int num = arr[1];
                stack.push(num);
            } else if (command==2) {
                stack.pop();
            } else if (command==3) {
                int length = stack.size();
                int maxNum = Integer.MIN_VALUE;
                for (int j=0; j<length; j++){
                    int popNum = stack.pop();
                    if(popNum > maxNum){
                        maxNum =popNum;
                    }
                }
                System.out.println(maxNum);
            }
        }
    }
}
