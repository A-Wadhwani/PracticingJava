/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_10;

import java.util.Scanner;

/**
 *
 * @author Aryan Wadhwani
 */
public class ExceptionHandling_FinallyStatement {
    public static void main(String args[]){
        int a=5,b;
        System.out.println("Enter two numbers: ");
        try{
            Scanner sc = new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Division is: "+a/b);
        }
        catch(java.lang.ArithmeticException derr){
            System.out.println(derr.getMessage());
        }        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program Complete.");
        }
    }
}
