package p3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("D:\\test\\4.txt", true)){
            String text = "BLA LA LA";
            writer.write(text);
            writer.append("\n");
            writer.write(text);
            writer.flush();
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        try(FileReader reader = new FileReader("D:\\test\\4.txt")){

            int a;
            while ((a=reader.read())!=-1){
                System.out.print((char)a);
            }

        }catch (IOException exception){
            exception.printStackTrace();
        }


    }

}
