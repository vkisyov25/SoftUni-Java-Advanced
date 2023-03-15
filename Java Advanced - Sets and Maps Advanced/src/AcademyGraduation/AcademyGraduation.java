package AcademyGraduation;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, LinkedList<Double>> map = new TreeMap<>();
        LinkedList<Double> listGrades = new LinkedList<>();

        for (int i=0; i<n; i++){
            String name = scanner.nextLine();
            double[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(e->Double.parseDouble(e)).toArray();

            if(map.get(name)==null){
                listGrades = new LinkedList<>();
                for(int j=0; j<arr.length; j++){
                    listGrades.add(arr[j]);

                }
                map.put(name,listGrades);

            }else{
                for (int k=0; k<map.get(name).size(); k++){
                    listGrades.add(map.get(name).get(k));
                }
                for(int j=0; j<arr.length; j++){
                    listGrades.add(arr[i]);
                }
                map.put(name,listGrades);
            }

            listGrades = new LinkedList<>();

        }

        // закръглянето е малко проблемно
        for (Map.Entry<String, LinkedList<Double>> entry : map.entrySet()) {
            double average=0.0;
            for(int i=0; i<entry.getValue().size(); i++){
                average += entry.getValue().get(i);
            }
            average = average / entry.getValue().size();

            System.out.printf("%s is graduated with %.3f%n",entry.getKey(),average);
        }

    }
}
