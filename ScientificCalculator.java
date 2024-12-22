import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScientificCalculator {
    private JFrame frame;
    private JTextField display;
    private String operator = "";
    private double firstOperand = 0;
    private boolean isOperatorClicked = false;

    public ScientificCalculator() {
        frame = new JFrame("Scientific Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 700);

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(7, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "x",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "^", "log", "ln",
                "sin", "cos", "tan", "√",
                "1/x", "!", "(", ")"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        frame.setLayout(new BorderLayout());
        frame.add(display, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();

            if (command.matches("[0-9.]")) {
                if (isOperatorClicked) {
                    display.setText("");
                    isOperatorClicked = false;
                }
                display.setText(display.getText() + command);
            } else if (command.matches("[+\\-x/^]")) {
                firstOperand = Double.parseDouble(display.getText());
                operator = command;
                isOperatorClicked = true;
            } else if (command.equals("C")) {
                display.setText("");
                firstOperand = 0;
                operator = "";
            } else if (command.equals("=")) {
                double secondOperand = Double.parseDouble(display.getText());
                double result = calculate(firstOperand, secondOperand, operator);
                display.setText(String.valueOf(result));
                operator = "";
            } else if (command.equals("log")) {
                double value = Double.parseDouble(display.getText());
                display.setText(String.valueOf(Math.log10(value)));
            } else if (command.equals("ln")) {
                double value = Double.parseDouble(display.getText());
                display.setText(String.valueOf(Math.log(value)));
            } else if (command.equals("sin")) {
                double value = Math.toRadians(Double.parseDouble(display.getText()));
                display.setText(String.valueOf(Math.sin(value)));
            } else if (command.equals("cos")) {
                double value = Math.toRadians(Double.parseDouble(display.getText()));
                display.setText(String.valueOf(Math.cos(value)));
            } else if (command.equals("tan")) {
                double value = Math.toRadians(Double.parseDouble(display.getText()));
                display.setText(String.valueOf(Math.tan(value)));
            } else if (command.equals("√")) {
                double value = Double.parseDouble(display.getText());
                display.setText(String.valueOf(Math.sqrt(value)));
            } else if (command.equals("1/x")) {
                double value = Double.parseDouble(display.getText());
                display.setText(String.valueOf(1 / value));
            } else if (command.equals("!")) {
                int value = Integer.parseInt(display.getText());
                display.setText(String.valueOf(factorial(value)));
            }
        }

        private double calculate(double a, double b, String op) {
            switch (op) {
                case "+":
                    return a + b;
                case "-":
                    return a - b;
                case "x":
                    return a * b;
                case "/":
                    return a / b;
                case "^":
                    return Math.pow(a, b);
                default:
                    return 0;
            }
        }

        private long factorial(int n) {
            if (n == 0 || n == 1) return 1;
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ScientificCalculator::new);
    }
}
