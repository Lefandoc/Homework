package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumbersGame extends JFrame {
    private int randomNumber;
    private JTextField textField;
    private int counter = 0;
    private JPanel buttonsPanel;
    private JButton buttonNewGame;
    private Font font;

    public NumbersGame() {
        this.randomNumber = (int) (Math.random() * 10) + 1;

        setTitle("Guess the number");
        setBounds(500,150,600,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        font = new Font("Times new roman", Font.PLAIN, 22);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);
        textField.setText("Программа загадала число от 1 до 10! У Вас 3 попытки");
        textField.setFont(font);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setEditable(false);

//        buttonsPanel = new JPanel(new GridLayout(1,10));
////        buttonsPanel.setBackground(Color.getHSBColor(38,11,27));
//        add(buttonsPanel, BorderLayout.CENTER);

        buttonNewGame = new JButton("Начать новую игру");
        add(buttonNewGame, BorderLayout.CENTER);
        buttonNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonNewGame.setVisible(false);
                buttonsPanel = new JPanel(new GridLayout(1,10));
                add(buttonsPanel, BorderLayout.CENTER);
                newGame(); /* 3* Внутри данного метода реализована механика 3 попыток и начала новой игры при проигрыше
                или первом запуске окна*/
            }
        });

//        2. В игре "Угадай число" сделать кнопку перезапуска игры.
//        Приложение должно загадать новое число, и написать об этом пользователю.
        JButton button2 = new JButton("Загадать новое число");
        add(button2, BorderLayout.SOUTH);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomNumber = (int) (Math.random() * 10) + 1;
                textField.setText("Программа загадала новое число, угадывайте!");
                counter = 0;
            }
        });
        setVisible(true);
    }

    public void newGame() {
        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
//                    System.out.println(counter);
                    tryToAnswer(buttonIndex);
                    if (counter == 3) {
                        textField.setText("Вы проиграли!");
                        buttonsPanel.setVisible(false);
                        add(buttonNewGame, BorderLayout.CENTER);
                        buttonNewGame.setVisible(true);
                        counter = 0;
                    }
                }
            });
        }
    }

    public void tryToAnswer(int answer) {
            if (answer < randomNumber) {
                textField.setText("Не угадали! Загаданное число больше");
                counter++;
                return;
            }
            if (answer > randomNumber) {
                textField.setText("Не угадали! Загаданное число меньше");
                counter++;
                return;
            }
            textField.setText("Вы угадали верное число! Ответ: " + randomNumber);
    }
}
