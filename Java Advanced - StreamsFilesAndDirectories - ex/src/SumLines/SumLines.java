package SumLines;

import java.io.*;

public class SumLines {
    public static void main(String[] args) {

        String path = "D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut = "D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\ex1.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(path));
            PrintWriter out = new PrintWriter(new FileWriter(pathOut))) {

            long sum=0;
            String line = in.readLine();
            while(line != null){
                for(int i=0; i< line.length(); i++){
                    sum += line.charAt(i);
                }
                //System.out.println(sum);

                out.println(sum);

                line = in.readLine();
                sum=0;
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
