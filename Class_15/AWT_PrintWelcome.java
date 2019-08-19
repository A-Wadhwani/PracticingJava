/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_15;
import Class_13.*;
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
    int i=0;
    AWT_PrintWelcome(){
        tf=new TextField("Hello!");
        i++;
        tf.setFont(new Font("Lucida",Font.ITALIC,20));
        tf.setBounds(60,50,170,40);
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
        i++;
        if(i%2==0){
            tf.setText("Welcome");
            tf.setFont(new Font(Font.SERIF,Font.BOLD,14));
        }
        else{
            tf.setText("Hello!");
            tf.setFont(new Font("Lucida",Font.ITALIC,20));
        }
    }
    public static void main(String args[]){
        new AWT_PrintWelcome();
        
    }

}
