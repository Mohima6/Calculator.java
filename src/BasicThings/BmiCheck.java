package BasicThings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BmiCheck {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BMI Calculator");
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(12,1));


        //input 
        JLabel weightLabel = new JLabel("Enter weight (kg):");
        JTextField weightField = new JTextField();

        JLabel heightLabel = new JLabel("Enter height (cm):");
        JTextField heightField = new JTextField();

        JLabel ageLabel = new JLabel("Enter age:");
        JTextField ageField = new JTextField();

        JLabel genderLabel = new JLabel("Select gender:");
        JComboBox<String> genderBox = new JComboBox<>(new String[] {"Female","Male"});

        JLabel activityLabel = new JLabel("Activity/sports:");
        JComboBox<String> activityBox = new JComboBox<>(new String[] {
                "Light",
                "Moderate",
                "Extra active",
                "Excessive now"
                
        });

        //buttons
        JButton calculateBMIButton = new JButton("Calculate BMI");
        JButton calculateCalorieButton = new JButton("Calculate Calorie Needs");

        //result
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);


        //add 
        frame.add(weightLabel);
        frame.add(weightField);
        frame.add(heightLabel);
        frame.add(heightField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(genderLabel);
        frame.add(genderBox);
        frame.add(activityLabel);
        frame.add(activityBox);
        frame.add(calculateBMIButton);
        frame.add(calculateCalorieButton);
        frame.add(new JScrollPane(resultArea));

        //action for buttons
        calculateBMIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    double weight = Double.parseDouble(weightField.getText());
                    double height = Double.parseDouble(heightField.getText()) / 100; //cm to meters
                    double bmi = weight / (height * height);

                    String category;
                    if (bmi < 18.5) category = "Underweight";
                    else if (bmi < 24.9) category = "Normal weight";
                    else if (bmi < 29.9) category = "Overweight";
                    else category = "Obesity";

    resultArea.setText(String.format("BMI: %.2f (%s) \n", bmi,category));
                } catch (NumberFormatException ex) {
                    resultArea.setText("Enter valid numeric values:");
                }
            }
        });

        calculateCalorieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    double weight = Double.parseDouble(weightField.getText());
                    int age = Integer.parseInt(ageField.getText());
                    String gender = (String) genderBox.getSelectedItem();
                    String activity = (String) activityBox.getSelectedItem();


        double bmr;
        if ("Male".equals(gender)) {
        bmr = 10 * weight + 6.25 * Double.parseDouble(heightField.getText()) - 5 * age + 5;
            } else {
                bmr = 10 * weight + 6.25 * Double.parseDouble(heightField.getText()) - 5 * age - 161;
            }

            double activityMultiplier;
            switch (activity) {
                case "Light":
                    activityMultiplier = 1.375;
                    break;
                case "Moderate":
                    activityMultiplier = 1.55;
                    break;
                case "Extra active":
                    activityMultiplier = 1.725;
                    break;
                case "Excessive now":
                    activityMultiplier = 1.9;
                    break;
                    
                default:
                    activityMultiplier = 1.2;                  
                    }

            double calorieNeeds = bmr * activityMultiplier;
            resultArea.append(String.format("Calories you'll need daily: %.2f kcal \n", calorieNeeds));

                } catch (NumberFormatException ex){
                     resultArea.setText("Enter valid numeric values.");
                }
            }
        });

        frame.setVisible(true);
    }
}
