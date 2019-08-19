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
public class RowNumber_Pattern {
    public static void main(String args[]){
        for(int i=0;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
