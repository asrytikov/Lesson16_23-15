package p4;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\test\\5.txt", true))){
            String text = "DDDDDDDDDDDD\n";
            String t = "";
            for (int i = 0; i < 1000; i++){
                  t += text;
            }
            writer.write(t);
            System.out.println("DONE");
        }catch (IOException exception){
            exception.printStackTrace();
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\test\\5.txt"))){
            String str;
            int i = 0;
            while ((str=bufferedReader.readLine())!=null){
                System.out.println(str);
                i++;
            }
            System.out.println(i);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
