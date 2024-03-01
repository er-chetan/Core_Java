package Button;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.*;

public class Loginpage_fetch extends Frame implements WindowListener {
    Button loginbtn,ftechbutton;
    Label email,password,login ;
    TextField temail,tpassword;
    Connection conn;
    JTable mydatatable;
    DefaultTableModel tableModel;

    public Loginpage_fetch(){
        information();
        addWindowListener(this);
    }
    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void information() {
        loginbtn = new Button("login");
        ftechbutton = new Button("fetch");
        email=new Label("EmailL:");
        password=new Label("Password");
        login=new Label("login");
        temail=new TextField();
        tpassword=new TextField();
        loginbtn.setBounds(100,200,70,30);
        login.setBounds(40,50,70,30);
        email.setBounds(40,80,70,30);
        password.setBounds(40,120,70,30);
        temail.setBounds(110,80,200,30);
        tpassword.setBounds(110,120,200,30);
        setSize(600,600);
        ftechbutton.setBounds(190,200,70,30);
        mydatatable =new JTable();
        mydatatable.setBounds(100,250,400,400);
        tableModel=new DefaultTableModel(new Object[][]{null,null,null,null},new String[]{"email","password","phonenumber","address"});
        tableModel.setRowCount(0);
        mydatatable.setModel(tableModel);
        add(mydatatable);
        add(login);
        add(email);
        add(temail);
        add(password);
        add(tpassword);
        add(loginbtn);
        add(ftechbutton);
        setLayout(null);
        setVisible(true);

    }
    public void fetch(){
        ftechbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query="select *from logininformation";
                Statement st = null;
                try {
                    st=conn.createStatement();
                    ResultSet rs=st.executeQuery(query);
                    while(rs.next()){
                        String temail=rs.getString("email");
                        String tpassword=rs.getString("password");
                        String textphonenumber=rs.getString("phonenumber");
                        String textaddress=rs.getString("address");
                        Object o[]={temail,tpassword,textphonenumber,textaddress};
                        tableModel.addRow(o);
                        System.out.println(temail+" "+tpassword+" "+textphonenumber+" "+textaddress);

                    }

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });

    }
    public void action(){
        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textemail=temail.getText();
                String textpassword=tpassword.getText();

                String query="select *from logininformation where email='"+textemail+"'and password='"+textpassword+"'";
                Statement st = null;
                try {
                    st=conn.createStatement();
                    ResultSet rs=st.executeQuery(query);
                    while(rs.next()){
                        String textnumber=rs.getString("phonenumber");
                        JOptionPane.showMessageDialog(Loginpage_fetch.this,"your number is "+" "+textnumber);

                    }

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        Loginpage_fetch f1=new Loginpage_fetch();
        f1.connect();
        f1.action();
        f1.fetch();
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
