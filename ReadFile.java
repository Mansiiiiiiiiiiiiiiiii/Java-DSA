import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File myFile = new File("mansi.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
