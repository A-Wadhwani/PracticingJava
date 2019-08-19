/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_05;
import java.util.*;
/**
 *
 * @author Aryan Wadhwani
 */
public class Functions_StudentDetails {
    public static void main(String args[]){
        String name; 
        int[] submarks=new int[5];
        int clas; char section;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
            name=sc.nextLine();
        System.out.print("Enter marks in 5 subjects: ");
            submarks = EnterMarks(submarks.length);
        System.out.print("Enter Class and Section: ");
            clas=sc.nextInt();
            section=sc.next().charAt(0);
        System.out.println("\n\n\n\n\nDetails are as follows: ");
            System.out.println("Name is: "+ name);
            System.out.println("Marks are: "+Arrays.toString(submarks));
            System.out.println("Class and Section is: "+ clas +" "+section);
            System.out.println("Average is: "+ avg(submarks,submarks.length));
            System.out.println("Grade is: "+grade(submarks,submarks.length));
    }
    static int[] EnterMarks(int size){
        int[] arr=new int[size];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        return arr;
    }
    static int avg(int[] a,int b){
        int sum=0,ave;
        for(int i: a)
            sum=sum+i;
        ave=sum/b;
        return ave;
    }
    static String grade(int[] arr,int size){
        int avg=avg(arr,size);
        if(avg>=95)
            return "A+";
        else if(avg>=90)
            return "A";
        else if(avg>=85)
            return "B+";
        else if(avg>=80)
            return "B";
        else if(avg>=70)
            return "C";
        else if(avg>=60)
            return "D";
        return "F";
    }
}
