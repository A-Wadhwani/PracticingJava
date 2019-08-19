/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_14;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Aryan Wadhwani
 */
class PanelForm{
    PanelForm(){
        Frame f=new Frame("Panel Example");
        Panel p1=new Panel();
        p1.setBounds(10,50,200,200);
        p1.setBackground(Color.cyan);
        Label tf=new Label("Hello!");
        tf.setBackground(Color.WHITE);
        tf.setBounds(0,0,50,100);   
        Button b=new Button("click me");
        b.setBounds(100,50,80,30);   
    //    p1.setComponentOrientation();
        p1.add(b);
        p1.add(tf);
      // f.add(b);
      // f.add(tf);
         f.add(p1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome");
            }
        });
       
    }
}
public class AWT_Panel {
    public static void main(String args[]){
        new PanelForm();
    }
}
