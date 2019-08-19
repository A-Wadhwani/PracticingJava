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
public class Classes_HierachicalInheritance {
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
    static class Z extends X{
        public void FuncZ(){
            FuncX();
            System.out.println("This is from Z");
        }
    }
    static class A extends X{
        public void FuncA(){
            FuncX();
            System.out.println("This is from A");
        }
    }
    public static void main(String args[]){
        X obX=new X();
        Y obY=new Y();
        Z obZ=new Z();
        A obA=new A();
        obX.FuncX();
        System.out.println();
        obY.FuncY();
        System.out.println();
        obZ.FuncZ();
        System.out.println();
        obA.FuncA();
    }
}
