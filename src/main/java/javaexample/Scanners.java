package javaexample;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        try {
            File x = new File("C:\\user\\iurri\\test.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    }


