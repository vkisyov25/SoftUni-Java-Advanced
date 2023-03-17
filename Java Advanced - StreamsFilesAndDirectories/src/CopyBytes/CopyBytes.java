package CopyBytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CopyBytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathIn ="D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut ="D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\04." +
                " Java-Advanced-Files-and-Streams-Lab-Resources\\ventsy.txt";


        try(FileInputStream in = new FileInputStream(pathIn);
            FileOutputStream out = new FileOutputStream(pathOut);) {

            int oneByte = in.read();
            while (oneByte>=0){
               // String asciSymbiol = Integer.toBinaryString(oneByte);
                char mychar = (char) oneByte;
                if(mychar == ' ' || mychar=='\n'){
                    out.write(mychar);
                }else {
                    String str = String.valueOf(oneByte);
                    for(int i=0; i<str.length(); i++){
                        out.write(str.charAt(i));
                    }

                }
                oneByte = in.read();
            }

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
