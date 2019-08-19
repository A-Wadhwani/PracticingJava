/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_06;
import java.util.*;
/**
 *
 * @author Aryan Wadhwani
 */
public class Function_Factorial {
    static class Factorial{
        private double number, factorial=1;
        private int count=1;
        public void get_no(double x){
            number=x;
            count=1;
            cal_fac();
        }
        public void cal_fac(){
            if(count<=number){
                factorial=factorial*count;
                count++;
                cal_fac();
            }          
        }
        public double ret_fac(){
            return factorial;
        }
    }
    public static void main(String args[]){
        Factorial obj1=new Factorial();
            double x;
        System.out.print("Enter number to calculate factorial of: ");
            Scanner sc=new Scanner(System.in);
            x=sc.nextDouble();
        obj1.get_no(x);
        System.out.println("Factorial of number is: "+ obj1.ret_fac());
    }
}
