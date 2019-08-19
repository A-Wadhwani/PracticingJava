/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_05;
import java.util.Arrays;
/**
 *
 * @author Aryan Wadhwani
 */
public class Array_CompareMethod {
    public static void main(String args[]){
        int[] arr1=new int[]{23,45,65};
        int[] arr2=new int[]{23,45,65};
        int[] arr3=new int[]{23,44,66};
        boolean arr1vs2 = Arrays.equals(arr1,arr2);
        boolean arr1vs3 = Arrays.equals(arr1,arr3);
        System.out.println(arr1vs2);
        System.out.println(arr1vs3);

    }
}
