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
interface Engine{
    void Accelerate(int x,int t);
    void ChangeGear(int x);
}
public class Interfaces_Vehicle implements Engine{
    int speed=0,gear;
    @Override
    public void Accelerate(int x,int t){
        this.speed=speed+(x*t);
        System.out.println("Speed is "+ speed);
    }
    @Override
    public void ChangeGear(int x){
        this.gear=x;
        System.out.println("Gear is "+ gear );
    }
    public static void main(String args[]){
        Interfaces_Vehicle obj1=new Interfaces_Vehicle();
        obj1.Accelerate(10,15);
        obj1.ChangeGear(3);
        obj1.Accelerate(20, 10);
        obj1.ChangeGear(5);
        obj1.Accelerate(15, 40);
    }
}