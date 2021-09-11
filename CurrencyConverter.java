/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrencyConverter;

/**
 *
 * @author Polo
 */
import javax.swing.JFrame;


public class CurrencyConverter extends JFrame {
    
    public static void main(String[] args) 
    {
        CurrencyGUI convert = new CurrencyGUI();
        
        convert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        convert.pack(); 
        convert.setVisible(true);
    }
    
}
