package SerializeCustomObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class main {
    public static void main(String[] args) {
        Cube cube = new Cube("green",15.3,12.4,3.0);

        String path = "D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\ex9SerializeCustomObject.ser";

        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(path))){
            ous.writeObject(cube);
            ous.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
