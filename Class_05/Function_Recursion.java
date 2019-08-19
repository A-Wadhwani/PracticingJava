/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_05;

/**
 *
 * @author Aryan Wadhwani
 */
public class Function_Recursion {
    static int count=0;
    static void repeat(){
        if(count<10){
            count++;
            System.out.println("Hello "+ count);
            repeat();
        }
    }
    public static void main(String args[]){
        repeat();
    }
}
