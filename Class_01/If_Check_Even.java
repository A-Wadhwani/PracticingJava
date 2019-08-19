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
public class If_Check_Even {
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        a=sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is an even number");
        }
        else{
            System.out.println(a+" is an odd number");
        }
            
    }
}
