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
class Window extends Frame implements ActionListener{
    TextArea area;
    Label l1,l2;
    Button b;
    Window(){
        l1=new Label("Words: ");
        l1.setBounds(50, 50, 100, 30);
        l2=new Label("Characters: ");
        l2.setBounds(160, 50, 100, 30);
        area=new TextArea();
        area.setBounds(20,100,300,300);
        b=new Button("Evaluate");
        b.setBounds(100, 400, 100, 30);
        b.addActionListener(this);
        add(l1);add(l2);add(b);add(area);
        setSize(342,450);
        setLayout(null);
        setVisible(true);
        setTitle("Count Words and Characters");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String text= area.getText();
        //String words[]= text.split("\\s");
        //l1.setText("Words: "+words.length);
        int count=1;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '&&text.charAt(i-1)!=' '){
                count++;
            }
        }
        l1.setText("Words: "+count);
        l2.setText("Characters: "+text.length());
    }
}
public class AWT_CountWords{
    public static void main(String args[]){
        new Window();
    }
}
