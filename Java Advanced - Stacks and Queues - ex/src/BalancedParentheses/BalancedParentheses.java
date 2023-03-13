package BalancedParentheses;

import java.util.*;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("");

        ArrayDeque<String> queue = new ArrayDeque<>();

        Collections.addAll(queue,arr);

        //boolean isYes = false;
        boolean isNo = false;
        int length = queue.size();
        for(int i=0; i<length/2 ;i++){
            String first = queue.pollFirst();
            String second = queue.pollLast();

//            if(!first.equals(second)){
//                isNo = true;
//            }
            if((first.equals("{") && second.equals("}"))){
                //isYes = true;
                //break;
            } else if ((first.equals("[") && second.equals("]"))) {
                //isYes = true;
                //break;
            } else if ((first.equals("(") && second.equals(")"))) {
                //isYes = true;
                //break;
            }
            else {
                isNo = true;
            }
        }

        if (isNo){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
