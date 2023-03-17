package CountCharacterTypes;

import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {
        String pathIn ="D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut ="D:\\JavaPrograms\\Advanced\\Java Advanced - StreamsFilesAndDirectories - ex\\src\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\ex4.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(pathIn));
            PrintWriter out = new PrintWriter(new FileWriter(pathOut))) {

            String line = in.readLine();

            int vowels = 0;
            int otherSymbols = 0;
            int punctuation = 0;
            while(line != null){
                for (int i=0; i<line.length(); i++){
                    if(line.charAt(i)=='a'|| line.charAt(i)=='e'||line.charAt(i)=='i'||line.charAt(i)=='o'||line.charAt(i)=='u'){
                        vowels++;
                    }else if(line.charAt(i)=='!'||line.charAt(i)==','||line.charAt(i)=='.'||line.charAt(i)=='?'){
                        punctuation++;
                    }else if(line.charAt(i)!=' '){
                        otherSymbols++;
                    }

                }

                line = in.readLine();
            }
            out.printf("Vowels: %s\n",vowels);
            out.printf("Other symbols: %d\n",otherSymbols);
            out.printf("Punctuation: %d\n",punctuation);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
