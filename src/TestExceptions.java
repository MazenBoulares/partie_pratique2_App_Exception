
import java.io.*;
public class TestExceptions{
    public static void main(String[] args) {

        //Open the Input file
        File inputFile = new File("Sample.jpg");
        //Open the Output file
        File outputFile1 = new File("Output1.jpg");
       try {
           //Get file handlers in Byte Stream format
           FileInputStream in1 = new FileInputStream(inputFile);
           FileOutputStream out1 = new FileOutputStream(outputFile1);

           int c1;

           while ((c1 = in1.read()) != -1) {   //Until end of file
               out1.write(c1);
           }

           //Close the files
           in1.close();
           out1.close();
       }
       catch(FileNotFoundException f){
           System.out.println("file not found");
       }
       catch(IOException e2){
           System.out.println("Io exception");
       }

    }
}


