/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_07;

/**
 *
 * @author Aryan Wadhwani
 */
public class Classes_SimpleInheritance {
    static class X{
        public void FuncX(){
            System.out.println("This is from X");
        }
    }
    static class Y extends X{
        public void FuncY(){
            FuncX();
            System.out.println("This is from Y");
        }
    }
    public static void main(String args[]){
        X obX=new X();
        Y obY=new Y();
        obX.FuncX();
        System.out.println();
        obY.FuncY();
    }
}