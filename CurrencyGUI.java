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
import javax.swing.JTextField; 
import javax.swing.JLabel; 
import javax.swing.JButton;
import javax.swing.JFormattedTextField; 
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.text.NumberFormat;
import javax.swing.JFrame;
import java.awt.Insets;
import javax.swing.JOptionPane;

public class CurrencyGUI extends JFrame implements ActionListener{
    
    private JLabel dollarAmountLabel; 
    private JLabel currencyLabel; 
    private JLabel convertToLabel;
    private JLabel resultLabel;

    private JComboBox dollarAmountDropDown; 
    private JComboBox convertToDropDown;

    private JTextField resultField;
    private JFormattedTextField dollarAmountField;
    
    private JButton convertButton;

    
    CurrencyGUI() 
    {
        GridBagConstraints layout = null; 
        NumberFormat currencyFormat = null; 


        //set the the title 
        setTitle(" USD Currency Converter");

        //array for comboBox; 
        String[] dollarAmountCountries = {"USA"};
        String[] convertToCountries = {"Philippines","Australia","Canada","China","Japan"};


        //labels 
        dollarAmountLabel = new JLabel("Enter Amount:");
        

        currencyLabel = new JLabel("USD Currency");


        convertToLabel = new JLabel("Convert Currency To"); 
   

        resultLabel = new JLabel("Result");
     


        //text fields
        currencyFormat = NumberFormat.getCurrencyInstance(); 
        dollarAmountField = new JFormattedTextField(currencyFormat); 
        dollarAmountField.setEditable(true); 
        dollarAmountField.setValue(0); 

        resultField = new JTextField(15);
        resultField.setEditable(false); 


        //button
        convertButton = new JButton("Convert"); 
        convertButton.addActionListener(this);


        //drop down 
        dollarAmountDropDown = new JComboBox(dollarAmountCountries); 
        dollarAmountDropDown.setEditable(false); 
        dollarAmountDropDown.setSelectedIndex(0); 
        dollarAmountDropDown.addActionListener(this);

        convertToDropDown = new JComboBox(convertToCountries); 
        convertToDropDown.setEditable(false); 
        convertToDropDown.setSelectedIndex(4); 
        convertToDropDown.addActionListener(this);  


        //positioning 
        setLayout(new GridBagLayout()); 

        //layout the enter label
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.fill = GridBagConstraints.HORIZONTAL; 
        layout.gridx = 0; 
        layout.gridy = 0; 
        add(dollarAmountLabel, layout);
        
        //layout the enter field 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.fill = GridBagConstraints.HORIZONTAL; 
        layout.gridx = 0; 
        layout.gridy = 1; 
        add(dollarAmountField,layout);
        
        //position the drop down currency label 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.fill = GridBagConstraints.HORIZONTAL; 
        layout.gridx = 2; 
        add(currencyLabel,layout);
        
        
        //position the convert to label 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.fill = GridBagConstraints.HORIZONTAL; 
        layout.gridx = 3; 
        add(convertToLabel,layout);
        
        //add the drop down menus 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.fill = GridBagConstraints.LINE_END; 
        layout.gridx = 2; 
        layout.gridy = 1; 
        add(dollarAmountDropDown,layout); 
        
        layout = new GridBagConstraints();
        layout.insets = new Insets(10,10,10,10); 
        layout.fill = GridBagConstraints.HORIZONTAL; 
        layout.gridx = 3; 
        layout.gridy = 1; 
        add(convertToDropDown,layout);
       
        //position the button 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.fill = GridBagConstraints.HORIZONTAL; 
        layout.gridx = 0;
        layout.gridy = 4; 
        add(convertButton,layout);
        
        
        //position the result label 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.fill = GridBagConstraints.HORIZONTAL; 
        layout.gridx = 0; 
        layout.gridy = 5; 
        add(resultLabel,layout); 
        
        //position the result field 
        layout = new GridBagConstraints(); 
        layout.insets = new Insets(10,10,10,10); 
        layout.fill = GridBagConstraints.HORIZONTAL; 
        layout.gridx = 0; 
        layout.gridy = 6;
        add(resultField,layout);
        
        
    }
    
    @Override 
    public void actionPerformed(ActionEvent event) 
    {
        double newCurrency=0.0;
        double Amount;
        String currency; 
        String convertTo;
        int confirmation;
        
        currency = dollarAmountDropDown.getSelectedItem().toString();
        convertTo = convertToDropDown.getSelectedItem().toString();
        Amount = ((Number) dollarAmountField.getValue()).doubleValue();
        
        if(currency.equalsIgnoreCase("usa")) 
        {
             if(convertTo.equalsIgnoreCase("philippines"))
             {
                 confirmation = JOptionPane.showConfirmDialog(this,
                         "Do you wish to convert USD to ₱?", "Confirm",JOptionPane.YES_NO_OPTION,
                         JOptionPane.QUESTION_MESSAGE);
                 if(confirmation == JOptionPane.YES_OPTION)
                 {
                     newCurrency = Amount * 49.94;
                 }
             }
             
             else if (convertTo.equalsIgnoreCase("Australia")) 
             {
                 confirmation = JOptionPane.showConfirmDialog(this, 
                         "Do you wish to convert USD to A$?", "Confirm",
                         JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                 
                 if(confirmation == JOptionPane.YES_OPTION)
                 {
                     newCurrency = Amount * 1.36;
                 }
            
             }
             
             else if (convertTo.equalsIgnoreCase("Canada"))
             {
                 confirmation = JOptionPane.showConfirmDialog(this, 
                         "Do you want to convert USD to CA$?" ,"Confirm",
                         JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                 
                 if(confirmation == JOptionPane.YES_OPTION)
                 {
                    newCurrency = Amount * 1.27;
                 }
                 
             }
             
             else if (convertTo.equalsIgnoreCase("china"))
             {
                 confirmation = JOptionPane.showConfirmDialog(this,
                         "Do you want to convert USD to ¥?", "Confirm",
                         JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                 
                 if(confirmation == JOptionPane.YES_OPTION)
                 {
                     newCurrency = Amount * 6.44;
                 }
             }
             
             else if (convertTo.equalsIgnoreCase("japan"))
             {
                 confirmation = JOptionPane.showConfirmDialog(this,
                         "Do you want to convert USD to 円?", "Confirm",
                         JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                 
                 if(confirmation == JOptionPane.YES_OPTION)
                 {
                     newCurrency = Amount * 109.93;
                 }
             }
        }
       
        
        
        resultField.setText(Double.toString(newCurrency));
        
       
    }
    
   
    
}
