/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author ATHEER
 */
public class Interface  extends JFrame {
    
    private JPanel panel;
    private JLabel massege;
    private ImageIcon image;
    private JButton Ibutton;
   
    private JButton Mbutton;
    final int WINDO_WIDTH=1650;
    final int WINDO_HIGHT=750;
    JPanel massegepanel=new JPanel();
    JPanel buttonpanel= new JPanel();
    
   
   // JPanel = contentpane new JPanel();
    
    
    public Interface(){
    setTitle("Interface");
    setSize(WINDO_WIDTH,WINDO_HIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    
     buildPanel();

      add(massegepanel,BorderLayout.CENTER);
      add(buttonpanel,BorderLayout.SOUTH);
    
    
     setLocationRelativeTo(null);
     setVisible(true);
    }//end of constrector
   public void  buildPanel(){
    image=new ImageIcon ("Pmassege.jpg");
    massege=new JLabel(image);
    
   Ibutton=new JButton ("Initial Examination");
   Ibutton.setFont(new Font("Monospaced",Font.BOLD,24));
   Ibutton.setForeground(Color.PINK);
   Ibutton.setBackground(Color.WHITE);
   Mbutton=new JButton("Medical Examination");
   Mbutton.setFont(new Font("Monospaced",Font.BOLD,24));
   Mbutton.setForeground(Color.PINK);
   Mbutton.setBackground(Color.WHITE);
   Ibutton.addActionListener(new goInaitialExaminetion());
   Mbutton.addActionListener(new goHospitals());
   massegepanel.add(massege);
   buttonpanel.add(Ibutton);
   buttonpanel.add(Mbutton);

 
       
       
       
       
   }//end of buildPanel

   
   public class goHospitals implements ActionListener{
   
     @Override
     public void actionPerformed(ActionEvent e){
     
     Hospitals H=new Hospitals();
     H.setVisible(true);
     dispose();
     }
   }
      
   public class goInaitialExaminetion implements ActionListener{
   
     @Override
     public void actionPerformed(ActionEvent e){
     
     InaitialExaminetion InaitialExaminetionO=new InaitialExaminetion();
     InaitialExaminetionO.setVisible(true);
     dispose();
     }
   }
    public static void main(String[] args){
        new Interface();
      }
    
}

