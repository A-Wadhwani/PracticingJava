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
public class Array_MinandMax {
    public static void main(String args[]){
        int[] arr=new int[10];
        System.out.print("Enter 10 elements: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int maxVal=arr[0], minVal=arr[0];
        //Max Value
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxVal)
                maxVal=arr[i];
            if(arr[i]<minVal)
                minVal=arr[i];
        }
        System.out.println("Largest Value is: " + maxVal);
        System.out.println("Smallest Value is: " + minVal);
    }
}
