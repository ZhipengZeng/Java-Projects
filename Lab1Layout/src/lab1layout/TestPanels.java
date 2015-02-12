/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1layout;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author zzp
 */
public class TestPanels extends JFrame {
    public TestPanels(){
        
        JPanel p0 = new JPanel();
        p0.setLayout(new GridLayout(1,2));
        p0.add(new JRadioButton("Male"));
        p0.add(new JRadioButton("Female"));
       
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(6,2,10,20));
        p1.add(new JLabel("FirstName"));
        p1.add(new JTextField(20));
        p1.add(new JLabel("LastName"));
        p1.add(new JTextField(20));
        p1.add(new JLabel("MI"));
        p1.add(new JTextField(5));
        p1.add(new JLabel("Gender"));
        p1.add(p0);
        p1.add(new JLabel("Program"));
        p1.add(new JComboBox(new String[]{"Program1", "Program2", "Program3"}));
        p1.add(new JLabel("Semester"));
        p1.add(new JComboBox(new String[]{"1", "2", "3", "4"}));
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2,1,10,20));
        p2.add(new JButton("Submit"));
        p2.add(new JButton("Cancel"));
        
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1,2));
        p3.add(p1);
        p3.add(p2);
        
        
        JLabel title = new JLabel("New Student Registration");
        Font myFont = new Font("SansSerif ", Font.BOLD, 16);
        title.setFont(myFont);
        setLayout(new BorderLayout(5,20));
        add(title, BorderLayout.NORTH);
        add(p3, BorderLayout.CENTER);
        
    }
}
