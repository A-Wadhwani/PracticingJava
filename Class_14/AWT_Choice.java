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
class ChoiceForm{
    ChoiceForm(){
        Frame f=new Frame("Choice Example");
        Label a=new Label("Choose one");
        Button b=new Button("Click here.");
        Choice c=new Choice();
        a.setAlignment(Label.CENTER);
        a.setBounds(100, 50, 200, 30);
        b.setBounds(100, 150, 200, 30);
        c.setBounds(100, 100, 200, 30);
        c.addItem("A");
        c.addItem("B");
        c.addItem("C");
        c.addItem("D");
        c.addItem("E");
        f.add(a);
        f.add(b);
        f.add(c);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        b.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    a.setText("Choice is: "+c.getSelectedItem());
                }
            }
        );
    }
}
public class AWT_Choice {
    public static void main(String args[]){
        new ChoiceForm();
    }
}
