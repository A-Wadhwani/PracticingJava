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
public class While_LLtoUL {
    public static void main(String args[]){
        int a,b,c,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter beginning and end values for printing: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a;
        if(b>=a){
            while(a<=b){
                System.out.print(a+" ");
                sum=sum+a;
                a++;
            }
            System.out.println("\nSum of numbers between "+c+" and "+b+" is: "+sum);
        }
        else{
            System.out.println("Error: Beginning value is bigger than end value");
        }
    }
}
