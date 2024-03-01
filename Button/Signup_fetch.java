package Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Signup_fetch extends Frame implements WindowListener {
   Button signupbutton,loginbtn,ftechbutton;
   Label email,password,login,phonenumber,address;
   TextField temail,tpassword, tphonenumber,taddress;
   Connection conn;
   public Signup_fetch(){

      information();
      addWindowListener(this);
   }
   public void information(){
      signupbutton=new Button("SIGN UP");
      loginbtn=new Button("login");
      ftechbutton=new Button("fetch");
      email=new Label("EMAIL:");
      password=new Label("PASSWORD:");
      login=new Label("SIGN UP");
      temail=new TextField();
      tpassword=new TextField();
      phonenumber=new Label("PHONE NUMBER:");
      tphonenumber=new TextField();
      address=new Label("ADDRESS");
      taddress=new TextField();
      login.setBounds(40,50,70,30);
      email.setBounds(40,80,70,30);
      password.setBounds(40,120,70,30);
      temail.setBounds(140,80,200,30);
      tpassword.setBounds(140,120,200,30);
      phonenumber.setBounds(40,160,100,30);
      address.setBounds(40,200,70,30);
      tphonenumber.setBounds(140,160,200,30);
      taddress.setBounds(140,200,200,30);
      signupbutton.setBounds(40,260,70,30);
      loginbtn.setBounds(120,260,70,30);
      ftechbutton.setBounds(200,260,70,30);
      setSize(400,400);
      add(login);
      add(email);
      add(temail);
      add(password);
      add(tpassword);
      add(phonenumber);
      add(tphonenumber);
      add(address);
      add(taddress);
      add(signupbutton);
      setLayout(null);
      setVisible(true);

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
      public void stored(){
      signupbutton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String textemail=temail.getText();
            String textpassword=tpassword.getText();
            String textphonenumber=tphonenumber.getText();
            String textaddress=taddress.getText();
            try {
               Statement statement = conn.createStatement();
               int result =statement.executeUpdate("insert into logininformation(email,password,phonenumber,address) values('"+textemail+"','"+textpassword+"','"+textphonenumber+"','"+textaddress+"')");
               if(result>0){
                  JOptionPane.showMessageDialog(Signup_fetch.this," sign up succesfully");
               }else{
                  JOptionPane.showMessageDialog(Signup_fetch.this,"not sign up  succesfully");
               }
            }
            catch (SQLException ex) {
               ex.printStackTrace();
            }


         }
      });
      }

   public static void main(String[] args) {
      Signup_fetch l1 =new Signup_fetch();
      l1.connect();
      l1.stored();
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
