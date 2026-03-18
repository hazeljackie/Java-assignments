import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp extends JFrame implements ActionListener {

    JTextField display;
    String operator = "";
    double num1 = 0, num2 = 0;

    public CalculatorApp() {

        setTitle("Calculator");
        setSize(300,400);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,4));

        String[] buttons = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0",".","=","+",
                "C"
        };

        for(String text : buttons){
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        // Clear
        if(command.equals("C")){
            display.setText("");
            num1 = num2 = 0;
            operator = "";
        }

        else if(command.equals("+") || command.equals("-") || 
                command.equals("*") || command.equals("/")){

            num1 = Double.parseDouble(display.getText());
            operator = command;
            display.setText("");
        }

        else if(command.equals("=")){

            num2 = Double.parseDouble(display.getText());

            double result = 0;

            try {
                switch(operator){
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/":
                        if(num2 == 0){
                            throw new ArithmeticException();
                        }
                        result = num1 / num2;
                        break;
                }

                display.setText(String.valueOf(result));

            } catch (ArithmeticException ex){
                display.setText("Error");
            }
        }

        else {
            display.setText(display.getText() + command);
        }
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}
