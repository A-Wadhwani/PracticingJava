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
public class Array_toString {
    public static void main(String args[]){
        int[] arr=new int[10];
         for(int i=0;i<arr.length;i++)
            arr[i]=i+10;
        System.out.print(Arrays.toString(arr));
    }
}
