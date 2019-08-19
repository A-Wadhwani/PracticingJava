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
class CheckBoxWindow{
    Label Indicator;
    Checkbox Java,CPP;
    CheckBoxWindow(){
        Frame f=new Frame("Checkbox Groups example.");
        Indicator=new Label("Hii");
        Indicator.setAlignment(Label.CENTER);
        Indicator.setBounds(100, 50, 200, 30);
        //Indicator.setBackground(Color.WHITE);
        CheckboxGroup cbg= new CheckboxGroup(); 
        CPP= new Checkbox("C++",cbg,false);
        CPP.setBounds(100, 100, 200, 30);
        CPP.setBackground(Color.WHITE);
        Java= new Checkbox("Java",cbg,false);
        Java.setBounds(100, 150, 200, 30);
        Java.setBackground(Color.WHITE);
        f.setBackground(Color.CYAN);
        f.add(CPP);
        f.add(Java);
        f.add(Indicator);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        CPP.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    if(CPP.getState()==true)
                    {
                        Indicator.setText("CPP is activated.");
                    }
                }
            }
        );
        Java.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(Java.getState()==true)
                {
                    Indicator.setText("Java is activated.");
                }
            }
        });
    }
}
public class AWT_CheckboxGroup {
    public static void main(String args[]){
        new CheckBoxWindow();
    }
}
