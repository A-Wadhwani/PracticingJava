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
public class While_EvenNos {
    public static void main(String args[]){
        int a,b,c,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter beginning and end values for printing: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a;
        if(b>=a){
            while(a<=b){
                if(a%2==0){
                    System.out.print(a+" ");
                    count++;
                }
                a++;
            }
            System.out.println("\nNumber of even numbers between "+c+" and "+b+" is: "+count);
        }
        else{
            System.out.println("Error: Beginning value is bigger than end value");
        }
    }
}
