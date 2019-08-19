/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_02;
/**
 *
 * @author User
 */
public class While_1to10 {
    public static void main(String args[]){
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            i=i+1;
        }
        System.out.println();
        i=1;
        do{
            System.out.print(i+" ");
            i=i+1;
        }while(i<=10);
    }
}
