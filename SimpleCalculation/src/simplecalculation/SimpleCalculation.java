/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculation;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author zzp
 */
public class SimpleCalculation extends JFrame{
    private JButton jbtAdd = new JButton("Add");
    private JButton jbtSub = new JButton("Sub");
    private JButton jbtMul = new JButton("Mul");
    private JButton jbtDiv = new JButton("Div");
    private JLabel first = new JLabel("First Number: ");
    private JTextField txtfirst = new JTextField(5);
    private JLabel second = new JLabel("Second Number: ");
    private JTextField txtsecond = new JTextField(5);
    private JLabel result = new JLabel("Result: ");
    private JLabel txtresult = new JLabel();
    private JLabel title = new JLabel("Simple Calculation");
    

    

    public static void main(String[] args) {
        // TODO code application logic here
        SimpleCalculation frame = new SimpleCalculation();
        frame.setTitle("Lab2 - Zhipeng Zeng");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
    public SimpleCalculation(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5,2));
        p1.add(first);
        p1.add(txtfirst);
        p1.add(second);
        p1.add(txtsecond);
        p1.add(result);
        p1.add(txtresult);
        p1.add(jbtAdd);
        p1.add(jbtMul);
        p1.add(jbtSub);
        p1.add(jbtDiv);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(title);
        
        JPanel p3 = new JPanel();
        p3.add(p2);
        p3.add(p1);
        jbtAdd.addActionListener(new AddListener());
        jbtSub.addActionListener(new SubListener());
        jbtMul.addActionListener(new MulListener());
        jbtDiv.addActionListener(new DivListener());
        this.add(p3);
        
        
    }
    class AddListener implements ActionListener { // Inner class
     @Override
     public void actionPerformed(ActionEvent e) {
          double calculateresult;
     double number1 = Double.parseDouble(txtfirst.getText());
    double number2 = Double.parseDouble(txtsecond.getText());
        calculateresult = number1 + number2;
        txtresult.setText(""+calculateresult);
    }
    }
    class SubListener implements ActionListener { // Inner class
     @Override
     public void actionPerformed(ActionEvent e) {
         double calculateresult;
     double number1 = Double.parseDouble(txtfirst.getText());
    double number2 = Double.parseDouble(txtsecond.getText());
        calculateresult = number1 - number2;
        txtresult.setText(""+calculateresult);
    }
    }
    class MulListener implements ActionListener { // Inner class
     @Override
     public void actionPerformed(ActionEvent e) {
         double calculateresult;
     double number1 = Double.parseDouble(txtfirst.getText());
    double number2 = Double.parseDouble(txtsecond.getText());
        calculateresult = number1 * number2;
        txtresult.setText(""+calculateresult);
    }
    }
    class DivListener implements ActionListener { // Inner class
     @Override
     public void actionPerformed(ActionEvent e) {
         double calculateresult;
     double number1 = Double.parseDouble(txtfirst.getText());
    double number2 = Double.parseDouble(txtsecond.getText());
        calculateresult = number1 / number2;
        txtresult.setText(""+calculateresult);
    }
    }
    
}
