package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DataReader {

    public String readerMethod(String filepath) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path:");
        filepath=scanner.next();
        String x = null;
        String n;
        FileReader fileReader;{
            try {
                fileReader = new FileReader(filepath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((n= bufferedReader.readLine())!=null) {
                     x=n;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }return x;
    }
}