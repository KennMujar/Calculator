package com.mycompany.jframecalculator;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.JLabel;
//TO DO: what
import javax.swing.JPanel;

/**
 *
 * @author KennMujar
 */
public class Buttons {

    public String inputs = "";
    public String up = "";
    public String down = "";
    String formatted = "";
    double upNum = 0;
    double downNum = 0;

    String showUp = "";

    public void Buttons(JButton button, JLabel input, JLabel output) {
        JFrameCalculator calc = new JFrameCalculator();
        DecimalFormat decFormat = new DecimalFormat();
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double result = 0;
                up = input.getText();
                down = output.getText();
                String buttonsVal = e.getActionCommand();
                switch (buttonsVal) {
                    case "$" -> {
                        // OPEN CRYPTO CURRENCY PANEL
                        calc.CryptoConverter();
                    }
                    case "c" -> {
                        // EMPTY INPUTS
                        // EMPTY INPUT AND SET OUTPUT TO 0
                        inputs = "";
                        input.setText("");
                        output.setText("0");
                    }
                    case "x" -> {
                        // Remove last letter
                        String newWord = down.substring(0, down.length() - 1);

                        output.setText(newWord);

                        // Store new value into inputs
                        inputs = newWord;
                        // Set to Zero if Inputs is Empty
                        if (inputs.isEmpty()) {
                            output.setText("0");
                        }
                    }
                    case "÷" -> {
                        // CHECK IF INPUT AND OUTPUT FIELD IS NOT EMPTY
                        if (!(inputs.isEmpty()) && !(up.isEmpty())) {
                            // We will check here if the result will be a whole number or not
                            // If the result is not a whole number we will convert the result into float so
                            // we can get the decimal
                            result = upNum / downNum;
                            // Format
                            showUp = decFormat.format(result);
                            // SET INPUT FIELD WITH OUTPUTS/OPERATIONS
                            input.setText(showUp.concat(" " + buttonsVal));
                            output.setText(showUp);
                            // Check if Up Field is Empty - Print Result and Operator
                        } else if (inputs.isEmpty()) {
                            input.setText(showUp.concat((" ") + buttonsVal));
                            // Print input and Operator
                        } else {
                            input.setText(formatted.concat(" " + buttonsVal));
                        }

                        inputs = "";
                    }
                    case "×" -> {
                        if (!(inputs.isEmpty()) && !(up.isEmpty())) {
                            result = upNum * downNum;
                            showUp = decFormat.format(result);
                            input.setText(showUp.concat(" " + buttonsVal));
                            output.setText(showUp);

                        } else if (inputs.isEmpty()) {
                            input.setText(showUp.concat(" " + buttonsVal));
                        } else {
                            input.setText(formatted.concat(" " + buttonsVal));
                        }
                        inputs = "";
                    }
                    case "－" -> {
                        up = input.getText();

                        if (!(inputs.isEmpty()) && !(up.isEmpty())) {
                            result = upNum - downNum;
                            showUp = decFormat.format(result);
                            input.setText(showUp.concat(" -"));
                            output.setText(showUp);
                        } else if (inputs.isEmpty()) {
                            input.setText(showUp.concat(" -"));
                        } else {
                            input.setText(formatted.concat(" -"));
                        }
                        inputs = "";
                    }
                    case "+" -> {
                        if (!(inputs.isEmpty()) && !(up.isEmpty())) {
                            result = upNum + downNum;
                            showUp = decFormat.format(result);
                            input.setText(showUp.concat(" " + buttonsVal));
                            output.setText(showUp);
                        } else if (inputs.isEmpty()) {
                            input.setText(showUp.concat(" " + buttonsVal));
                        } else {
                            input.setText(formatted.concat(" " + buttonsVal));
                        }
                        inputs = "";
                    }
                    case "+/-" -> {
                        if (!(inputs.isEmpty())) {
                            if (inputs.charAt(0) != '+' && inputs.charAt(0) != '-') {
                                inputs = "+" + inputs;

                            } else if (inputs.charAt(0) == '+') {
                                inputs = inputs.substring(0, 0) + '-' + inputs.substring(1);

                            } else if (inputs.charAt(0) == '-') {
                                inputs = inputs.substring(0, 0) + '+' + inputs.substring(1);

                            }
                            formatted = decFormat.format(Double.parseDouble(inputs.trim())); // String

                            output.setText(formatted);

                        }

                    }

                    case "=" -> {
                        // Get Last Character to determine which Operator
                        char lastIndex = up.charAt(up.length() - 1);
                        // Determine which Operators
                        switch (lastIndex) {
                            case '+' ->
                                result = upNum + downNum;
                            case '-' ->
                                result = upNum - downNum;
                            case '×' ->
                                result = upNum * downNum;
                            case '÷' -> {
                                // Check if the result will not be an even

                                result = upNum / downNum;

                            }
                        }
                        // CONVERT RESULT TO STRING
                        formatted = decFormat.format(result);
                        // SHOW IN INPUT FIELD THE OUTPUT AND EQUAL SIGN
                        showUp = decFormat.format(Double.parseDouble(inputs.trim()));
                        input.setText(up.concat(" " + showUp + " " + buttonsVal));
                        output.setText(formatted);
                        inputs = "";
                    }
                    default -> {
                        // FOR NUMBERS
                        // STORE CLICKED NUMBERS INTO INPUT VARIABLE
                        inputs += buttonsVal; // String
                        // FORMATTING

                        formatted = decFormat.format(Double.parseDouble(inputs.trim())); // String
                        // SHOW IN OUTPUT FIELD ALL INPUTS
                        output.setText(formatted);
                    }
                }

                // CONVERT INPUTS TO DOUBLE REPLACE OPERATOR BY SPACE AND TRIM WHITE SPACE

                if (!up.isEmpty()) {
                    upNum = Double.parseDouble(
                            up.substring(0, 1) + up.substring(1, up.length()).replaceAll("[\\s=,+×÷-]",
                                    "").trim());
                }
                if (!inputs.isEmpty())
                    downNum = Double.parseDouble(inputs.replaceAll("[\\s,]", "").trim());
            }
        });
    }
}
