package ie.atu.week8;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("MyFile.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());


    }
}
