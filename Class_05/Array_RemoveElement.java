/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_05;
import java.util.Scanner;
/**
 *
 * @author Aryan Wadhwani
 */
public class Array_RemoveElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int removeIndex;
        int[] arr=new int[]{14,32,45,23,12,55,42,12,56};
        System.out.print("Enter index to be removed from array: ");
        removeIndex=sc.nextInt();
        for(int i=removeIndex;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        for(int j=0;j<arr.length-1;j++)
            System.out.print(arr[j]+ " ");
    }
}
