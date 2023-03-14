package DiagonalDifference;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for(int i = 0; i<n; i++){
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e-> Integer.parseInt(e)).toArray();
            for(int j=0; j<n; j++){
                matrix[i][j] =arr[j];
            }
        }

        int mainDiagonalSum = 0;
        int secongDiagonalSum = 0;

        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    mainDiagonalSum += matrix[i][j];
                }

                if(i+j==n-1){
                    secongDiagonalSum += matrix[i][j];
                }
            }
        }

        int diff = mainDiagonalSum-secongDiagonalSum;
        System.out.printf("%d",Math.abs(diff));

    }
}
