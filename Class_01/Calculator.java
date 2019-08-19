/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_01;
import java.util.*;
/**
 *
 * @author Aryan Wadhwani
 */
public class Calculator {
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a=sc.nextInt();
        System.out.print("Enter second number: ");
        b=sc.nextInt();
        System.out.println("Sum is: "+(a+b));
        System.out.println("Difference is: "+(a-b));
        System.out.println("Product is:"+(a*b));
        System.out.println("Quotient of a/b is:"+(a/b));
    }
}
