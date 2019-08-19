/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_10;

/**
 *
 * @author Aryan Wadhwani
 */
public class ExceptionHandling_Throws {
    static void fun()throws ArithmeticException{
        {
            System.out.println("This is inside fun method.");
            throw new ArithmeticException("This is in main function");
        }
    }
    public static void main(String args[]){
        try{
            fun();
        }
        catch(ArithmeticException e1){
            System.out.println(e1.getMessage());
        }
    }
}
