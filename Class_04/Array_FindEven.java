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
public class Array_FindEven {
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
        int count=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        if(count==0){
            System.out.print("No even numbers found found");
        }
        else{
            System.out.println(count+" even numbers were found in the array");
        }
    } 
}
