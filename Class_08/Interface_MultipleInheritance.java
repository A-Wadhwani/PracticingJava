/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_08;
import java.util.Scanner;

/**
 *
 * @author Aryan Wadhwani
 */
public class Interface_MultipleInheritance {
    interface area{
        float calc_area();
    }
    interface perimeter{
        float calc_peri();
    }
    interface longest_diagonal{
        float calc_diagonal();
    }
    static abstract class Shape
            implements area,perimeter,longest_diagonal{  
        abstract void Enter_Sides();
    }
    static class Oval extends Shape{
        float a,b;
        @Override
        void Enter_Sides(){
            System.out.print("Enter sides for Oval: ");
            Scanner sc=new Scanner(System.in);
            a=sc.nextFloat();
            b=sc.nextFloat();
        }
        @Override
        public float calc_area() {
            float x;
            x=(float)(3.14*a*b);
            return x;
        }
        @Override
        public float calc_peri() {
            float x;
            x=(float) (3.14*java.lang.Math.sqrt((a*a)+(b*b)));
            return x;
        }
        @Override
        public float calc_diagonal() {
            if(a>b)
                return 2*a;
            else
                return 2*b;
        }
    }
    static class Rectangle extends Shape{
        float a,b;
        @Override
        void Enter_Sides(){
            System.out.print("Enter sides for Rectangle: ");
            Scanner sc=new Scanner(System.in);
            a=sc.nextFloat();
            b=sc.nextFloat();
        }
        @Override
        public float calc_area(){
            return a*b;
        }
        @Override
        public float calc_peri(){
            float x = 2*(a+b);
            return x;
        }
        @Override
        public float calc_diagonal() {
            return (float)(java.lang.Math.sqrt((a*a)+(b*b)));
        }
    }
    public static void main(String args[]){
        Rectangle rect = new Rectangle();
        Oval ov=new Oval();
        ov.Enter_Sides();
        rect.Enter_Sides();
        System.out.println("\nArea of Rectangle: "+rect.calc_area()+"\nPerimeter of Rectangle: "+rect.calc_peri()+"\nLongest diagonal: "+rect.calc_diagonal());
        System.out.println("\nArea of Oval: "+ov.calc_area()+"\nPerimeter of Oval: "+ov.calc_peri()+"\nLongest diagonal: "+ov.calc_diagonal());
    }
}
