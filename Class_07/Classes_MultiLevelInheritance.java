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
public class Classes_MultiLevelInheritance {
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
    static class Z extends Y{
        public void FuncZ(){
            FuncX();
            FuncY();
            System.out.println("This is from Z");
        }
    }
    public static void main(String args[]){
        X obX=new X();
        Y obY=new Y();
        Z obZ=new Z();
        obX.FuncX();
        System.out.println();
        obY.FuncY();
        System.out.println();
        obZ.FuncZ();
    }
}
