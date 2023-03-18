package LineNumbers;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) {

        String pathIn = "D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String pathOut = "D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\ex5.txt";


        try(BufferedReader in = new BufferedReader(new FileReader(pathIn));
            PrintWriter out = new PrintWriter(new FileWriter(pathOut))) {

            String line = in.readLine();
            int countLine=1;
            while (line != null){
                out.printf("%d. %s\n",countLine,line);

                line = in.readLine();
                countLine++;
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
