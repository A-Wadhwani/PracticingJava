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
public class SpacedStar_Pattern {
    public static void main(String args[]){
        for(int i=0;i<=4;i++){
            for(int k=4;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i+1);j++){
                if(j%2==1){
                  System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
