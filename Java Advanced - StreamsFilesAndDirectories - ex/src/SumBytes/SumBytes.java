package SumBytes;

import java.io.*;

public class SumBytes {
    public static void main(String[] args) {
        String path = "D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut = "D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\ex2.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(path));
            PrintWriter out = new PrintWriter(new FileWriter(pathOut))) {

            long sum=0;
            String line = in.readLine();
            while(line != null){
                for(int i=0; i< line.length(); i++){
                    sum += line.charAt(i);
                }
                //System.out.println(sum);


                line = in.readLine();

            }
            out.println(sum);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
