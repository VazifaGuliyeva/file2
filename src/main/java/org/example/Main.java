package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputstream = new FileOutputStream("text.file");
            String s = "Hi,my name is Vazifa";
            byte[] byteArray = s.getBytes();
            fileOutputstream.write(byteArray);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        try{
            FileInputStream fileInputstream=new FileInputStream("text.file");
            int a=0;
            while((a=fileInputstream.read())!=-1){
                System.out.print((char)a);

            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}