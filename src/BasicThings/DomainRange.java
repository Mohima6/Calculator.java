package BasicThings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DomainRange {

    public static void main(String[] args) {
        // Setup main frame
        JFrame frame = new JFrame("Domain and Range Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        // Panel for selection
        JPanel functionPanel = new JPanel(new FlowLayout());
        JLabel selectLabel = new JLabel("Select function type:");
        String[] functions = {"Linear (y = mx + b)", "Quadratic (y = ax^2 + bx + c)",
                "Exponential (y = a * b^x)", "Logarithmic (y = log_b(x))", "Sine (y = sin(x))",
                "Cosine (y = cos(x))", "Tangent (y = tan(x))", "Cosecant (y = cosec(x))",
                "Secant (y = sec(x))", "Cotangent (y = cot(x))"};
        JComboBox<String> functionComboBox = new JComboBox<>(functions);
        functionPanel.add(selectLabel);
        functionPanel.add(functionComboBox);

        // Input panel
        JPanel inputPanel = new JPanel(new CardLayout());
        inputPanel.setBorder(BorderFactory.createTitledBorder("Enter coefficients:"));

        // Linear input
        JPanel linearPanel = new JPanel(new GridLayout(2, 2));
        linearPanel.add(new JLabel("m (Slope):"));
        JTextField linearMField = new JTextField();
        linearPanel.add(linearMField);
        linearPanel.add(new JLabel("b (Intercept):"));
        JTextField linearBField = new JTextField();
        linearPanel.add(linearBField);

        // Quadratic input
        JPanel quadraticPanel = new JPanel(new GridLayout(3, 2));
        quadraticPanel.add(new JLabel("a (Coefficient of x^2):"));
        JTextField quadAField = new JTextField();
        quadraticPanel.add(quadAField);
        quadraticPanel.add(new JLabel("b (Coefficient of x):"));
        JTextField quadBField = new JTextField();
        quadraticPanel.add(quadBField);
        quadraticPanel.add(new JLabel("c (Constant):"));
        JTextField quadCField = new JTextField();
        quadraticPanel.add(quadCField);

        // Exponential input
        JPanel expPanel = new JPanel(new GridLayout(2, 2));
        expPanel.add(new JLabel("a (Base multiplier):"));
        JTextField expAField = new JTextField();
        expPanel.add(expAField);
        expPanel.add(new JLabel("b (Base of exponent):"));
        JTextField expBField = new JTextField();
        expPanel.add(expBField);

        // Logarithmic input
        JPanel logPanel = new JPanel(new GridLayout(1, 2));
        logPanel.add(new JLabel("b (Base of logarithm):"));
        JTextField logBField = new JTextField();
        logPanel.add(logBField);

        // Trigonometric panel
        JPanel trigPanel = new JPanel(new FlowLayout());
        trigPanel.add(new JLabel("Trigonometric functions don't require coefficients."));

        // Add panels to input panel
        inputPanel.add(linearPanel, "Linear (y = mx + b)");
        inputPanel.add(quadraticPanel, "Quadratic (y = ax^2 + bx + c)");
        inputPanel.add(expPanel, "Exponential (y = a * b^x)");
        inputPanel.add(logPanel, "Logarithmic (y = log_b(x))");
        inputPanel.add(trigPanel, "Trigonometric functions");

        // Result panel
        JPanel resultPanel = new JPanel(new BorderLayout());
        JButton calculateButton = new JButton("Calculate");
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultPanel.add(calculateButton, BorderLayout.NORTH);
        resultPanel.add(new JScrollPane(resultArea), BorderLayout.CENTER);

        // Action listener for functionComboBox to switch input panels
        functionComboBox.addActionListener(e -> {
            CardLayout cl = (CardLayout) (inputPanel.getLayout());
            String selected = (String) functionComboBox.getSelectedItem();

            if (selected.startsWith("Sin") || selected.startsWith("Cos") || selected.startsWith("Tan")) {
                cl.show(inputPanel, "Trigonometric functions");
            } else {
                cl.show(inputPanel, selected);
            }
        });

        // Action listener for calculateButton
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFunction = (String) functionComboBox.getSelectedItem();
                resultArea.setText("");

                try {
                    switch (selectedFunction) {
                        case "Linear (y = mx + b)":
                            double m = Double.parseDouble(linearMField.getText());
                            double b = Double.parseDouble(linearBField.getText());
                            resultArea.append("Domain: All real numbers (-∞, ∞)\n");
                            resultArea.append("Range: All real numbers (-∞, ∞)\n");
                            break;

                        case "Quadratic (y = ax^2 + bx + c)":
                            double a = Double.parseDouble(quadAField.getText());
                            double bQuad = Double.parseDouble(quadBField.getText());
                            double c = Double.parseDouble(quadCField.getText());
                            resultArea.append("Domain: All real numbers (-∞, ∞)\n");
                            resultArea.append("Range depends on the parabola's orientation\n");
                            break;

                        case "Exponential (y = a * b^x)":
                            double aExp = Double.parseDouble(expAField.getText());
                            double bExp = Double.parseDouble(expBField.getText());
                            resultArea.append("Domain: All real numbers (-∞, ∞)\n");
                            resultArea.append("Range: Positive values only\n");
                            break;

                        case "Logarithmic (y = log_b(x))":
                            double bLog = Double.parseDouble(logBField.getText());
                            resultArea.append("Domain: x > 0\n");
                            resultArea.append("Range: All real numbers (-∞, ∞)\n");
                            break;

                        case "Sine (y = sin(x))":
                            resultArea.append("Domain: All real numbers (-∞, ∞)\n");
                            resultArea.append("Range: [-1, 1]\n");
                            break;

                        case "Cosine (y = cos(x))":
                            resultArea.append("Domain: All real numbers (-∞, ∞)\n");
                            resultArea.append("Range: [-1, 1]\n");
                            break;

                        case "Tangent (y = tan(x))":
                            resultArea.append("Domain: All real numbers except x = π/2 + nπ\n");
                            resultArea.append("Range: All real numbers (-∞, ∞)\n");
                            break;

                        case "Cosecant (y = cosec(x))":
                            resultArea.append("Domain: All real numbers except x = nπ\n");
                            resultArea.append("Range: (-∞, -1] ∪ [1, ∞)\n");
                            break;

                        case "Secant (y = sec(x))":
                            resultArea.append("Domain: All real numbers except x = π/2 + nπ\n");
                            resultArea.append("Range: (-∞, -1] ∪ [1, ∞)\n");
                            break;

                        case "Cotangent (y = cot(x))":
                            resultArea.append("Domain: All real numbers except x = nπ\n");
                            resultArea.append("Range: All real numbers (-∞, ∞)\n");
                            break;

                        default:
                            resultArea.setText("Error: Function not recognized.");
                            break;
                    }
                } catch (NumberFormatException ex) {
                    resultArea.setText("Error: Invalid input.");
                }
            }
        });

        // Add components to the frame
        frame.add(functionPanel, BorderLayout.NORTH);
        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(resultPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
