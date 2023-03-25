package CarConstructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<n; i++){
            String[] arr = scanner.nextLine().split(" ");

            CarConstructors.Car car;

            if(arr.length==1){
                 car = new Car(arr[0]);
            }else {
                car = new Car(arr[0],arr[1],Integer.parseInt(arr[2]));
            }

            System.out.println(car.toString());
        }
    }
}
