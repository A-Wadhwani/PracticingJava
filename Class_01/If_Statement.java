/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_01;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class If_Statement {
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a=sc.nextInt();
        System.out.print("Enter second number: ");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.print(a+" is bigger ");
        
        }
        else
        {
            System.out.print(b+" is bigger ");
        }
    }
}
