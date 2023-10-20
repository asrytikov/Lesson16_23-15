package p2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        String text = "Hello ALL";
        try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\test\\1.txt");
            PrintStream printStream = new PrintStream(fileOutputStream);
        ){
            printStream.println(text);
            System.out.println("Write data fin");
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        try(PrintStream printStream = new PrintStream("D:\\test\\2.txt")) {
            printStream.print(text);
            printStream.println(" Some text");
            printStream.printf("Name %s Age %d \n", "Ivan", 23);
            String mes = "TEST TEST TEST";
            byte[] mesArr = mes.getBytes();
            printStream.write(mesArr);
            System.out.println("2.txt is done");
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        try(PrintWriter printWriter = new PrintWriter("D:\\test\\3.txt")){
            printWriter.println("TEST TEST");
        }catch (IOException exception){}


    }

}
