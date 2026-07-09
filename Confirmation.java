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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ATHEER
 */
public class Confirmation extends JFrame{
    final int WINDO_WIDTH=1400;
    final int WINDO_HIGHT=600;
      JLabel errorLabel=new JLabel();
         JLabel confLabe=new JLabel(" appointment has been confirmed");
         JLabel nameyou=new JLabel("Name:");
         JLabel idyou=new JLabel("ID:");
         JLabel cityyou=new JLabel("City:");
         JLabel nameLabe=new JLabel();
         JLabel idLabe=new JLabel();
         JLabel cityLabe=new JLabel();
         JPanel panel = new JPanel();
         JPanel pane2 = new JPanel(new GridLayout(3, 2));
         JPanel pane3= new JPanel();
         JPanel pane4= new JPanel(new BorderLayout());
         JPanel pane5= new JPanel();
         JPanel pane6= new JPanel();
         JPanel pane11= new JPanel(new BorderLayout());
         JPanel pane12= new JPanel( new BorderLayout());
        
         
         JButton info  =new JButton("information!");
         String key;
    public Confirmation(String idn) throws FileNotFoundException{
         key= idn;
         
        setTitle("Confirmation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,2));
        setSize(WINDO_WIDTH,WINDO_HIGHT);
           
        ImageIcon imageIcon = new ImageIcon("Confirmation.jpg");
        JLabel label = new JLabel(imageIcon);
        panel.add(label);
        
        confLabe.setFont(new Font("Monospaced",Font.BOLD,24));
        info.setFont(new Font("Monospaced",Font.BOLD,24));
        nameLabe.setFont(new Font("Monospaced",Font.BOLD,24));
        idLabe.setFont(new Font("Monospaced",Font.BOLD,24));
        cityLabe.setFont(new Font("Monospaced",Font.BOLD,24));  
        nameyou.setFont(new Font("Monospaced",Font.BOLD,24)); 
        cityyou.setFont(new Font("Monospaced",Font.BOLD,24)); 
        idyou.setFont(new Font("Monospaced",Font.BOLD,24));
        info.setForeground(Color.PINK);
        info.setBackground(Color.WHITE);
        info.addActionListener(new infoButton());
        errorLabel.setForeground(Color.red);
      
        pane3.add(confLabe);
        pane4.add(errorLabel);
        pane5.add(info);
        pane11.add(pane5,BorderLayout.NORTH);
        pane11.add(pane2,BorderLayout.CENTER);
        pane11.add(pane6,BorderLayout.SOUTH);
        
        pane12.add(pane3,BorderLayout.NORTH);
        pane12.add(pane11,BorderLayout.CENTER);
        pane12.add(pane4,BorderLayout.SOUTH);
        
        add(panel) ;
        add(pane12);
        // pack();
        setVisible(true);   

    }
          private class infoButton implements ActionListener   {
           @Override
           public void actionPerformed(ActionEvent e){
               
                      errorLabel.setText(" thank you to visit our application");
                      
               
               try {
                   File file = new File("Breastcancer.txt");
                   Scanner inputFile;
                   inputFile = new Scanner(file);
                   while(inputFile.hasNext()){
                              String name=inputFile.next();
                              String id=inputFile.next();
                              String city =inputFile.next();
                              
                              if(id.equals(key)){
                                nameLabe.setText(name);
                                idLabe.setText(id);
                                cityLabe.setText(city);
                                pane2.add(nameyou);
                                pane2.add(nameLabe);
                                pane2.add(idyou);
                                pane2.add(idLabe);
                                pane2.add(cityyou);
                                pane2.add(cityLabe);
                                
                              }else{
                              
                                  
                              }


                              inputFile.nextLine();
                         
                         }
               } catch (FileNotFoundException ex) {
                   errorLabel.setText("System problem, please come back another time Or contact us on this number 0533797030 ");
               }
                        
           }}
    
    
}