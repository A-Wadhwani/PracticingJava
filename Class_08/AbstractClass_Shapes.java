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
public class AbstractClass_Shapes {
    static abstract class Shape{
        abstract float area();
        abstract float perimeter();
    }
    static class Oval extends Shape{
        float a,b;
        void Enter_Sides(){
            System.out.print("Enter sides for Oval: ");
            Scanner sc=new Scanner(System.in);
            a=sc.nextFloat();
            b=sc.nextFloat();
        }
        @Override
        float area() {
            float x;
            x=(float)(3.14*a*b);
            return x;
        }
        @Override
        float perimeter() {
            float x;
            x=(float) (3.14*java.lang.Math.sqrt((a*a)+(b*b)));
            return x;
        }
    }
    static class Rectangle extends Shape{
        float a,b;
        void Enter_Sides(){
            System.out.print("Enter sides for Rectangle: ");
            Scanner sc=new Scanner(System.in);
            a=sc.nextFloat();
            b=sc.nextFloat();
        }
        @Override
        float area(){
            return a*b;
        }
        @Override
        float perimeter(){
            float x = 2*(a+b);
            return x;
        }
    }
    public static void main(String args[]){
        Rectangle rect = new Rectangle();
        Oval ov=new Oval();
        ov.Enter_Sides();
        rect.Enter_Sides();
        System.out.println("Area of Rectangle: "+rect.area()+"\nPerimeter of Rectangle: "+rect.perimeter());
        System.out.println("Area of Oval: "+ov.area()+"\nPerimeter of Oval: "+ov.perimeter());
    }
}
