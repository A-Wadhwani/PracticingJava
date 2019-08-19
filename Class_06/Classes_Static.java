/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_06;
/**
 *
 * @author Aryan Wadhwani
 */
public class Classes_Static {
    static class obj1{
        private static int a=0;
        public int ret_a(){
            return a;
        }
        public void inc_a(){
            a++;
        }
    }
    public static void main(String args[]){
        obj1 inc=new obj1();
        obj1 display=new obj1();
        for(int i=0;i<10;i++){
            inc.inc_a();
            System.out.println("a is now: "+ display.ret_a());
        }
    }
}
