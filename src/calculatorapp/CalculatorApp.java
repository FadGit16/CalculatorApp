package calculatorapp;

import javax.swing.*;
import java.awt.event.*;

public class CalculatorApp {
    
    private JFrame frame;
    private JTextField txtDisplay;
    
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDevision;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMiners;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnStar;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;

    private double firstNumber, secondNumber;
    private String operator;

    public CalculatorApp() {
        // Your GUI initialization code here
        frame = new JFrame();
        txtDisplay = new JTextField();

        // Add listeners for buttons as shown above

        btnZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + "0");
            }
        });

        // Other buttons...

        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                secondNumber = Double.parseDouble(txtDisplay.getText());

                double result = 0;
                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        if (secondNumber != 0) {
                            result = firstNumber / secondNumber;
                        } else {
                            txtDisplay.setText("Error");
                            return;
                        }
                        break;
                }

                txtDisplay.setText(String.valueOf(result));
            }
        });

        // Add more listeners for other buttons...
    }
    
    public static void main(String[] args) {
        CalculatorApp calculatorApp = new CalculatorApp();
    }
    
}
