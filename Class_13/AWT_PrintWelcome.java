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
public class AWT_PrintWelcome extends Frame implements ActionListener{
    TextField tf;
    AWT_PrintWelcome(){
        tf=new TextField("Hello!");
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        add(b);
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
        new AWT_PrintWelcome();
        
    }

}
