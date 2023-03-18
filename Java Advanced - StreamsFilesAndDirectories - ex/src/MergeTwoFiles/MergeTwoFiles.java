package MergeTwoFiles;

import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) {
        String pathIn = "D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathIn1 = "D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String pathOut ="D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\ex77.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(pathIn));
            BufferedReader in1 = new BufferedReader(new FileReader(pathIn1));
            PrintWriter out = new PrintWriter(new FileWriter(pathOut))){

            String line = in.readLine();
            while (line != null){
                out.println(line);
                line = in.readLine();
                out.flush();
            }

            String line1 = in1.readLine();
            while (line1 != null){
                out.println(line1);
                line1 = in1.readLine();
                out.flush();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
