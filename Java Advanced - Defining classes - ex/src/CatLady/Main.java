package CatLady;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Cat cat = null;
        List<Cat> catList = new ArrayList<>();

        while (!command.equals("End")){
            String[] arr = command.split(" ");

            if(arr[0].equals("Siamese")){
                cat = new Siamese(arr[1],Double.parseDouble(arr[2]));
            } else if (arr[0].equals("Cymric")) {
                cat = new Cymric(arr[1],Double.parseDouble(arr[2]));
            } else if (arr[0].equals("StreetExtraordinaire")) {
                cat = new Siamese(arr[1],Double.parseDouble(arr[2]));
            }

            catList.add(cat);

            command = scanner.nextLine();

        }

        String name = scanner.nextLine();

//        for (Cat cat1 : catList) {
//            if(cat1.getName().equals(name)){
//                System.out.println(cat1.toString());
//            }
//        }

        for (int i=0; i<catList.size(); i++){
            if(catList.get(i).getName().equals(name)){
                System.out.println(catList.get(i).toString());
            }
        }
    }
}
