package ru.home.java.homework.xoswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyGameWindow extends JFrame {

    private JTextField textField;

    private JPanel buttonsPanel;
    public MyGameWindow() {
        setTitle("VisualXO");
        setBounds(600, 300, 300, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        textField.setText("Выберите клетку");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 24);
        textField.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(3,3));
        add(buttonsPanel, BorderLayout.SOUTH);

        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
        }

        setVisible(true);
    }
}
