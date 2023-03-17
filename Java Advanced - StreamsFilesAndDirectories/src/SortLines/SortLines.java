package SortLines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {
        Path inPath = Paths.get("D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path outPath = Paths.get("D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt");

        List<String> lines = Files.readAllLines(inPath);
        Collections.sort(lines);
        Files.write(outPath,lines);
    }
}
