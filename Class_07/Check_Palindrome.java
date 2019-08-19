/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_07;
import java.util.*;
/**
 *
 * @author Aryan Wadhwani
 */
public class Check_Palindrome {
    static int get_reverse(int x){
        int rev=0;
        int digit;
        while(x!=0){
            digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int input,reverse;
        System.out.print("Enter number: ");
        input=sc.nextInt();
        reverse=get_reverse(input);
        if(reverse==input){
            System.out.println(input+" is a palindrome.");
        }
        if(reverse!=input){
            System.out.println(input+" is not a palindrome.");
        }
    }
}
