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
class Panels{
    Panels(){
        Frame f1=new Frame("Multi Panels Demo");
        Panel p1=new Panel(null);
        Panel p2=new Panel(null);
        Label l1 = new Label("1st Panel Page");
        Label l2 = new Label("2nd Panel Page");
        l1.setFont(new Font("Lucida",Font.BOLD,14));
       // l1.setFont();
        Button b1= new Button("Switch Panels");
        p1.setBounds(25,35,250,250);
        p2.setBounds(25,35,250,250);
        l1.setBounds(50,50,150,50);
        l1.setBackground(Color.WHITE);
        l2.setBounds(50,50,150,50);
        l2.setBackground(Color.WHITE);
        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.PINK);
        p1.add(l1);     p2.add(l2);
        l1.setAlignment(Label.CENTER);
        l2.setAlignment(Label.CENTER);
        b1.setBounds(50,295,200,50);
        f1.add(b1);
        f1.add(p1);         f1.add(p2);
        f1.setSize(300,365);
        f1.setLayout(null);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(p1.isVisible()){
                    p1.setVisible(false);
                    p2.setVisible(true);
                }
                else{
                    p1.setVisible(true);
                    p2.setVisible(false);
                }
            }
        });
        f1.setVisible(true);
    }
}
public class AWT_SwitchPanels {
    public static void main(String args[]){
        new Panels();
    }
}
