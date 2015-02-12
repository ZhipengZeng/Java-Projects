/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author zzp
 */
public class Lab3 extends JFrame{
    JLabel text = new JLabel("some text");
    JPanel p0 = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JCheckBox bold = new JCheckBox("Bold");
    JCheckBox italics = new JCheckBox("Italics");
    JComboBox size = new JComboBox();
    JComboBox cboColor;
    String[] myColor = {"Red","Green","Orange","Yellow","Grey"};
    Color[] colorArray = {Color.red,Color.green,Color.orange,Color.yellow,Color.gray};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new Lab3();
        frame.setTitle("Lab#3");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    public Lab3(){
        
        p0.setLayout(new GridLayout(3,1));
        text.setHorizontalAlignment(JLabel.CENTER);  // Setting the JLabel Horizontal position to be center.
        //text.setVerticalAlignment(JLabel.CENTER);  // JLabel by default is horizontally aligned to the left.
        p1.setLayout(new BorderLayout());
        p1.add(text, BorderLayout.CENTER);
        p1.add(p2, BorderLayout.SOUTH);
        
        for (int i = 1; i <= 36; i++) {
            size.addItem(i);
        }
        cboColor = new JComboBox(myColor);
        p2.add(bold);
        p2.add(italics);
        p2.add(size);
        p2.add(cboColor);
        add(p1);
        
        bold.addActionListener(new fontHandler());
        italics.addActionListener(new fontHandler());
        size.addActionListener(new fontHandler());
        cboColor.addActionListener(new colorHandler());
    }
    private class colorHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            text.setForeground(colorArray[cboColor.getSelectedIndex()]);
        }
    }
    private class fontHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int fontStyle = Font.PLAIN;
            fontStyle += bold.isSelected() ? Font.BOLD : Font.PLAIN;
            fontStyle += italics.isSelected() ? Font.ITALIC : Font.PLAIN;
            Font font = text.getFont();
            int fontsize = Integer.parseInt(size.getSelectedItem().toString());
            text.setFont(new Font(font.getName(), fontStyle, fontsize));
        }
    }
}
