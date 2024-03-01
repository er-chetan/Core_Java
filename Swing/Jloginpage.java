package Swing;

import javax.swing.*;
import java.awt.*;

public class Jloginpage extends JFrame {
    JButton loginbtn;
    JLabel email,password,login,null1;
    JTextField temail,tpassword,tforgetpassword;
    Jloginpage(){

    }
    public void printinf(){
        loginbtn=new JButton("login");
        email=new JLabel("EmailL:");
        password=new JLabel("Password");
        login=new JLabel("login");
        null1=new JLabel();
        temail=new JTextField();
        tpassword=new JTextField();
        tforgetpassword=new JTextField();
        setSize(400,400);

        add(login);
        add(null1);
        add(email);
        add(temail);
        add(password);
        add(tpassword);
        add(loginbtn);
        setLayout(new GridLayout(4,2,50,20));
        setVisible(true);
    }

    public static void main(String[] args) {
        Jloginpage j1=new Jloginpage();
        j1.printinf();
    }
}
