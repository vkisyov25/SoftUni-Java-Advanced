package CompanyRoster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        Employee employee = null;

        HashMap<String, Department> departmentsMap = new HashMap<>();


        for(int i=0; i<n; i++){
            String[] arr = scanner.nextLine().split(" ");

            String depName = arr[3];

            if(arr.length == 4){
                employee = new Employee(arr[0],Double.parseDouble(arr[1]),arr[2],arr[3]);
            }else if (arr.length==6){
                employee = new Employee(arr[0],Double.parseDouble(arr[1]),arr[2],arr[3], arr[4],Integer.parseInt(arr[5]));
            } else if (arr.length==5) {
                if(arr[4].contains("@")){
                    employee = new Employee(arr[0],Double.parseDouble(arr[1]),arr[2],arr[3], arr[4]);
                }else {
                    employee = new Employee(arr[0],Double.parseDouble(arr[1]),arr[2],arr[3], Integer.parseInt(arr[4]));
                }

            }



          if(departmentsMap.get(depName) == null){
                departmentsMap.put(depName,new Department(depName));
            }

           departmentsMap.get(depName).getEmployeeArrayList().add(employee);
        }
        departmentsMap.entrySet().stream().sorted((f,s) ->  {
            return s.getValue().getAverageSalary().compareTo(f.getValue().getAverageSalary());
        }).findFirst().stream().forEach(e ->{
            System.out.printf("Highest Average Salary: %s\n",e.getKey());
            e.getValue().getEmployeeArrayList().stream()
                    .sorted((f,s)->Double.compare(s.getSalary(),f.getSalary()))
                    .forEach(employee1 -> System.out.println(employee1.toString()));
        });


        System.out.println();
    }
}
