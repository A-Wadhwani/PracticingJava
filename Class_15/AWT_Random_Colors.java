/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_15;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Aryan Wadhwani
 */
class Hey extends Frame{
    Label l1=new Label("100");
    Hey(){
        l1.setBounds(0, 50, 300, 50);
        l1.setAlignment(Label.CENTER);
        l1.setVisible(false);
        Button b1=new Button("DO NOT CLICK");
        b1.setBounds(100, 150, 100, 100);
        b1.setBackground(Color.red);
        add(l1);
        add(b1);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setSize(300, 300);
        setVisible(true);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    l1.setVisible(true);
                    for(int i=99;i>=0;i--){
                        Thread.sleep(100);
                        l1.setBackground(Color.getHSBColor((float)(Math.random())*100,(float)(Math.random()*100),(float)(Math.random()*100)));
                        l1.setText(String.valueOf(i));
                    }
                    setVisible(false);
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hey.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
}
public class AWT_Random_Colors {
    public static void main(String args[]){
        new Hey();
    }
}
