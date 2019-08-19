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
public class Threading_Interfaces {
    public static class MultiThreadingDemo implements Runnable{
        public void run() {
            try{
                System.out.println("Thread "+Thread.currentThread().getId()+ " is running");
            }
            catch(Exception e){
                System.out.println("Caught the Exception.");
            }
        }
    }
    public static void main(String args[]){
        int n=1;
        for(int i=0;i<5;i++){
            Thread object = new Thread(new MultiThreadingDemo());
            object.start();
        }
    }
}
