/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_01;
import java.util.*;
/**
 *
 * @author User
 */
public class If_Compare_3Nos {
    public static void main(String args[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        a=sc.nextInt();
        System.out.print("Enter second number: ");
        b=sc.nextInt();
        System.out.print("Enter third number: ");
        c=sc.nextInt();
        if(a>=b&&a>=c){
            System.out.println(a+" is biggest of all");
        }
        else if(b>=a&&b>=c){
            System.out.println(b+" is biggest of all");
        }
        else{
            System.out.println(c+" is biggest of all");
        }
    }
}
