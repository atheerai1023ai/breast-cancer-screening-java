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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author ATHEER
 */
public class Hospitals  extends JFrame {
    
    final int WINDO_WIDTH=1500;
    final int WINDO_HIGHT=750;
   JPanel panel = new JPanel();
    JLabel errorLabel=new JLabel();
    JButton loginButton  =new JButton("next");
    ButtonGroup buttonGroup = new ButtonGroup();
    JPanel pane11= new JPanel(new GridLayout(6,2));
    JPanel pane3= new JPanel();
    JPanel pane4= new JPanel(new BorderLayout());
    JRadioButton jeddahButton = new JRadioButton("Jeddah");
    JRadioButton riyadhButton = new JRadioButton("Riyadh");
    JRadioButton easternButton = new JRadioButton("Eastern Province");
    JRadioButton meccaButton = new JRadioButton("Mecca");
    JRadioButton qassimButton = new JRadioButton("Qassim");
    JRadioButton najranButton = new JRadioButton("Najran");
    String[] jeddah = {"King Fahd General Hospital" ,"​King Abdulaziz Hospital " ,
                            "East Jeddah Hospital" ,"​Maternity and Children's Hospital " ,
                            "​King Abdulaziz University Hospital" ,"​King Abdullah Complexr"};
    
     JComboBox jeddahComboBox = new JComboBox<>(jeddah);
     String[] Riyadh = {"Hayat Mall Clinic" ,"Al Qasr Mall Clinic\n" 
                           ,"Al Yamamah Hospital"};
         JComboBox RiyadhComboBox = new JComboBox<>(Riyadh);
         String[] EasternProvince = {"Mai Jabr Center" ,"Jubail General Hospital, Jubail sector" ,
                                     "Qatif Central Hospital" ,"​Maternity and Children's Hospital" ,
                                     "Al Burj Medical Hospital in Dammam ​​"};
         JComboBox EasternComboBox = new JComboBox<>(EasternProvince);
           
