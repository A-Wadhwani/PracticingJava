/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_04;

/**
 *
 * @author Aryan Wadhwani
 */
public class Arrays2D_Enhanced_ForLoop {
    public static void main(String args[]) throws InterruptedException{
        int[][] a=new int[][]{{24,36,72},{32,53,54},{35,10,15}};
        for(int[] i : a){
            for(int j : i){
                Thread.sleep(1000);
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
