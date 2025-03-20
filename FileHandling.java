import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        File myFile= new File("mansi.txt");
        try{
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
    }
}
