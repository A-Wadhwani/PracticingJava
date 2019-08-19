/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_09;
import java.util.*; 
/**
 *
 * @author Aryan Wadhwani
 */
public class Student_Program {
    interface calc_scores{
        int cal_avg();
        void pass_fail();
    }
    interface stud_details{
        void get_details();
        void show_details();
    }
    static abstract class Student
        implements calc_scores,stud_details{
        String name;
        int grade;
        int[] marks=new int[5];
        int studentid;
        int average;
    }
    static class Science_Student extends Student{
        
        Science_Student(){
            get_details();
            System.out.println("Details are entered.");
        }
        
        Science_Student(Student stud){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter New Name: ");
            this.name=sc.nextLine();
            this.grade=stud.grade;
            this.marks=stud.marks;
            this.average=stud.average;
            System.out.print("Enter New Student ID: ");
            this.studentid=sc.nextInt();
            System.out.println("Details are entered through copy constructor.");
        }
        
        @Override
        public int cal_avg() {
            int avg=0;
            for(int i=0;i<5;i++){
                avg=avg+marks[i];
            }
            avg=avg/5;
            return avg;
        }

        @Override
        public void pass_fail() {
            if(average>=70){
                System.out.println("Student has passed.");
            }
            else{
                System.out.print("Student has failed.");
            }
        }

        @Override
        public void get_details() {
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
            average=cal_avg();
        }
        @Override
        public void show_details() {
            Scanner sc=new Scanner(System.in);
            System.out.println("Student ID: "+ studentid);
            System.out.println("Name: "+ name);
            System.out.println("Grade: "+ grade);
            System.out.print("Marks: ");
            for(int i=0;i<5;i++){
                System.out.print(marks[i]+" ");
            }
            System.out.println("\nAverage Mark: "+average);
            pass_fail();
        }
    }
    public static void main(String args[]){
        System.out.println("First Object:");
        Science_Student s=new Science_Student();
        System.out.println("\nStudent Details of Object 1:");
        s.show_details();
        System.out.println("\nSecond Object, copying first Object:");
        Science_Student s1=new Science_Student(s);
        System.out.println("\nStudent Detials of Object 2:");
        s1.show_details();
    }   
}
