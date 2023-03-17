package WriteToFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathIn ="D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut ="D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\writeToFile.txt";


        Set<Character> punctuation = new HashSet<>();
        Collections.addAll(punctuation,',', '.', '!', '?');


        try(FileInputStream in = new FileInputStream(pathIn);
            FileOutputStream out = new FileOutputStream(pathOut);) {
            int oneByte = in.read();
            while (oneByte>=0){
                char mychar = (char) oneByte;
                if(!punctuation.contains(mychar)){
                    out.write(oneByte);
                }
                oneByte = in.read();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
