/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_02;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Do_Calculator {
    public static void main(String args[]){
        int a = 0,b = 0;
        char ch;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Select one of following operations: \n+ to Add\n- to Subtract\n* to Multiply\n/ to divide \n0 to exit");
        System.out.print("Enter your choice: ");
        ch = sc.next().charAt(0);
        if(ch!='0'){
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        }
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
            case '0':
                System.out.println("Goodbye!");
                break;
            default: 
                System.out.println("Wrong Choice, please try again.");
        }
        
        }while(ch!='0');
    }
}
