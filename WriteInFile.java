import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("mansi.txt");
            fileWriter.write("I love myself\nOK now bye");
            fileWriter.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
