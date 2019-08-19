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
public class If_Pass_Fail {
    public static void main(String args[]){
        int a,b,c,avg;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student's marks in three subjects: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        avg=(a+b+c)/3;
        if(avg>100){
            System.out.println("Student has passed!");
        }
        else{
            System.out.println("Student has failed!");
        }
    }
}
