package CarSalesman;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static boolean isNum(String s) {
        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //information about an engine
        Engine engine = null;
        List<Engine> engineList = new LinkedList<>();
        for (int i=0; i<n; i++){
            String[] arr1 = scanner.nextLine().split(" ");

            if(arr1.length==4){
                engine = new Engine(arr1[0],Double.parseDouble(arr1[1]),arr1[2],arr1[3]);
            } else if (arr1.length==2) {
                engine = new Engine(arr1[0],Double.parseDouble(arr1[1]));
            }else {
                if(isNum(arr1[2])){
                    engine = new Engine(arr1[0],Double.parseDouble(arr1[1]),arr1[2],"n/a");
                }else {
                    engine = new Engine(arr1[0],Double.parseDouble(arr1[1]),"n/a",arr1[2]);
                }
            }

            engineList.add(engine);

        }


        int m = Integer.parseInt(scanner.nextLine());
        //information about a car
        Car car;

        List<Car> carList = new LinkedList<>();
        for (int i=0; i<m; i++){
            String[] arr2 = scanner.nextLine().split(" ");

            for (int j=0; j<engineList.size(); j++){
                if(engineList.get(j).getModel().equals(arr2[1])){

                    if(arr2.length==4){
                        car= new Car(arr2[0],engineList.get(j),arr2[2],arr2[3]);
                    } else if (arr2.length==2) {
                        car = new Car(arr2[0],engineList.get(j));
                    }else {

                        if(isNum(arr2[2])){
                            car = new Car(arr2[0],engineList.get(j),arr2[2],"n/a");
                        }else {
                            car = new Car(arr2[0],engineList.get(j),"n/a",arr2[2]);
                        }
                    }

                    carList.add(car);
                }

            }
        }

        for(int i=0; i<carList.size(); i++){
            System.out.println(carList.get(i).toString());
        }
    }
}
