package Swing;

import javax.swing.*;
import java.awt.*;

public class Signup2 extends JFrame {
JButton loginbtn;
JLabel name ,phone_number,email,password,confirm_password,signup,null1,null2;
JTextField textname,textnumber,textemail,textconfirmemail,textpassword,textconfirmpassword;
JCheckBox checkbox;

public Signup2(){
printinfo();
}
public void printinfo(){
    loginbtn=new JButton("Login");
    signup=new JLabel("Sign up");
    null1=new JLabel();
    null2=new JLabel();
    name=new JLabel("Name");
    phone_number=new JLabel("Phone number");
    email=new JLabel("Email");
    password=new JLabel("Password");
    confirm_password=new JLabel("Confirm Password");
    textname=new JTextField();
    textnumber=new JTextField();
    textconfirmemail=new JTextField();
    textconfirmpassword=new JTextField();
    textemail=new JTextField();
    textpassword=new JTextField();
    checkbox=new JCheckBox("yes,i am student");
    add(signup);
    add(null1);
    add(name);
    add(textname);
    add(phone_number);
    add(textnumber);
    add(email);
    add(textemail);
    add(password);
    add(textpassword);
    add(confirm_password);
    add(textconfirmpassword);
    add(checkbox);
    add(null2);
    add(loginbtn);
    setLayout(new GridLayout(9,9,60,10));
    setVisible(true);
    setSize(400,400);

}

    public static void main(String[] args) {
        Signup2 s1 =new Signup2();
    }
}
