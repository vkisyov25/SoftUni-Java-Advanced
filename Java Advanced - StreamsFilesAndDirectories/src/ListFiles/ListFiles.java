package ListFiles;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File file = new File("D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        if(file.exists()){
            if(file.isDirectory()){
                File[] files = file.listFiles();
                for (int i=0; i< files.length; i++){
                    if(!files[i].isDirectory()){
                        System.out.printf("%s: [%s]\n",files[i].getName(), files[i].length());
                    }
                }
            }
        }
    }
}
