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
public class Switch_ColorCode {
    public static void main(String args[]){
        char a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character from VIBGYOR: ");
        a=sc.next().charAt(0);
        switch(a){
            case 'V':
                System.out.println("Your color is Violet");
                break;
            case 'I':
                System.out.println("Your color is Indigo");
                break;
            case 'B':
                System.out.println("Your color is Blue");
                break;
            case 'G':
                System.out.println("Your color is Green");
                break;
            case 'Y':
                System.out.println("Your color is Yellow");
                break;
            case 'O':
                System.out.println("Your color is Orange");
                break;
            case 'R':
                System.out.println("Your color is Red");
                break;
            default:
                System.out.println("Wrong choice, try again");
                break;
        }
    }
}
