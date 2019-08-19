/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_11;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Aryan Wadhwani
 */
public class FileHandling_FileMenu {
    public static void main(String args[]) throws IOException{
        int ch=1;
        while(ch!=0)
        {
            System.out.println("\nChoose operation out of following: ");
            System.out.println("1. Enter details into file.");
            System.out.println("2. View details in file.");
            System.out.println("3. Search for string in file");
            System.out.println("0. Exit program");
            System.out.print("Enter your choice: ");
            Scanner sc=new Scanner(System.in);
            ch=sc.nextInt();
            switch(ch){
                case 0:
                    break;
                case 1:
                    System.out.print("Enter string to be added to file: ");
                    sc.nextLine();
                    String inp=sc.nextLine();
                        FileWriter fw=new FileWriter("src/Class_11/Details.txt");
                        for(int i=0;i<inp.length();i++){
                            fw.write(inp.charAt(i));
                        }
                        fw.close();
                    System.out.println("Details Entered.");
                    break;
                case 2:
                    System.out.println("Details are as follows:");
                    FileReader fr=new FileReader("src/Class_11/Details.txt");
                    System.out.print("      ");
                    while((ch=fr.read())!=-1){
                        if(ch==10){
                            System.out.println();
                            System.out.print("      ");
                        }
                        else{
                            System.out.print((char)ch);
                        }
                    }
                    fr.close();
                    break;
                case 3:
                    System.out.print("Enter string to be found: ");
                    sc.nextLine();
                    String search=sc.nextLine();
                    fr=new FileReader("src/Class_11/Details.txt");
                    int in;
                    int i=0;
                    char[] array=new char[200];
                    while((in=fr.read())!=-1){
                        char c=(char)in;
                        array[i]=c;
                        i++;
                    }
                    int flag=0;
                    for(i=0;i<200;i++){
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
                    break;
                default:
                    break;
            }
        }
    }
}

