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
public class Lab1Layout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestPanels frame = new TestPanels();
        frame.setTitle("Lab1 - Zhipeng Zeng");
        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBackground(Color.BLUE);
        frame.setForeground(Color.WHITE);
    }
    
}
