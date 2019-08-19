/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_11;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Aryan Wadhwani
 */
public class FileHandling_FileSearch {
    public static void main(String args[]) throws IOException{
        System.out.print("Enter string to be found: ");
        Scanner sc=new Scanner(System.in);
        String search=sc.nextLine();
        FileReader fr=new FileReader("src/Class_11/Output.txt");
        int in;
        int i=0;
        char[] array=new char[50];
        while((in=fr.read())!=-1){
            char c=(char)in;
            array[i]=c;
            i++;
        }
        int flag=0;
        for(i=0;i<50;i++){
            if(array[i]==search.charAt(0)){
                flag=1;
                for(int j=0;j<search.length();j++){
                    if(search.charAt(j)!=array[j+i]){
                        flag=0;
                    }
                }
                if(flag==1){
                    fr.close();
                }
            }
        }
        if(flag==0){
            fr.close();
            System.out.println("String was not found");
        }
        else if(flag==1){
            System.out.println("String was found.");
        }
    }
}
