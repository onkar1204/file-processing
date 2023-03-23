package com.bootcoding.fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteFileDataExOne {

    public void writeF(File file){

        try {
            FileWriter fileWriter = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(int i=0;i<100;i++){
                bufferedWriter.write(randomNameGenerator()+""+i);
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();

            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        File file =new File("D://BOOTCODING//file-processing//firstone//Example.txt");
        WriteFileDataExOne writeFileData = new WriteFileDataExOne();

        writeFileData.writeF(file);
    }

    public String randomNameGenerator(){
        String[] name ={"Ravi","raju","Pravin","Sumedha","Ajay","Joy","Suresh"};

        Random random = new Random();
        return name[random.nextInt(name.length)];
    }



}