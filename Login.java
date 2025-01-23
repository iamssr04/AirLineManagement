package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    
    public Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel lblusername = new JLabel("username");
        lblusername.setBounds(20,20,100,20);
        add(lblusername);
        
        JTextField tfusername = new JTextField();
        tfusername.setBounds(130,20,200,20);
        add(tfusername);
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(20,60,100,20);
        add(lblpassword);
        
         JPasswordField tfpassword = new JPasswordField();
        tfpassword.setBounds(130,60,200,20);
        add(tfpassword);
        
        JButton reset  = new JButton("reset");
        reset.setBounds(40,120,120,20);
        add(reset);
        
        JButton submit  = new JButton("submit");
        submit.setBounds(190,120,120,20);
        add(submit);
        
        JButton close  = new JButton("close");
        close.setBounds(120,160,120,20);
        add(close);
        
        setSize(400,250);
        setLocation(480,270);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        
         new Login();
    }
    
}
