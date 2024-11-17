package BasicThings;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CurrencyCalculator {

    private static final Map<String,Double> exchangeRates = new HashMap<>();
    public static void main(String[] args) {
        //initialize exchange rates
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("BDT", 110.0);
        exchangeRates.put("INR", 82.5);
        exchangeRates.put("EUR", 0.93);
        exchangeRates.put("GBP", 0.81);
        exchangeRates.put("JPY", 150.0);
        exchangeRates.put("AUD", 1.5);
        exchangeRates.put("AED", 3.67);
        exchangeRates.put("CAD", 1.35);
        exchangeRates.put("CHF", 0.89);
        exchangeRates.put("CNY", 7.2);
        exchangeRates.put("SEK", 10.5);
        exchangeRates.put("NZD", 1.67);
        exchangeRates.put("SGD", 1.36);
        exchangeRates.put("HKD", 7.84);
        exchangeRates.put("KRW", 1340.0);
        exchangeRates.put("ZAR", 18.5);
        exchangeRates.put("MXN", 17.0);

    

          //let's create frame
          JFrame frame = new JFrame("Currency Calculator");
          frame.setSize(600,600);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setLayout(new GridLayout(7,2));


        //input for amount & currency
        JLabel inputAmounLabel = new JLabel("Enter Amount:");
        JTextField inputAmountField = new JTextField();

        JLabel inputCurrencyLabel = new JLabel("From currency:");
        JComboBox<String> fromCurrencyBox = new JComboBox<>(exchangeRates.keySet().toArray(new String[0]));

        JLabel targetCurrencyLabel = new JLabel("To currency:");
        JComboBox<String> toCurrencyBox = new JComboBox<>(exchangeRates.keySet().toArray(new String[0]));


        //button for conversion
        JButton convertButton = new JButton("Convert");
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        

        //action listener for convert button
        convertButton.addActionListener(e -> {
              
            try {
                double amount = Double.parseDouble(inputAmountField.getText());
                String fromCurrency = (String) fromCurrencyBox.getSelectedItem();
                String toCurrency = (String) toCurrencyBox.getSelectedItem();


                if (fromCurrency==null || toCurrency == null) {
                    JOptionPane.showMessageDialog(frame, "Please select both currencies.");
                    return;
                }
                //covert to usd
                double amountInUSD = amount / exchangeRates.get(fromCurrency);
                //usd to other
                double convertedAmount = amountInUSD * exchangeRates.get(toCurrency);


resultArea.setText(String.format("Conversion Result: \n%.2f %s = %.2f %s", amount,fromCurrency,
convertedAmount,toCurrency));
            } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(frame, "Please enter a valid numeric amount.");

            }
        });

        //add components to frame
        frame.add(inputAmounLabel);
        frame.add(inputAmountField);
        frame.add(inputCurrencyLabel);
        frame.add(fromCurrencyBox);
        frame.add(targetCurrencyLabel);
        frame.add(toCurrencyBox);
        frame.add(convertButton);
        frame.add(new JScrollPane(resultArea));


        frame.setVisible(true);

    }
}