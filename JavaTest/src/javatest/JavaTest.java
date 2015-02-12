/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatest;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author n01025248
 */
public class JavaTest extends JFrame{
    JPanel p1 = new JPanel();
    JLabel jlblHumber = new JLabel("Humber Institute");
    JPanel p2 = new JPanel();
    JLabel jlblProgram = new JLabel("Program");
    JButton diploma = new JButton("Diploma");
    JButton degree = new JButton("Degree");
    JButton cert = new JButton("Certificate");
    JPanel p3 = new JPanel();
    JLabel display = new JLabel("Display Result");
    Panel p4 = new Panel();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new JavaTest();
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setTitle("Test1");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public JavaTest(){
        
        p1.add(jlblHumber);
        p2.add(jlblProgram);
        p2.add(diploma);
        p2.add(degree);
        p2.add(cert);
        jlblProgram.setFont(new Font("",Font.BOLD+Font.ITALIC,16));// first arguement can simply be set "".
        jlblHumber.setFont(new Font("",Font.BOLD,24));
        
        p3.setLayout(new GridLayout(2,1));
        p3.add(p1);
        p3.add(p2);
        
        p4.setLayout(new BorderLayout());
        p4.add(p3,BorderLayout.NORTH);
        p4.add(display,BorderLayout.CENTER);
        display.setHorizontalAlignment(JLabel.CENTER);// set its horizonal alagnment to center.
        p4.setBackground(Color.yellow);// must set the JPanel's background's color, not the JLabel's.
        
        add(p4);
        
        diploma.addActionListener(new diplomaListen());
        degree.addActionListener(new degreeListen());
        cert.addActionListener(new certListen());
    }
    
    class diplomaListen implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(diploma.getText());
        }
    }
    class degreeListen implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(degree.getText());
        }
    }
    class certListen implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            display.setText(cert.getText());
        }
    }
}
