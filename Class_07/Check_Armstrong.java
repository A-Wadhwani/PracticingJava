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
public class Check_Armstrong {
    static int calc_armstrong(int x){
        int n=0,armstrong=0;
        int cpy=x;
        while(cpy!=0){
            n++;
            cpy=cpy/10;
        }
        int digit;
        while(x!=0){
            digit=x%10;
            armstrong=armstrong+pow(digit,n);
            x=x/10;
        }
        return armstrong;
    }
    static int pow(int no,int exp){
        int res=1;
        for(int i=0;i<exp;i++){
            res=res*no;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int input;
        System.out.print("Enter number: ");
        input=sc.nextInt();
        if(input==calc_armstrong(input)){
            System.out.println(input+" is an Armstrong Number");
        }
        else if(input!=calc_armstrong(input)){
            System.out.println(input+" is not an Armstrong Number");
        }        
    }
}
