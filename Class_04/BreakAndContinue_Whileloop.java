/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_04;
import java.util.*;
/**
 *
 * @author User
 */
public class BreakAndContinue_Whileloop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x;
        label_1:
        for(int j=0;j<10;j++){
            int i=1;
            label_2:
            while(i<=10){
                System.out.print(i+" ");
                i=i+1;
                x=sc.nextInt();
                if(x==1)
                    break label_2;
                if(x==2)
                    continue label_2;
                if(x==3)
                    continue label_1;
                if(x==4)
                    break label_1;
            }
           System.out.println();
        }
        System.out.println("Hello!");
    }
}
