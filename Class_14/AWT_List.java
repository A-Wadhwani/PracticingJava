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
class ListForm{
    ListForm(){
        Frame f=new Frame();
        
        Label l= new Label("Select some programming languages");
        l.setAlignment(Label.CENTER);
        l.setBounds(0,50,500,30);
        Button b=new Button("Click me");
        b.setBounds(150,225,150,10);
        List One=new List(5, true);
        One.setBounds(150,100,200,110);
        One.add("C++");
        One.add("Java");
        One.add("Python");
        One.add("mySQL");
        One.add("HTML");
        One.add("CSS");
        One.add("C#");
        f.add(One);
        f.add(b);
        f.add(l);
        f.setSize(500,300);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Selected Programming Languages are: ";
                for(String frame:One.getSelectedItems()){
                    data=data+frame+" ";
                }
                l.setText(data);
            }
        });
    }
}
public class AWT_List {
    public static void main(String args[]){
        new ListForm();
    }
}
