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
public class ConsecutiveNo_Pattern {
    public static void main(String args[]){
        int sum=1;
        for(int i=0;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print(sum+"  ");
                sum++;
            }
            System.out.println();
        }
    }
}
