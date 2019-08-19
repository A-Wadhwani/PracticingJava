/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_08;

/**
 *
 * @author Aryan Wadhwani
 */
public class Constructor_Overloading {
    static class student{
        int engmark, mathmark;
        public student(){
            engmark=40;
            mathmark=50;
            System.out.println("Student Class initialized.");
        }
        public student(int x, int y){
            engmark=x;
            mathmark=y;
            System.out.println("Student Class initialized with values.");
        }
    }
    static class sci_student extends student{
        int chemmark, phymark;
        public sci_student(){
            chemmark=40;
            phymark=50;
            System.out.println("Sci_Student Class initialized.\n");
        }
        public sci_student(int x, int y){
            chemmark=x;
            phymark=y;
            System.out.println("Sci_Student Class initialized with values.\n");
        }
        public sci_student(double x, double y){
            chemmark=(int) x;
            phymark=(int) y;
            System.out.println("Sci_Student Class initialized with rounded decimal values.\n");
        }
    }
    public static void main(String args[]){
        sci_student A1=new sci_student(20.5, 30.5);
        sci_student A=new sci_student(20, 30);
        sci_student B=new sci_student();
        student C=new student(45,56);
        student D=new student();
    }
}
