/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_15;
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
        p1.setLayout(null);
           //  FlowLayout Flow=new FlowLayout();
       //p1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
       //p1.setLayout(Flow);
        p1.setBounds(30,30,200,200);
        p1.setBackground(Color.cyan);
        Label tf=new Label("Hello!");
        tf.setBackground(Color.WHITE);
        tf.setAlignment(Label.CENTER);
        tf.setBounds(0,30,200,50);   
        Button b=new Button("click me");
        b.setBounds(40, 90, 100, 30);
        //b.setSize(new Dimension(300,200));
        //p1.setComponentOrientation();
        p1.add("Left",b);
        p1.add(tf);
        
        //f.add(b);
        //f.add(tf);
        f.add(p1);
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Jeb!");
            }
        });
       
    }
}
public class AWT_Panel {
    public static void main(String args[]){
        new PanelForm();
    }
}
