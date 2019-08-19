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
public class Classes_Inheritance {
    static class obj1{
        private int a=5;
        public int c=4;
        protected int b=1;
    }
    static class obj2 extends obj1{
        private int d=7;
        protected int e=3;
        public int f=2;
        public void ret_each(){
            System.out.println(b+" "+c+" "+d+" "+e+" "+f);
        }
    }
    public static void main(String args[]){
        obj2 item=new obj2();
        item.ret_each();
        System.out.print(item.f+" "+item.c);
    }
}
