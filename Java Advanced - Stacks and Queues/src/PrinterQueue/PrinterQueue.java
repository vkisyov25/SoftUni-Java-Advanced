package PrinterQueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command =scanner.nextLine();
        ArrayDeque<String> files = new ArrayDeque<>();

        Collections.addAll(files);

        while (!command.equals("print")){
            if(command.equals("cancel")){
                if(files.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    String removeFile = files.poll();
                    System.out.printf("Canceled %s%n",removeFile);
                }

            }else {
                files.offer(command);
                //System.out.println(command);
            }


            command =scanner.nextLine();
        }

        int lenght = files.size();
        for (int i =0; i<lenght; i++){
            System.out.println(files.poll());
        }
    }
}
