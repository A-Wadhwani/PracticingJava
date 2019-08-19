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
public class Thread_Sleep {
    public static class Count extends Thread{
        Count(){
            super("Hello");
            System.out.println("Thread Created: "+ this);
            this.start();
        }
        @Override
        public void run(){
            try{
                for(int i=0;i<5 ;i++){
                    System.out.println("Printing the count: "+i);
                    Thread.sleep(1000);
                }
            }
            catch(InterruptedException e){
                System.out.println("Inner thread's interrupted.");
            }
            System.out.println("Inner thread's complete");
        }
    }
    public static void main(String args[]){
        Count object=new Count();
        try{
            while(object.isAlive()){
                System.out.println("Main thread will live when child thread is live");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread's over.");
    }
}
