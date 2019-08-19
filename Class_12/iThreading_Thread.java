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
public class iThreading_Thread {
    static class MultiThreadingDemo extends Thread{
        public void run(){
            try{
                System.out.println("Thread "+Thread.currentThread().getId()+ " is running");
            }
            catch(Exception e){
                System.out.println("Caught the Exception.");
            }
        }
    }
    public static void main(String args[]){
       int n=3;
       for(int i=0;i<5;i++){
           MultiThreadingDemo object=new MultiThreadingDemo();
           object.start();
       }
    }
}
