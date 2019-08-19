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
public class AWT_Createby_Extend extends Frame{
    AWT_Createby_Extend(){
        Button b=new Button("Press this.");
        b.setBounds(110,135,80,30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        new AWT_Createby_Extend();
    }
}
