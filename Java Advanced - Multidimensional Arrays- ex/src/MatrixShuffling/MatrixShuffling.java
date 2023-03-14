package MatrixShuffling;

import java.sql.DataTruncation;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayy = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(arrayy[0]);
        int cols = Integer.parseInt(arrayy[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] array = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = array[j];
            }
        }

        String command = scanner.nextLine();

        int row1;
        int col1;
        int row2;
        int col2;

        String temp = null;

        while (!command.equals("END")){
            String[] arr = command.split(" ");

            if(Integer.parseInt(arr[1])>rows - 1 && Integer.parseInt(arr[2])>cols - 1 && Integer.parseInt(arr[2])>rows - 1 && Integer.parseInt(arr[2])>cols - 1){
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            }else {

                if(arr[0].equals("swap") && arr.length==5){
                    row1 = Integer.parseInt(arr[1]);
                    col1 = Integer.parseInt(arr[2]);
                    row2 = Integer.parseInt(arr[3]);
                    col2 = Integer.parseInt(arr[4]);


                    temp = matrix[row1][col1]  ;
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = temp;
                    //ptint the matrix
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.printf("%s ",matrix[i][j]);
                        }
                        System.out.println();
                    }
                }else {
                    System.out.println("Invalid input!");
                    command = scanner.nextLine();
                    continue;
                }
            }



            command = scanner.nextLine();
        }
    }
}
