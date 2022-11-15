package ie.atu.week8;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("MyFile.txt");
        if(myFile.exists() != true){
            myFile.createNewFile();
        }
        else{
            System.out.println("A file with the name of " + myFile.getName() + " already exists.");
        }
        System.out.println(myFile.getName() + " is located at " + myFile.getAbsolutePath() + "\nand it contains " + myFile.length() + " characters");

    }
}
