package com.bootcoding.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead2 {
    public static void main(String[] args) {

        try {
            File file = new File("D://BOOTCODING//file-processing//interprise//" +
                    "annual-enterprise-survey-2021-financial-year-provisional-csv.csv");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
