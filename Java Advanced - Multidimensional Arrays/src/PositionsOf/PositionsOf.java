package PositionsOf;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int rows = arr[0];
        int cols = arr[1];

        int[][] matrix1 = new int [rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                String[] array1 = scanner.nextLine().split(" ");
                for(int d=0; d<cols; d++){
                    matrix1[i][j]= Integer.parseInt(array1[d]);
                    j++;
                }
            }
        }

        int n = Integer.parseInt(scanner.nextLine());
        boolean isFound = true;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix1[i][j]==n){
                    System.out.printf("%d %d%n",i,j);
                    isFound = false;
                }
            }
        }

        if (isFound){
            System.out.println("not found");
        }



    }
}
