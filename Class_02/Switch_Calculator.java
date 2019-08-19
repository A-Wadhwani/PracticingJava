/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_02;
import java.util.*;
/**
 *
 * @author User
 */
public class Switch_Calculator {                
    public static void main(String args[]){
        int a,b;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter which operation you wish to do(+,-,*,/)");
        ch = sc.next().charAt(0);
        switch(ch){
            case '+':
                System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
                break;
            case '-':
                System.out.println("Difference of "+a+" and "+b+" is: "+(a-b));
                break;
            case '*':
                System.out.println("Product of "+a+" and "+b+" is: "+(a*b));
                break;
            case '/':
                System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));
                break;
            default: 
                System.out.println("Wrong Choice, please try again.");
        }
    }
}
