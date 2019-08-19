/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_10;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Aryan Wadhwani
 */
public class FileHandling_FileWriter {
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        FileWriter fw=new FileWriter("src/Class_10/Output.txt");
        for(int i=0;i<input.length();i++){
           fw.write(input.charAt(i)); 
        }
        System.out.println("Data written");
        fw.close();
    }
}
