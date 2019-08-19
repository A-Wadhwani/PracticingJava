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
public class Fibonacci_Series {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b=0,c=1,sum,i=0;
        System.out.print("Enter limit for Fibonacci series: ");
        a=sc.nextInt();
        System.out.print("0 1 ");
        while(i<a){
            sum=b+c;
            b=c;
            c=sum;
            System.out.print(sum+" ");
            i++;
        }
    }
}
