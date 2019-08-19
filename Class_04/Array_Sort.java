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
public class Array_Sort {
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
        int temp,pos;
        System.out.println("Sorting");
        for(i=0;i<arr.length;i++){
            pos=i;
            for(int j=i;j<arr.length;j++){
                if(arr[pos]>arr[j])
                    pos=j;
            }
            temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
        }
        for(int k:arr)
            System.out.print(k+" ");
    }
}
