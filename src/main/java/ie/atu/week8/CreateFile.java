package ie.atu.week8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the file");
        String filename = input.nextLine();
        File myFile = new File(filename);
        myFile.createNewFile();
        System.out.println(myFile.getName() + " is located at " + myFile.getAbsolutePath() + "\nand it contains " + myFile.length() + " characters");

        try {
            PrintWriter outputWriter = new PrintWriter(new FileWriter(filename,true));
            outputWriter.println("Here is some text on a new line");
            outputWriter.println("Here's a bit more on a new line");
            outputWriter.close();
            Scanner inputFile = new Scanner(new File(filename));
            while (inputFile.hasNext()){
                String str = inputFile.nextLine();
                System.out.println(str);
            }
            inputFile.close();

        }
        catch (IOException e){
            System.out.println("Error");
        }



    }
}
