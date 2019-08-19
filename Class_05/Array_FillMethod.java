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
public class Array_FillMethod {
    public static void main(String args[]){
        int[] arr=new int[10];
        Arrays.fill(arr, 3,5, 123);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 123);
        System.out.println(Arrays.toString(arr));
    }
}
