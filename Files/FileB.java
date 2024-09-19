import java.io.*;
import java.util.Scanner;

public class FileB{
    public static void main(String[] args) {
        File myObj = new File("samplefile.txt");
        try {
            if(myObj.createNewFile()){
                System.out.println("File Created Sucessfull :"+ myObj.getName());
                FileWriter myWriter = new FileWriter(myObj.getName());
                myWriter.write("Hey its me Bose!!!");
                myWriter.close();
            }
        } catch (Exception e) {
            System.out.println("Error Occured!");
            e.printStackTrace();
        }
        //Reading a File 

        try {
            Scanner myReader = new Scanner(myObj);
            if(myReader.hasNextLine()){
                String data = myReader.nextLine();
                myReader.close();
                System.out.println("Readed Data :" + data);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        //deleting files 

        try {
            if(myObj.delete()){
                System.out.println("File Deleted Successfully!!!");
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}