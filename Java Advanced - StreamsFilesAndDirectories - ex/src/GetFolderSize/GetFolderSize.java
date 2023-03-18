package GetFolderSize;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        File file = new File("D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources");

        if(file.isDirectory()){
            System.out.println(file.length());
        }
    }
}