         String[] Makkah = {"​King Abdullah Medical City" ,"​King Abdulaziz Hospital" ,
                            "Al Nour Specialized Hospital" ,"Hira General Hospital"};
         JComboBox<String> MakkahComboBox = new JComboBox<>(Makkah);
           String[] Qassim = {"​King Fahd Specialist Hospital" ,"Al-Rass General Hospital" ,
                            "​King Saud Hospital, Unayzah" ,"Al Muthanna General Hospital", 
                             "Al-Bukayriyah General Hospital"};
         JComboBox<String> QassimComboBox = new JComboBox<>(Qassim);
          String[] Najran = {"​King Khaled Hospital" ,"​Maternity and Children's Hospital" ,
                            "New Najran General Hospital" ,"Sharurah General Hospital" ,
                            "Habouna General Hospital\n" ,"Officers neighborhood health center"};
         JComboBox<String> NajranComboBox = new JComboBox<>(Najran);
         String input;
         int temp=0;
    /**  
     * 
     *
     */
    public Hospitals(){
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
         setLayout(new GridLayout(1,2));
         setSize(WINDO_WIDTH,WINDO_HIGHT);
         ImageIcon imageIcon = new ImageIcon("Hospitals.jpg");
         JLabel label = new JLabel(imageIcon);
         panel.add(label);
         
         pane11.add(jeddahButton);
         pane11.add(jeddahComboBox);
         pane11.add(riyadhButton);
         pane11.add(RiyadhComboBox);
         pane11.add(easternButton); 
         pane11.add(EasternComboBox);
         pane11.add(meccaButton);
         pane11.add(MakkahComboBox);
         pane11.add(qassimButton);
         pane11.add(QassimComboBox);
         pane11.add(najranButton);
         pane11.add(NajranComboBox);
         
         
        buttonGroup.add(jeddahButton);
        buttonGroup.add(riyadhButton);
        buttonGroup.add(najranButton);
        buttonGroup.add(qassimButton);
        buttonGroup.add(easternButton);
        buttonGroup.add(meccaButton);
        
        jeddahComboBox.addActionListener(new RadioButtonListener());
        RiyadhComboBox.addActionListener(new RadioButtonListener());
        EasternComboBox.addActionListener(new RadioButtonListener());
        MakkahComboBox.addActionListener(new RadioButtonListener());  
        QassimComboBox.addActionListener(new RadioButtonListener());
        NajranComboBox.addActionListener(new RadioButtonListener());
        
        jeddahButton.addActionListener(new RadioButtonListener());
        riyadhButton.addActionListener(new RadioButtonListener());
        easternButton.addActionListener(new RadioButtonListener());
        meccaButton.addActionListener(new RadioButtonListener());
        qassimButton.addActionListener(new RadioButtonListener());
        najranButton.addActionListener(new RadioButtonListener());
        
      
        errorLabel.setForeground(Color.red);
       
        pane3.add(loginButton);
          
        loginButton.addActionListener(new loginButtonListener());
        loginButton.setForeground(Color.PINK);
        loginButton.setBackground(Color.WHITE);
        loginButton.setFont(new Font("Monospaced",Font.BOLD,24));
        pane3.add(errorLabel);
        pane4.add(pane11,BorderLayout.CENTER);
        pane4.add(pane3,BorderLayout.SOUTH);
        
        
       add(panel);    
       add(pane4); 
     
       jeddahButton.setFont(new Font("Monospaced",Font.BOLD,24));
        riyadhButton.setFont(new Font("Monospaced",Font.BOLD,24));
        meccaButton.setFont(new Font("Monospaced",Font.BOLD,24));
        qassimButton.setFont(new Font("Monospaced",Font.BOLD,24));
        najranButton.setFont(new Font("Monospaced",Font.BOLD,24));
        easternButton.setFont(new Font("Monospaced",Font.BOLD,24));
        
       jeddahComboBox.setFont(new Font("Monospaced",Font.BOLD,16));
        RiyadhComboBox.setFont(new Font("Monospaced",Font.BOLD,16));
        EasternComboBox.setFont(new Font("Monospaced",Font.BOLD,16));
        MakkahComboBox.setFont(new Font("Monospaced",Font.BOLD,16));
        QassimComboBox.setFont(new Font("Monospaced",Font.BOLD,16));
        NajranComboBox.setFont(new Font("Monospaced",Font.BOLD,16));
        
       setVisible(true);   
       setLocationRelativeTo(null);
      
     }

   
    private class RadioButtonListener implements ActionListener   {
           @Override
           public void actionPerformed(ActionEvent e){
 
           if(jeddahButton.isSelected()){
               temp+=1;
           String selectedOption = (String) jeddahComboBox.getSelectedItem();
               if (selectedOption == null) {
                errorLabel.setText("Please enter a Hospital");
                } else {
                 input = "Jeddah " + selectedOption;
           }
           }else if(e.getSource()==riyadhButton) {
                temp+=1;
            String selectedOption = (String) RiyadhComboBox.getSelectedItem();
            if (selectedOption == null) {
                errorLabel.setText("Please enter a Hospital");
            } else {
                input = "Riyadh " + selectedOption;
            }
        } else if (meccaButton.isSelected()) {
                temp+=1;
            String selectedOption = (String) MakkahComboBox.getSelectedItem();
            if (selectedOption == null) {
                errorLabel.setText("Please enter a Hospital");
            } else {
                input = "Mecca " + selectedOption;
            }
        } else if (najranButton.isSelected()) {
             temp+=1;
            String selectedOption = (String) NajranComboBox.getSelectedItem();
            if (selectedOption == null) {
                errorLabel.setText("Please enter a Hospital");
            } else {
                input = "Najran " + selectedOption;
            }
        } else if (qassimButton.isSelected()) {
             temp+=1;
            String selectedOption = (String) QassimComboBox.getSelectedItem();
            if (selectedOption == null) {
                errorLabel.setText("Please enter a Hospital");
            } else {
                input = "Qassim " + selectedOption;
            }
        } else if (easternButton.isSelected()) {
             temp+=1;
            String selectedOption = (String) EasternComboBox.getSelectedItem();
            if (selectedOption == null) {
                errorLabel.setText("Please enter a Hospital");
            } else {
                input = "Eastern " + selectedOption;
            }
        } else {
            errorLabel.setText("Please select City and Hospital");
        }
         
         
    
    }
    }
    private class loginButtonListener implements ActionListener   {
           @Override
           public void actionPerformed(ActionEvent e){
               
          if( temp>0){        
          login a=new login(input);
          a.setVisible(true);
          dispose();
          }else {
            errorLabel.setText("Please select City and Hospital");
           
           }
    }
    }
}