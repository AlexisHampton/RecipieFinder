package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

public class LaunchPage extends JFrame implements ActionListener {
   private JButton submitButton;
    private JTextField textField;

    private String input = "chicken";

    LaunchPage(){
        this.setBounds(200, 200, 500, 260);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submitButton = new JButton("Find Recipies");
        submitButton.addActionListener(this);
        submitButton.setPreferredSize(new Dimension(250, 25));
        submitButton.setVerticalAlignment(JTextField.CENTER);

        textField= new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setHorizontalAlignment(JTextField.CENTER);

        this.add(textField);
        this.add(submitButton);
        //pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitButton){
            input = textField.getText();
            try {
                AccessAPI.AccessAPI(input);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public String getInput(){ return input;}

}
