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
public class Array_SortMethod {
    public static void main(String args[]){
        int[] arr=new int[]{10,435,34,21,45,23,13,56,32,12};
        Arrays.sort(arr, 0, arr.length);
        System.out.print(Arrays.toString(arr));
    }
}
