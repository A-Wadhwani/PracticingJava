/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_03;
/**
 *
 * @author User
 */
public class Character_Triangle {
    public static void main(String args[]){
             
        for(int i=1;i<=4;i++)
        {
           char a='a';
           for(int j=1;j<=i;j++)
           {
               System.out.print(a+" ");
               a++;
           }
           System.out.println(" ");
        }
    }
}
