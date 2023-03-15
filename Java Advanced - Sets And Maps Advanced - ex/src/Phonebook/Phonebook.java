package Phonebook;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("stop")) {
            String[] infoArr = command.split("-");

            if (infoArr.length == 2) {
                String name = infoArr[0];
                String phoneNumber = infoArr[1];

                if(map.get(name)==null){
                    map.put(name,phoneNumber);
                }
                map.put(name,phoneNumber);
            }

            if(command.equals("search")){
                command = scanner.nextLine();
                while (!command.equals("stop")){

                    if(map.containsKey(command)){
                        int count =0;
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            System.out.printf("%s -> %s%n",command, entry.getValue());
                            count++;
                            if(count==1){
                                break;
                            }
                        }


                    }else{
                        System.out.printf("Contact %s does not exist.%n",command);
                    }
                    command = scanner.nextLine();
                }


            }


            command = scanner.nextLine();
        }
    }
}
