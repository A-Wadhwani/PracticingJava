/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_03;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class For_Loop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("Enter number to show multiplication table of: ");
        a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+" x "+i+" = "+(a*i));
        }
    }
}
