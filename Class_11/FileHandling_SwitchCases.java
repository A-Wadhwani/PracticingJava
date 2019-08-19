/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_11;
import java.io.*;
/**
 *
 * @author Aryan Wadhwani
 */
public class FileHandling_SwitchCases {
    static int count_string() throws IOException{
        int x=0;
        FileReader fr=new FileReader("src/Class_11/Input.txt");
        int i;
        while((i=fr.read())!=-1){
            x++;
        }
        fr.close();
        return x;
    }
    public static void main(String args[]) throws IOException{
        FileReader fr=new FileReader("src/Class_11/Input.txt");
        FileWriter fw=new FileWriter("src/Class_11/Output.txt");
        int i;
        char[] input=new char[count_string()];
        int count=0;
        while((i=fr.read())!=-1){
            input[count]=(char)i;
            count++;
        }
        for(i=0;i<count_string();i++){
            if(Character.isLowerCase(input[i])){
                fw.write(Character.toUpperCase(input[i]));
            }
            else if(Character.isUpperCase(input[i])){
                fw.write(Character.toLowerCase(input[i]));
            }
            else{
                fw.write(input[i]);
            }
        }
        System.out.println("Switched Cases and written in Output text");
        fw.close();
        fr.close();
    }
}
