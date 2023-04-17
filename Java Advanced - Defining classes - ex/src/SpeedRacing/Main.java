package SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String,Car> map = new LinkedHashMap<>();
        Car car = null;
        for(int i=0; i<n; i++){
            String[] arr = scanner.nextLine().split(" ");

            String model = arr[0];
            double fuelAmount = Double.parseDouble(arr[1]);
            double fuelCostPerKM = Double.parseDouble(arr[2]);

            car = new Car(model,fuelAmount,fuelCostPerKM);
            //if(map.get(model)== null){
                map.put(model,car);
           // }
        }
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] arr1 = command.split(" ");

            String model = arr1[1];
            int distance = Integer.parseInt(arr1[2]);

            if(!map.get(model).drive(distance)){
                System.out.println("Insufficient fuel for the drive");
            }

            command = scanner.nextLine();
        }


        for (String model : map.keySet()) {
            System.out.println(map.get(model).toString());
        }

    }
}
