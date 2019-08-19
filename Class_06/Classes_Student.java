/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_06;
import java.util.*;
/**
 *
 * @author Aryan Wadhwani
 */
public class Classes_Student {
    static class Student{
        private String name;
        private int grade;
        private int[] marks=new int[5];
        private int studentid;
        public int ret_id(){
            return studentid;
        }
        public Student(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Student ID: ");
            studentid=sc.nextInt();
            System.out.print("Enter name: ");
            sc.nextLine();
            name=sc.nextLine();
            System.out.print("Enter grade: ");
            grade=sc.nextInt();
            System.out.print("Enter marks: ");
            for(int i=0;i<5;i++){
                marks[i]=sc.nextInt();
            }
        }
        public void DisplayDetails(){
            Scanner sc=new Scanner(System.in);
            System.out.println("\n\n\n\nStudent ID: "+ studentid);
            System.out.println("Name: "+ name);
            System.out.println("Grade: "+ grade);
            System.out.print("Marks: ");
            for(int i=0;i<5;i++){
                System.out.print(marks[i]+" ");
            }
        }
    }
    public static void main(String args[]){
        Student s=new Student();
        s.DisplayDetails();
        
    }
}
