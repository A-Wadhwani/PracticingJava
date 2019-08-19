/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_05;
import java.util.*;
/**
 *
 * @author Aryan Wadhwani
 */
public class Array_CopyMethod {
    public static void main(String args[]){
        int[] source=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<source.length;i++)
            source[i]=sc.nextInt();
        int[] dest=Arrays.copyOf(source, source.length);
        for(int i:dest)
            System.out.print(i+ " ");
        int[] dest2=Arrays.copyOfRange(source,3,source.length-1);
        System.out.println();
        for(int i:dest2)
            System.out.print(i+ " ");
    }
}
