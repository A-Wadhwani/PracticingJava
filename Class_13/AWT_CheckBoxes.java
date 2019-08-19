/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_13;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Aryan Wadhwani
 */
class Window1{
    Window1(){
        Frame f=new Frame("CheckBox");
        Label label=new Label("Enter something");
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        f.setSize(400,150);
        Checkbox cpp=new Checkbox("C++");
        Checkbox java=new Checkbox("Java");
        cpp.setBounds(150, 60, 50, 50);
        java.setBounds(150, 90, 50, 50);
        f.add(cpp); f.add(java);f.add(label);
        cpp.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ Checkbox: "+(e.getStateChange()==1?"Checked":"Unchecked"));
                if(e.getStateChange()==1){
                    java.setState(false);
                }
            }
        });
        java.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java Checkbox: "+(e.getStateChange()==1?"Checked":"Unchecked"));
                if(e.getStateChange()==1){
                    cpp.setState(false);
                }
            }
            
        });
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Checkboxes Sample.");
    }
}
public class AWT_CheckBoxes {
    public static void main(String args[]){
        new Window1();
    }
}
