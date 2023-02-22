package Controller;
import java.io.BufferedReader;
import java.io.FileReader;

public class Filer{

    public static String readFile() throws Exception {

        String filename = "src\\Controller\\Infix.txt";

        try{
            System.out.println("Extracting infix...");

            FileReader fileReader = new FileReader(filename); //Obj for reading files
            BufferedReader bufferedReader = new BufferedReader(fileReader); //Obj for reading files
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                return line;
            }
            bufferedReader.close();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static String getInfixExpression(){
        try{
            return readFile();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
