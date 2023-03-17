package ExtractIntegers;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {


        String pathIn ="D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut ="D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";



        Scanner scanner1 = new Scanner(new FileReader(pathIn));
        PrintWriter pw = new PrintWriter(new FileOutputStream(pathOut));

        while(scanner1.hasNext()){
            if(scanner1.hasNextInt()){
                int number = scanner1.nextInt();
                System.out.println(number);
                pw.println(number);
            }
        scanner1.next();
        }
        pw.close();




    }
}
