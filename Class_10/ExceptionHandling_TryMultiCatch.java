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
public class ExceptionHandling_TryMultiCatch {
    public static void main(String args[]){
        int a,b;
        System.out.println("Enter two numbers: ");
        try{
            Scanner sc = new Scanner(System.in);
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Doing Division: ");
            System.out.println("Division is: "+a/b);
             int[] c=new int[2];
            System.out.println("Array is: "+c[3]);
        }
        catch(java.lang.ArithmeticException divideerror){
            System.out.println("Error found: "+divideerror);
        }
      
        catch(java.lang.ArrayIndexOutOfBoundsException arrayerror){
            System.out.println("Error found: "+arrayerror);
        }        
        catch(Exception e){
            System.out.println("Error found: "+e);
        }
    }
}
