package ie.atu.week8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("MyFile.txt");
        myFile.createNewFile();
        System.out.println(myFile.getName() + " is located at " + myFile.getAbsolutePath() + "\nand it contains " + myFile.length() + " characters");

        try {
            PrintWriter outputWriter = new PrintWriter(new FileWriter(myFile,true));
            outputWriter.println("Here is some text on a new line");
            outputWriter.println("Here's a bit more on a new line");
            outputWriter.close();
        }
        catch (IOException e){
            System.out.println("Error");
        }



    }
}
