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
public class Array_Addition {
    public static void main(String args[]){
        int x;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        x = sc.nextInt();
        int[] a = new int[x];
        int[] b = new int[x];
        System.out.print("Enter first array elements: ");
        for(int i=0;i<x;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter second array elements: ");
        for(int i=0;i<x;i++)
            b[i]=sc.nextInt();
        System.out.print("Sum of arrays is: ");
        int[] c = new int[x];
        for(int i=0;i<x;i++)
            c[i]=a[i]+b[i];
        for(int i: c)
            System.out.print(i+" ");
    }
}
