package calculatorapp;

import Calculator.CalculatorForm;
import javax.swing.JFrame;

public class CalculatorApp {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorForm().setVisible(true);
            }
        });
    }
}
