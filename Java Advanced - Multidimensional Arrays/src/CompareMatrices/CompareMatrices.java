package CompareMatrices;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
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

        int[] arr2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int rows2 = arr2[0];
        int cols2= arr2[1];

        int[][] matrix2 = new int [rows2][cols2];

        for(int i=0; i<rows2; i++){
            for(int j=0; j<cols2; j++){

                String[] array2 = scanner.nextLine().split(" ");
                for(int d=0; d<cols2; d++){
                    matrix2[i][j]= Integer.parseInt(array2[d]);
                    j++;
                }
            }
        }

        if(rows!=rows2 && cols!=cols2){
            System.out.println("not equal");
        }else {
            if(compare(matrix1,matrix2,rows2,cols2)){
                System.out.println("equal");
            }else {
                System.out.println("not equal");
            }
        }
    }

    public static boolean compare(int[][] matrix1,int[][] matrix2, int rows2,int cols2){
       Scanner scanner = new Scanner(System.in);
       boolean isNotEquals = false;
        for(int i=0; i<rows2; i++){
            for(int j=0; j<cols2; j++){
                if(matrix1[i][j]!=matrix2[i][j]){
                    isNotEquals=true;
                }
            }
        }
        if (isNotEquals){
            return false;
        }else {
            return true;
        }
    }
}
