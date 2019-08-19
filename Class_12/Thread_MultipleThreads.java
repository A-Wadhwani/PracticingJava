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
public class Thread_MultipleThreads {
    public static class Print_Star implements Runnable{
        public void run() {
            try{
                System.out.print("* ");
            }
            catch(Exception e){
                System.out.println("Caught the Exception.");
            }
        }
    }
    public static class Print_Hash implements Runnable{
        public void run() {
            try{
                System.out.print("# ");
            }
            catch(Exception e){
                System.out.println("Caught the Exception.");
            }
        }
    }
    public static void main(String args[]) throws InterruptedException{
        int n=1;
        for(int i=0;i<5;i++){
            Thread Star = new Thread(new Print_Star());
            Thread Hash= new Thread(new Print_Hash());
            Star.start();
            Hash.sleep(1000);
            Hash.start();
        }
    }
}
