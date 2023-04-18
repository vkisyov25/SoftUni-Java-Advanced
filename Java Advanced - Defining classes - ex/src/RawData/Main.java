package RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> carList = new LinkedList<>();
        Car car;
        for(int i=0; i<n; i++){
            String[] arr = scanner.nextLine().split(" ");

            String model = arr[0];
            int engineSpeed = Integer.parseInt(arr[1]);
            int enginePower = Integer.parseInt(arr[2]);
            int cargoWeight = Integer.parseInt(arr[3]);
            String cargoType = arr[4];
            ArrayList<Tire> tireList = new ArrayList<>();
            for (int j = 5; j < 12 ; j+=2) {
                int a = j+1;
                Tire tire = new Tire(Double.parseDouble(arr[j]),Integer.parseInt(arr[a]));
                tireList.add(tire);
            }


            Engine engine = new Engine(engineSpeed,enginePower);
            Cargo cargo = new Cargo(cargoWeight,cargoType);
            car = new Car(model, engine, cargo,tireList);

            carList.add(car);


        }

            String command = scanner.nextLine();

            if(command.equals("fragile")){

                for(int i=0; i< carList.size(); i++){
                    if(carList.get(i).getCargo().getCargoType().equals("fragile") && carList.get(i).getTires().get(i).getTirePressure()<1){
                        System.out.println(carList.get(i).getModel());
                    }
                }

            }else {
                for(int i=0; i< carList.size(); i++){
                    if(carList.get(i).getCargo().getCargoType().equals("flamable") && carList.get(i).getEngine().getEnginePower()>250){
                        System.out.println(carList.get(i).getModel());
                    }
                }
            }




    }
}
