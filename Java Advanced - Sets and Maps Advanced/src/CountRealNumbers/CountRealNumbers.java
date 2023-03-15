package CountRealNumbers;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arr  = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> map  =new LinkedHashMap<>();

        for(int i=0; i<arr.length; i++){
            if (map.containsKey(arr[i])){
                int currentOcurrences = map.get(arr[i]);
                currentOcurrences++;
                map.put(arr[i],currentOcurrences);
            }else {
                map.put(arr[i],1);
            }
        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
