package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridSwingExample extends JFrame {
    JButton loginbtn;
    JLabel math,english,hindi,science,physics,percentage,grade;
    JTextField textmath,textenglish,texthindi,textscience,textphysics;

    GridSwingExample(){
        information();
    }
    public void information(){
        loginbtn=new JButton("login");
        math=new JLabel("math");
        science=new JLabel("science");
        hindi=new JLabel("hindi");
        physics=new JLabel("physics");
        english=new JLabel("english");
        textmath=new JTextField();
        textscience=new JTextField();
        texthindi=new JTextField();
        textphysics=new JTextField();
        textenglish=new JTextField();
        percentage=new JLabel("your percentage");
        grade=new JLabel("grade");
        add(math);
        add(textmath);
        add(english);
        add(textenglish);
        add(science);
        add(textscience);
        add(hindi);
        add(texthindi);
        add(physics);
        add(textphysics);
        add(loginbtn);
        add(percentage);
        add(grade);
        setLayout(new GridLayout(7,6,20,5));
        setSize(500,500);
        setVisible(true);

    }
    public void input(){
        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textmath1=textmath.getText();
                int m=Integer.parseInt(textmath1);
                String textscience1=textscience.getText();
                int s=Integer.parseInt(textscience1);
                String texthindi1=texthindi.getText();
                int h=Integer.parseInt(texthindi1);
                String textphysics1=textphysics.getText();
                int p=Integer.parseInt(textphysics1);
                String textenglish1=textenglish.getText();
                int d=Integer.parseInt(textenglish1);
                int per=((m+s+h+p+d)*100)/500;
                String word=String.valueOf(per);
                percentage.setText("per"+" "+word);
                if(per>=90){
                    grade.setText("A");
                }else if(per>=70 && per<90) {
                    grade.setText("B");
                }else if(per>=50 && per<70) {
                    grade.setText("B");
                }else if(per>=33 && per<50) {
                    grade.setText("C");
                }else if(per<33) {
                    grade.setText("D");
                }
            }
        });
    }

    public static void main(String[] args) {
        GridSwingExample g1=new GridSwingExample();
            g1.input();
    }
}
