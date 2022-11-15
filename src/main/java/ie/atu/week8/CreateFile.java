package ie.atu.week8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("MyFile.txt");
        myFile.createNewFile();
        System.out.println(myFile.getName() + " is located at " + myFile.getAbsolutePath() + "\nand it contains " + myFile.length() + " characters");

        try {
            FileWriter myWriter = new FileWriter(myFile);
            myWriter.write("Here is some text");
            myWriter.write("Here is some more text");
            myWriter.close();
        }
        catch (IOException e){
            System.out.println("Error");
        }



    }
}
