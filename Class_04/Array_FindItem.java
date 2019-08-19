/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_04;
import java.util.*;
/**
 *
 * @author Aryan Wadhwani
 */
public class Array_FindItem {
    public static void main(String args[]){
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        i=sc.nextInt();
        int[] arr=new int[i];
        System.out.print("Enter elements of the array: ");
        for(int j=0;j<arr.length;j++){
            arr[j]=sc.nextInt();
        }
        System.out.print("Enter element to be found: ");
        int inp=sc.nextInt();
        int pos=-1;
        for(i=0;i<arr.length;i++){
            if(arr[i]==inp){
                pos=i+1;
            }
        }
        if(pos==-1){
            System.out.print("Not found");
        }
        else{
            System.out.println("Element found at position "+pos );
        }
    }
}
