package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("My first window");
        setBounds(500,150,480,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Font font = new Font("Times new roman", Font.ITALIC, 20);

//        setLayout(new GridLayout(7,1));
        JButton button = new JButton("Yes");
        JButton button2 = new JButton("No!");

        JPanel buttonsPanel = new JPanel(new GridLayout(2,1));
        buttonsPanel.setBackground(Color.DARK_GRAY);
        add(buttonsPanel, BorderLayout.CENTER);
        buttonsPanel.add(button);
        buttonsPanel.add(button2);


        JTextArea area = new JTextArea("Yes");
        add(area, BorderLayout.PAGE_START);
        area.setEditable(false);
        area.setFont(font);

//        add(button, BorderLayout.PAGE_END);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("It works!");
                area.setText("Yes");
                for (int i = 0; i < 2; i++) {
                    area.append(" Yes");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.replaceRange("No!", 0 ,11);
            }
        });



        setVisible(true);
    }
}
