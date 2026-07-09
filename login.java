/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ATHEER
 */
public class login extends JFrame {
   
   
    JTextField idField = new JTextField(10);
    JTextField nameField = new JTextField(10);
    JTextField phoneField = new JTextField(10);
    JTextField EmailField = new JTextField(10);
    JLabel errorLabel=new JLabel();
    JLabel nameLabe=new JLabel("Name:");
    JLabel idLabe=new JLabel("ID:");
    JLabel phoneLabe=new JLabel("Phone number:");
    JLabel EmailLabe=new JLabel("E-mail:");
    JButton loginButton  =new JButton("login");
    JPanel panel = new JPanel();
    JPanel pane2 = new JPanel(new GridLayout(5, 2));
    JPanel pane3= new JPanel();
    JPanel pane4= new JPanel(new BorderLayout());
    String ID , name  , Email  , phone_number;
     String as ; 
     public login(String city){
     as =  city; 
        setTitle("login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,2));
        
           
        ImageIcon imageIcon = new ImageIcon("login.jpg");
        JLabel label = new JLabel(imageIcon);
        panel.add(label);
        
        pane2.add(nameLabe);
        pane2.add(nameField);
        pane2.add(idLabe);
        pane2.add(idField);
        pane2.add(phoneLabe);
        pane2.add(phoneField);
        pane2.add(EmailLabe);
        pane2.add(EmailField);
        
        loginButton.setFont(new Font("Monospaced",Font.BOLD,24));
        nameLabe.setFont(new Font("Monospaced",Font.BOLD,24));
        idLabe.setFont(new Font("Monospaced",Font.BOLD,24));
        phoneLabe.setFont(new Font("Monospaced",Font.BOLD,24));
        EmailLabe .setFont(new Font("Monospaced",Font.BOLD,24));      
        errorLabel.setForeground(Color.red);
        loginButton.setForeground(Color.PINK);
        loginButton.setBackground(Color.WHITE);
        pane3.add(loginButton);
        
        pane3.add(errorLabel);
        loginButton.addActionListener(new loginButton());
        
                
        pane4.add(pane2,BorderLayout.CENTER);
        pane4.add(pane3,BorderLayout.SOUTH);
                
        add(panel);    
        add(pane4); 
        pack();
        setLocationRelativeTo(null);
        setVisible(true);          
                 }
      private class loginButton  implements ActionListener {
         
            public void actionPerformed(ActionEvent e) {
                 ID =idField.getText();
                 name = nameField.getText();
                 Email = EmailField.getText();
                 phone_number = phoneField.getText();
                if(name.isEmpty()){
                        errorLabel.setText("Please enter name ");
                }else if(ID.isEmpty()){
                        errorLabel.setText("Please enter ID ");
                }else if(phone_number.isEmpty()){
                        errorLabel.setText("Please enter phone_number ");
                }else if(Email.isEmpty()){
                   errorLabel.setText("Please enter email ");
                }else{
                    Confirmation a;
                
                try {
                    a = new Confirmation(ID);
                    a.setVisible(true);
                    dispose();
                } catch (FileNotFoundException ex) {
                  errorLabel.setText("System problem, please come back another time Or contact us on this number0533797030");
                }
                
                try {
                    FileWriter fwrite=new FileWriter("Breastcancer.txt ",true);
                    PrintWriter outputFile = new PrintWriter(fwrite);
                    outputFile.println(name+" "+ID+" "+as+" "+Email +" "+phone_number);
                    outputFile.close();
                } catch (IOException ex) {
                          errorLabel.setText("System problem, please come back another time Or contact us on this number0533797030");           
                }
               
                  
                } 
           
 }
      

  
    
}
}