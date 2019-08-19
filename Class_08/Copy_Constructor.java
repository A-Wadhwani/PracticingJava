/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_08;

/**
 *
 * @author Aryan Wadhwani
 */
public class Copy_Constructor {
    static class Info{
        private int a,b;
        public Info(int a,int b){
            this.a=a;
            this.b=b;
            System.out.println("Object Initialized with values.");
        }
        public Info(){
            a=10; b=15;
            System.out.println("Object Initialized.");
        }
        public Info(Info i){
            a=i.a;
            b=i.b;
            System.out.println("Object Initialized with copy constructor.");
        }
    }
    public static void main(String args[]){
        Info a = new Info();
        Info b = new Info(23,56);
        Info c = new Info(a);
        Info d = new Info(b);
    }
}
