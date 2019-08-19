/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_13;
import java.awt.*;
/**
 *
 * @author Aryan Wadhwani
 */
public class AWT_Createby_Association {
    AWT_Createby_Association(){
        Frame f=new Frame();
        Button b=new Button("Press this.");
        b.setBounds(110,135,80,30);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new AWT_Createby_Extend();
    } 
}
