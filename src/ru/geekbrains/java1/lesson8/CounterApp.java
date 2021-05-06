package ru.geekbrains.java1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
   private int value;

   public CounterApp(int initialValue) {
       setBounds(500, 500, 300, 120);
       setTitle("Simple Counter");
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setAlwaysOnTop(true);

       Font font = new Font("Arial", Font.BOLD, 32);

       JLabel counterValueView = new JLabel(String.valueOf(value));
       counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
       counterValueView.setFont(font);
       add(counterValueView, BorderLayout.CENTER);

       value = initialValue;
       refreshCounterLabel(counterValueView);

       JButton decrementButton = new JButton("<");
       add(decrementButton, BorderLayout.LINE_START);
       decrementButton.setFont(font);

       JButton incrementButton = new JButton(">");
       add(incrementButton, BorderLayout.LINE_END);
       incrementButton.setFont(font);

       decrementButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               value--;
               refreshCounterLabel(counterValueView);
           }
       });

       incrementButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               value++;
               refreshCounterLabel(counterValueView);
           }
       });

       setVisible(true);
   }

    private void refreshCounterLabel(JLabel counterValueView) {
        counterValueView.setText(String.valueOf(value));
    }

    public static void main(String[] args) {
       new CounterApp(0);
   }
}

