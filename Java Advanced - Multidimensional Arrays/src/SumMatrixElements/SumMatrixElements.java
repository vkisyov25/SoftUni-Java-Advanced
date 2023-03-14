package SumMatrixElements;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr =scanner.nextLine().split(", ");

        int rows = Integer.parseInt(arr[0]);
        int cols = Integer.parseInt(arr[1]);

        int[][] matrix = new int[rows][cols];

        for(int i = 0; i<rows; i++){
            String[] array = scanner.nextLine().split(", ");
            for(int j=0; j<cols; j++){
                matrix[i][j] =Integer.parseInt(array[j]);
            }
        }

        int sum=0;
        int rowsCount=0;
        //int colsCount=0;
        for(int i = 0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sum += matrix[i][j];
            }
            rowsCount++;
        }

        System.out.println(rowsCount);
        System.out.println(cols);
        System.out.println(sum);
    }
}
