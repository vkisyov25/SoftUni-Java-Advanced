package ALLCAPITALS;

import java.io.*;

public class ALLCAPITALS {
    public static void main(String[] args) {
        String pathIn ="D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut ="D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\ex3.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(pathIn));
            PrintWriter out = new PrintWriter(new FileWriter(pathOut))) {


            String line = in.readLine();
            String ouput = "";

            while(line != null){

                ouput = line.toUpperCase();
                out.println(ouput);

                line = in.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
