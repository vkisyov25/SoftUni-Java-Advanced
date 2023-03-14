package IntersectionOfTwoMatrices;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrix1 = new char[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                String[] array1 = scanner.nextLine().split(" ");
                for(int d=0; d<cols; d++){
                    matrix1[i][j]= array1[d].charAt(0);
                    j++;
                }
            }
        }

        char[][] matrix2 = new char[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                String[] array1 = scanner.nextLine().split(" ");
                for(int d=0; d<cols; d++){
                    matrix2[i][j]= array1[d].charAt(0);
                    j++;
                }
            }
        }

        char[][] matrix3 = new char[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix1[i][j]==matrix2[i][j]){
                    matrix3[i][j]=matrix1[i][j];
                }
                else {
                    matrix3[i][j]='*';
                }
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.printf("%c ",matrix3[i][j]);
            }
            System.out.println();
        }

    }
}

