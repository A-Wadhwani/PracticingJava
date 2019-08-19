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
public class ExceptionHandling_Throw {
    public static void main(String args[]){
        try{
            try{
                throw new java.lang.ArithmeticException("This is caught in inner bracket.");
            }
            catch(java.lang.ArithmeticException e){                
                System.out.println(e.getMessage());
                throw new ArithmeticException("This is caught in outer Bracket");
            }
        }
        catch(java.lang.ArithmeticException e1){
            System.out.println(e1.getMessage());
        }
    }
}
