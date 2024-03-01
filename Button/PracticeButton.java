package Button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PracticeButton extends Frame implements WindowListener,MouseListener {

        Button loginbtn;
        Label math,science,physics,hindi,english,percentage,grade;
        Connection conn;
        TextField textmath,textenglish,texthindi,textscience,textphysics;
        String percentage1,grade1;
        public PracticeButton(){
            displayproperty();
            addWindowListener(this);
        }
        public void displayproperty(){

            loginbtn =new Button(" CALCULATE ");
            math=new Label("MATH");
            science=new Label("SCIENCE");
            hindi=new Label("HINDI");
            physics=new Label("PHYSICS");
            english=new Label("ENGLISH");
            textmath= new TextField();
            textscience=new TextField();
            texthindi=new TextField();
            textphysics=new TextField();
            textenglish=new TextField();
            percentage=new Label("your percentage");
            grade=new Label("YOUR GRADE");
            math.setBounds(30,50,60,30);
            science.setBounds(30,90,60,30);
            hindi.setBounds(30,130,60,30);
            physics.setBounds(30,170,60,30);
            english.setBounds(30,210,60,30);
            textmath.setBounds(100,50,60,30);
            textscience.setBounds(100,90,60,30);
            texthindi.setBounds(100,130,60,30);
            textphysics.setBounds(100,170,60,30);
            textenglish.setBounds(100,210,60,30);
            loginbtn.setBounds(30,270,100,30);
            percentage.setBounds(150,270,200,30);
            grade.setBounds(180,300,150,40);
            setSize(400,400);
            add(math);
            add(english);
            add(science);
            add(hindi);
            add(physics);
            add(english);
            add(textmath);
            add(textscience);
            add(texthindi);
            add(textphysics);
            add(textenglish);
            add(loginbtn);
            add(percentage);
            add(grade);
            setLayout(null);
            setVisible(true);
        }
        public void connect(){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/marks", "root", "");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        public void calculate(){
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
                        grade.setText("A+");
                        grade1="A+";
                    }else if(per>=70 && per<90) {
                        grade.setText("A");
                        grade1="A";
                    }else if(per>=50 && per<70) {
                        grade.setText("B");
                        grade1="B";
                    }else if(per>=33 && per<50) {
                        grade.setText("C");
                        grade1="C";
                    }else if(per<33) {
                        grade.setText("D");
                        grade1="D";
                    }

                    try {
                        Statement statement = conn.createStatement();
                        int result =statement.executeUpdate("insert into information(math,science,hindi,physics,english,percentage,grade) values('"+textmath1+"','"+textscience1+"','"+texthindi1+"','"+textphysics1+"','"+textenglish1+"','"+word+"','"+grade1+"')");
                        if(result>0){
                            JOptionPane.showMessageDialog(PracticeButton.this,"inserted succesfully");
                        }else{
                            JOptionPane.showMessageDialog(PracticeButton.this,"not inserted succesfully");
                        }
                    }
                    catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            });
        }

        public static void main(String[] args) {
            PracticeButton p=new PracticeButton();
            p.connect();
            p.calculate();
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

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }


