/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author ATHEER
 */
public class InaitialExaminetion extends JFrame{
    JLabel images;
    ImageIcon image;
    JLabel Labelmassege;
    JPanel imagePanel,LabelmassegePanel,PButtonPanel,NButtonPanel;
    
    JButton previous,next;
    
    JMenuBar menuBar; 
    JMenu fileMenu; 
    JMenu backMenu; 
    JMenu InterfaceMenu; 
    JMenuItem exitItem, examinationItem, HospitalsItem,FirstStep;
    final int WINDO_WIDTH=1500;
    final int WINDO_HIGHT=400;
    int count=2;
    public InaitialExaminetion(){
 
    setTitle("Inaitial Examinetion");
    setSize(WINDO_WIDTH,WINDO_HIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
     buildPanel();
    add(imagePanel,BorderLayout.CENTER);
    //add(InterfaceButtonPanel,BorderLayout.SOUTH);
    add(LabelmassegePanel,BorderLayout.NORTH);
    add(PButtonPanel,BorderLayout.WEST);
    add(NButtonPanel,BorderLayout.EAST);
   
    
     setLocationRelativeTo(null);
     setVisible(true);
    
     
}//end of constructor
   
    private void buildPanel(){
    image=new ImageIcon("step1.jpg");
    images=new JLabel(image);
    Labelmassege=new JLabel();
    menuBar = new JMenuBar();

   
    next=new JButton("next step");
    previous=new JButton("previous step");
    
  
    next.setForeground(Color.PINK);
    next.setFont(new Font("Monospaced",Font.BOLD,24));
    next.setBackground(Color.WHITE);
    previous.setForeground(Color.PINK);
    previous.setBackground(Color.WHITE);
    previous.setFont(new Font("Monospaced",Font.BOLD,24));
    
    next.addActionListener(new NextListener());
    previous.addActionListener(new PreviousListener());
    
    imagePanel=new JPanel();
    
    LabelmassegePanel=new JPanel();
    PButtonPanel=new JPanel();
    NButtonPanel=new JPanel();   
    
  
   LabelmassegePanel.add(Labelmassege);
   PButtonPanel.add(previous);
   NButtonPanel.add(next);
   imagePanel.add(images);
   exitItem = new JMenuItem("Exit");
   exitItem.setMnemonic(KeyEvent.VK_X);
   exitItem.addActionListener(new ExitListener());
   fileMenu = new JMenu("File");
   fileMenu.setMnemonic(KeyEvent.VK_F);
   fileMenu.add(exitItem);
   examinationItem=new JMenuItem("Examination");
   examinationItem.setMnemonic(KeyEvent.VK_E);
   examinationItem.addActionListener(new GoExaminationItem() );
   HospitalsItem=new JMenuItem(" Hospitals Menu");
   HospitalsItem.setMnemonic(KeyEvent.VK_E);
   HospitalsItem.addActionListener(new GoHospitalsItem() );
   
   InterfaceMenu=new JMenu ("Interface"); 
   InterfaceMenu.add(examinationItem);
   InterfaceMenu.add(HospitalsItem);
   
   FirstStep=new JMenuItem("First Step");
   FirstStep.setToolTipText("Click here to go to the first step");
   FirstStep.addActionListener(new GoFirst() );
   
   backMenu=new JMenu("Back");
   backMenu.setMnemonic(KeyEvent.VK_B);
   backMenu.add(InterfaceMenu);
   backMenu.add(FirstStep);
   menuBar.add(fileMenu);
   menuBar.add(backMenu);
   setJMenuBar(menuBar);
    
  }//end buildPanel
    
    private class goInterface implements ActionListener{
     
        @Override//
        public void actionPerformed(ActionEvent e) {
            
        Interface IF=new Interface();
        IF.setVisible(true);
        dispose();
        }

  }//end class goInterface
    
    private class PreviousListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(count==7)
                count=5;
           
                if(count>=1){
                    
                    image=new ImageIcon("step"+count+".jpg");
                     images.setIcon(image);
                     count--;
                }
    
    
    } 
        
        
        
 }//end of class previousListener  
    
    
    private class NextListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           if(count==0)
                    count=2;
                if(count<=6){
                     image=new ImageIcon("step"+count+".jpg");
                     images.setIcon(image);
                     count++;
                     
                }
    
    
    } 
  }//end of class PreviousListener 
    private class ExitListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        System.exit(0);
        
        }
    
    }
    
     private class GoExaminationItem implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        
        
     InaitialExaminetion InaitialExaminetionO=new InaitialExaminetion();
     InaitialExaminetionO.setVisible(true);
     dispose();
        }
     
     
     }
    
      private class GoHospitalsItem implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        Hospitals H=new Hospitals();
        H.setVisible(true);
        dispose();
        
        
        
         }
      
      }
      private class GoFirst implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          count=1;
          image=new ImageIcon("step"+count+".jpg");
          images.setIcon(image);
                count++;
        }
      
      
      
      }
     
     
}