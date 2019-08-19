/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_04;
import java.util.Scanner;
/**
 *
 * @author Aryan Wadhwani
 */
public class Arrays2D_ForLoop {
    public static void main(String args[]){
        int row,col;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row and Column Size: ");
        row=sc.nextInt(); col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
