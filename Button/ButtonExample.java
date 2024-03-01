package Button;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.EventListener;

public class ButtonExample extends Frame implements WindowListener {
    Button loginbtn;
    Label emaillable,sampletext;
    TextField emailedit;
    public ButtonExample(){
        createbtn();
        addWindowListener(this);
    }
    public void createbtn(){
        loginbtn =new Button("LogIn");
        emaillable =new Label(" Enter Email");
        sampletext =new Label("sample text");
        emailedit =new TextField();
        sampletext.setBounds(150,190,200,40);
        emailedit.setBounds(150,40,200,40);
        emaillable.setBounds(40,40,120,40);
        loginbtn.setBounds(40,100,200,40);
        setSize(400,400);
        add(loginbtn);
        add(emaillable);
        add(emailedit);
        add(sampletext);
        setLayout(null);
        setVisible(true);

    }
    public void setfunction()
    {
         loginbtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String emailtext = emailedit.getText();
                 int num = Integer.parseInt(emailtext);
                 if(num>0)
                 {
                     sampletext.setText("number is positive");
                 }else{
                     sampletext.setText("number is negative");
                 }
             }
         });
    }

    public static void main(String[] args) {
        ButtonExample buttonExample = new ButtonExample();
        buttonExample.setfunction();

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

