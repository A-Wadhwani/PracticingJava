/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_05;
import java.util.Scanner ;
/**
 *
 * @author Aryan Wadhwani
 */
public class Array_InsertElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{1,4,5,6,76,86,45};
        System.out.print("Enter the index at which value is to be added: ");
        int pos=sc.nextInt();
        System.out.print("Enter the value to be added: ");
        int val=sc.nextInt();
        for(int i=arr.length-1;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=val;
        for(int i:arr)
            System.out.print(i+ " ");
    }
}
