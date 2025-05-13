package com.train.reservation.system.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

class CreateLoginForm extends JFrame implements ActionListener {
    JButton b1;
    JPanel newPanel, newPanel1;
    JLabel userLabel, passLabel, textLabel;
    final JTextField textField1, textField2;

    CreateLoginForm() {
        textLabel = new JLabel();
        textLabel.setText("Welcome to Railway Reservation System\n");
        userLabel = new JLabel();
        userLabel.setText("Username");
        textField1 = new JTextField(20);
        passLabel = new JLabel();
        passLabel.setText("Password");
        textField2 = new JPasswordField(20);
        b1 = new JButton("SUBMIT");

        newPanel1 = new JPanel(new GridLayout(2,1));
        newPanel1.add(textLabel);
        add(newPanel1, BorderLayout.CENTER);

        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);

        add(newPanel, BorderLayout.CENTER);

        b1.addActionListener(this);
        setTitle("LOGIN FORM");
    }

    public void actionPerformed(ActionEvent ae)
    {
        String userValue = textField1.getText();
        String passValue = textField2.getText();
        if (userValue.equals("test1@gmail.com") && passValue.equals("test")) 
        {
        } 
        else 
        {
            System.out.println("Please enter valid username and password");
        }
    }
}

class LoginFormDemo 
{
    public static void main(String arg[]) {
        try 
        {
            CreateLoginForm form = new CreateLoginForm();
            form.setSize(1200, 500);
            form.setVisible(true);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
