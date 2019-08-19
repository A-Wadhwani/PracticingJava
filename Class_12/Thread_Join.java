/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_12;
/**
 *
 * @author Aryan Wadhwani
 */
public class Thread_Join {
    static class test extends Thread{
        @Override
        public void run(){
            for(int i=0;i<2;i++){
                try{
                    Thread.sleep(1000);
                    System.out.println("Current thread is: "+Thread.currentThread().getName());
                } 
                catch (InterruptedException ex) {
                    System.out.println("Thread "+Thread.currentThread().getName()+" was interrupted.");
                }
            }
        }
    }
    public static void main(String args[]){
        test obj1=new test();
        test obj2= new test();
        test obj3=new test();
        obj1.start();
        try{
            System.out.println("Current thread: "+Thread.currentThread().getName());
            obj1.join();
        }
        catch(InterruptedException e){
            System.out.println("Exception has been caught.");
        }
        obj2.start();
        try{
            System.out.println("Current thread: "+Thread.currentThread().getName());
            obj2.join();
        }
        catch(InterruptedException e){
            System.out.println("Exception has been caught.");
        }
        obj3.start();
        try{
            System.out.println("Current thread: "+Thread.currentThread().getName());
            obj3.join();
        }
        catch(InterruptedException e){
            System.out.println("Exception has been caught.");
        }
    }
}
