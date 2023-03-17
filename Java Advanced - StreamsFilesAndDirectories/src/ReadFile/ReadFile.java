package ReadFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = "D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try(FileInputStream  in = new FileInputStream(path)) {
            int oneByte = in.read();
            while (oneByte>=0){
                System.out.printf("%s ",Integer.toBinaryString(oneByte));

                oneByte = in.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
