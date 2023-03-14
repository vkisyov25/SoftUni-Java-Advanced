package MaximalSum;

import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(arr[0]);
        int cols = Integer.parseInt(arr[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] array = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(array[j]);
            }
        }


        int sum = 0;
        int biggestSum = 0;
        String[] numbers = new String[9];

        for (int i = 0; i < matrix.length; i++) {
            int[] first = matrix[i];
            if (i != matrix.length - 2) { //редовете да са два или повече иначе няма смисъл
                int[] second = matrix[i + 1];
                int[] third = matrix[i + 1 + 1];

                int counter = 0;
                while (counter < first.length - 2) {

                    sum += first[counter];
                    sum += second[counter];
                    sum += third[counter];

                    sum += first[counter + 1];
                    sum += second[counter + 1];
                    sum += third[counter + 1];

                    sum += first[counter + 2];
                    sum += second[counter + 2];
                    sum += third[counter + 2];

                    if (sum > biggestSum) {
                        biggestSum = sum;
                        numbers[0] = first[counter] + "";
                        numbers[1] = first[counter + 1] + "";
                        numbers[2] = first[counter + 1 + 1] + "";
                        numbers[3] = second[counter] + "";
                        numbers[4] = second[counter + 1] + "";
                        numbers[5] = second[counter + 1 + 1] + "";
                        numbers[6] = third[counter] + "";
                        numbers[7] = third[counter + 1] + "";
                        numbers[8] = third[counter + 1 + 1] + "";
                    }
                    sum = 0;
                    counter++;

                }
            }else{
                break;
            }
        }
        System.out.printf("Sum = %d%n",biggestSum);
        System.out.println(numbers[0] + " " + numbers[1]+" " + numbers[2]);
        System.out.println(numbers[3] + " " + numbers[4]+ " " + numbers[5]);
        System.out.println(numbers[6] + " " + numbers[7]+ " " + numbers[8]);


    }
}

