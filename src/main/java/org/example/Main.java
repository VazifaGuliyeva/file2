package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            BufferedWriter bufferedWriter;
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Hello,my dears groupmates");
            bufferedWriter.close();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        try{
            FileReader fileReader=new FileReader("file.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        }catch(Exception ex){
            ex.printStackTrace();

        }
    }
}