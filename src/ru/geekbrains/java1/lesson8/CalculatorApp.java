package ru.geekbrains.java1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame {
    private JTextField textField;

    public CalculatorApp() {
        initComponents();
        setTitle("Calculator");
        setBounds(0, 0, 300, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(new BorderLayout());

        add(initTop(), BorderLayout.NORTH);
        add(initBottom(), BorderLayout.CENTER);

        setVisible(true);
    }

    private void initComponents() {
        textField = new JTextField();
    }

    private JPanel initTop() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        top.add(textField, BorderLayout.CENTER);
        return top;
    }

    private JPanel initBottom() {
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(7, 3));

        ActionListener operatorButtonListener = new OperatorsButtonListener(textField);

        for (int i = 1; i <= 9; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(operatorButtonListener);
            bottom.add(btn);
        }


        JButton submit = new JButton("=");

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textField.getText();
                String[] operators;
                if (value.contains("+")) {
                    operators = value.split("\\+");
                    textField.setText(
                            String.valueOf(
                                    Double.parseDouble(operators[0]) + Double.parseDouble(operators[1])
                            )
                    );
                } else if (value.contains("-")) {
                    operators = value.split("-");
                    textField.setText(
                            String.valueOf(
                                    Double.parseDouble(operators[0]) - Double.parseDouble(operators[1])
                            )
                    );
                } else if (value.contains("*")) {
                    operators = value.split("\\*");
                    textField.setText(
                            String.valueOf(
                                    Double.parseDouble(operators[0]) * Double.parseDouble(operators[1])
                            )
                    );
                } else if (value.contains("/")) {
                    operators = value.split("/");
                    textField.setText(
                            String.valueOf(
                                    Double.parseDouble(operators[0]) / Double.parseDouble(operators[1])
                            )
                    );
                } else if (value.contains("^")) {
                    operators = value.split("\\^");
                    textField.setText(
                            String.valueOf(
                                    Math.pow(Double.parseDouble(operators[0]), Double.parseDouble(operators[1]))
                            )
                    );
                }
            }
        });


        JButton zero = new JButton("0");
        zero.addActionListener(operatorButtonListener);
        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        JButton plus = new JButton("+");
        plus.addActionListener(operatorButtonListener);
        JButton minus = new JButton("-");
        minus.addActionListener(operatorButtonListener);
        JButton multiply = new JButton("*");
        multiply.addActionListener(operatorButtonListener);
        JButton division = new JButton("/");
        division.addActionListener(operatorButtonListener);
        JButton pointer = new JButton(".");
        pointer.addActionListener(operatorButtonListener);
        JButton sqrt = new JButton("√");
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(String.valueOf(Math.sqrt(Double.parseDouble(textField.getText()))));
            }
        });
        JButton sqr = new JButton("^");
        sqr.addActionListener(operatorButtonListener);

        bottom.add(submit);
        bottom.add(zero);
        bottom.add(clear);
        bottom.add(plus);
        bottom.add(minus);
        bottom.add(multiply);
        bottom.add(division);
        bottom.add(pointer);
        bottom.add(sqrt);
        bottom.add(sqr);
        return bottom;
    }
}