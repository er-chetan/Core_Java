package Button;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Signup extends Frame implements WindowListener {
    Button loginbtn;
    Label name ,phone_number,email,password,confirm_password,signup;
    TextField textname,textnumber,textemail,textconfirmemail,textpassword,textconfirmpassword;
    Checkbox checkbox;
    public Signup(){

        printinfo();
        addWindowListener(this);
    }

    public void printinfo(){
        loginbtn=new Button("Login");
        signup=new Label("Sign up");
        name=new Label("Name");
        phone_number=new Label("Phone number");
        email=new Label("Email");
        password=new Label("Password");
        confirm_password=new Label("Confirm Password");
        textname=new TextField();
        textnumber=new TextField();
        textconfirmemail=new TextField();
        textconfirmpassword=new TextField();
        textemail=new TextField();
        textpassword=new TextField();
        checkbox=new Checkbox("yes,i am student");
        signup.setBounds(10,30,60,30);
        name.setBounds(30,60,100,30);
        phone_number.setBounds(30,100,100,30);
        email.setBounds(30,140,100,30);;
        password.setBounds(30,180,100,30);
        confirm_password.setBounds(30,220,110,30);
        checkbox.setBounds(30,260,150,30);
        textname.setBounds(150,60,150,30);
        textnumber.setBounds(150,100,150,30);
        textemail.setBounds(150,140,150,30);
        textpassword.setBounds(150,180,150,30);
        textconfirmpassword.setBounds(150,220,150,30);
        loginbtn.setBounds(150,300,60,30);
        setSize(400,400);
        add(signup);
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
        add(loginbtn);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        Signup s1=new Signup();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

