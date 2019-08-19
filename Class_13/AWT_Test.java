/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_13;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Aryan Wadhwani
 */
public class AWT_Test extends Frame implements ActionListener{
    TextField tf;
    AWT_Test(){
        tf=new TextField("Hello!");
        tf.setBounds(20,40,260,260);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }
    public static void main(String args[]){
        new AWT_Test();
        
    }

}