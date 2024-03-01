package Button;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class loginPage extends Frame implements WindowListener {
    Button loginbtn;
    Label email,password,login ;
    TextField temail,tpassword,tforgetpassword;
    loginPage(){
        addWindowListener(this);
        information();
    }
    public void information(){
        loginbtn=new Button("login");
        email=new Label("EmailL:");
        password=new Label("Password");
        login=new Label("login");
        temail=new TextField();
        tpassword=new TextField();
        tforgetpassword=new TextField();
        loginbtn.setBounds(150,200,70,30);
        login.setBounds(40,50,70,30);
        email.setBounds(40,80,70,30);
        password.setBounds(40,120,70,30);
        temail.setBounds(110,80,200,30);
        tpassword.setBounds(110,120,200,30);
        setSize(400,400);
         add(login);
         add(email);
         add(temail);
         add(password);
         add(tpassword);
         add(loginbtn);
         setLayout(null);
         setVisible(true);
    }

    public static void main(String[] args) {
        loginPage l1=new loginPage();

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
