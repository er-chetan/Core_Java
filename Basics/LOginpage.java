import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LOginpage extends Frame implements WindowListener {
    Button loginbtn;
    Label loginpage,email,password;
    TextField temail,tpassword;
    public LOginpage(){
        loginpage();
        addWindowListener(this);
    }
    public void loginpage(){
        loginpage=new Label("Login page");
        email=new Label("email :");
        password=new Label("password :");
        temail=new TextField();
        tpassword=new TextField();
        loginbtn=new Button("login");
        loginpage.setBounds(30,70,90,20);
        email.setBounds(30,100,80,20);
        password.setBounds(30,130,120,20);
        temail.setBounds(130,100,180,20);
        tpassword.setBounds(130,130,180,20);
        loginbtn.setBounds(150,180,60,30);
        setSize(400,400);
        add(loginpage);
        add(loginbtn);
        add(email);
        add(temail);
        add(tpassword);
        add(password);
        setLayout(null);
        setVisible(true);
    }
    public void saveinfo(){
        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent r) {
                String textemail=temail.getText();
                String textpassword =tpassword.getText();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student2", "root", "");
                    System.out.println("connection establish");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        LOginpage l1=new LOginpage();
        l1.saveinfo();
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
        dispose();
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
