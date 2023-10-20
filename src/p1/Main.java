import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String text = "Hello all";
        try(FileOutputStream fileOutputStream = new FileOutputStream("hello.txt")){
            byte[] buffer = text.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
            System.out.println("File write data");
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        try(FileInputStream fileInputStream = new FileInputStream("hello.txt")){
            int i;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println();

        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream("hello.txt");
            byte[] bytes = new byte[256];
            int count;
            while ((count=fileInputStream.read(bytes))!=-1){
                for (int i = 0; i < count; i++) {
                    System.out.print((char)bytes[i]);
                }
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }finally {
            try{
                if (fileInputStream != null){
                    fileInputStream.close();
                }
            }catch (IOException exception){
                System.out.println(exception.getMessage());
            }
        }

    }
}