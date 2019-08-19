/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_11;
import java.io.*;
import java.util.*;
/**
 *
 * @author Aryan Wadhwani
 */
public class FileHandling_FileAppend {
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        BufferedWriter bw=new BufferedWriter(new FileWriter("src/Class_11/Output.txt",true));
        bw.write(input);
        System.out.println("Data written");
        bw.close();
    }
}
