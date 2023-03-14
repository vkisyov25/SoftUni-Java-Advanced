package PrintDiagonalsОfSquareMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
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

        int[] mainDiagonal = new int[n];
        int[] secongDiagonal = new int[n];
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    mainDiagonal[j] = matrix[i][j];
                }

                if(i+j==n-1){
                    secongDiagonal[j] = matrix[i][j];
                }
            }
        }

        for(int i =0; i<mainDiagonal.length; i++){
            System.out.printf("%d ",mainDiagonal[i]);
        }
        System.out.println();
        for(int i =0; i<secongDiagonal.length; i++){
            System.out.printf("%d ",secongDiagonal[i]);
        }


    }
}
