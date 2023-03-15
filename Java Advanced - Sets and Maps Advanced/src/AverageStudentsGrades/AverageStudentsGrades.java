package AverageStudentsGrades;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, LinkedList<Double>> map = new TreeMap<>();
        LinkedList<Double> gradeList = new LinkedList<>();

        for(int i=0; i<n; i++){
            String[] arr = scanner.nextLine().split(" ");

            String name = arr[0];
            double grade = Double.parseDouble(arr[1]);

            if(map.get(name)==null){
                gradeList = new LinkedList<>();
                gradeList.add(grade);
                map.put(name,gradeList);
            }else {
                for(int j=0; j<map.get(name).size(); j++){
                    gradeList.add(map.get(name).get(j));
                }
                gradeList.add(grade);
                map.put(name,gradeList);
            }


            gradeList = new LinkedList<>();
        }


        //problem in judge with printing
        for (Map.Entry<String, LinkedList<Double>> entry : map.entrySet()) {
            double average=0.0;
            for(int i=0; i<entry.getValue().size(); i++){
                average += entry.getValue().get(i);
            }
            average = average / entry.getValue().size();


            System.out.printf("%s -> (avg: %.2f)%n",entry.getKey(),average);


        }


    }
}
