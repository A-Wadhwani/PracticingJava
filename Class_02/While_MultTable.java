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
public class While_MultTable {
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number for multiplication table: ");
        a=sc.nextInt();
        System.out.print("Enter size of table: ");
        b=sc.nextInt();
        int i=1;
        while(i<=b){
            System.out.println(a+" x "+ i + "  =  "+ (a*i));
            i++;
        }
    }
}
