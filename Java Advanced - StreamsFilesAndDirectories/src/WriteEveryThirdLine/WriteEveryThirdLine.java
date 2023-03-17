package WriteEveryThirdLine;

import java.io.*;
import java.nio.Buffer;

public class WriteEveryThirdLine {
    public static void main(String[] args) {

        String pathIn = "D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";


        try(BufferedReader in = new BufferedReader(new FileReader(pathIn));
        PrintWriter out = new PrintWriter(new FileWriter(pathOut))){

            int counter =1;
            String line = in.readLine();
            while (line != null){
                if(counter %3 ==0){
                    //out.println(line);
                    out.write(line);
                    out.write("\n");
                }
                counter++;

                line = in.readLine();
            }

            out.close();

        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
