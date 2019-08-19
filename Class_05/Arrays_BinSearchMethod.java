/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_05;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Aryan Wadhwani
 */
public class Arrays_BinSearchMethod {
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
        System.out.print("Sorted Array: ");
        Arrays.sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter element to be found: ");
        int inp=sc.nextInt();
        int index=Arrays.binarySearch(arr, inp);
        if(index<0)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at: " + (index+1));
    }
}
