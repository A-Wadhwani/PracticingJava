/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_10;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Aryan Wadhwani
 */
public class FileHandling_FileReader {
    public static void main(String args[]) throws IOException{
        int ch;
        FileReader fr=new FileReader("src/Class_10/Output.txt");
        System.out.print("Data is as follows:\n  ");
        while((ch=fr.read())!=-1){
            if(ch==10){
                System.out.print("\n  ");
            }
            else
            System.out.print((char)ch); 
        }
        System.out.println("\nData has been read");
        fr.close();
    }
}
