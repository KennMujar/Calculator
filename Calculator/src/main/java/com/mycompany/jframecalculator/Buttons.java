/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframecalculator;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.JLabel;
//TO DO: what

/**
 *
 * @author KennMujar
 */
public class Buttons {

    public String inputs = "";
    public String up = "";
    public String down = "";
    String formatted;
    int upNum = 0;
    int downNum = 0;
    int result = 0;
    String showUp;
    float decimal = 0;

    public void Buttons(JButton button, JLabel input, JLabel output) {
        DecimalFormat decFormat = new DecimalFormat("###,###");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                up = input.getText();
                down = output.getText();
                String buttonsVal = button.getText();
                switch (buttonsVal) {
                    case "$" -> {
                        //OPEN  CRYPTO CURRENCY PANEL
                    }
                    case "c" -> {
                        //EMPTY INPUTS
                        //EMPTY INPUT AND SET OUTPUT TO 0
                        inputs = "";
                        input.setText("");
                        output.setText("0");
                    }
                    case "x" -> {
                        //Remove last letter
                        String newWord = down.substring(0, down.length() - 1);

                        output.setText(newWord);

                        //Store new value into inputs
                        inputs = newWord;
                        //Set to Zero if Inputs is Empty
                        if (inputs.isEmpty()) {
                            output.setText("0");
                        }
                    }
                    case "÷" -> {
                        //CHECK IF INPUT AND OUTPUT FIELD IS NOT EMPTY
                        if (!(inputs.isEmpty()) && !(up.isEmpty())) {
                            //OPERATIONS
                            result = upNum / downNum;
                            //Format
                            showUp = decFormat.format(result);
                            //SET INPUT FIELD WITH OUTPUTS/OPERATIONS
                            input.setText(showUp.concat(" " + buttonsVal));
                            //SET OUTPUT FIELD WITH THE RESULLT
                            output.setText(showUp);
                            //Check if Up Field is Empty - Print Result and Operator
                        } else if (inputs.isEmpty()) {
                            input.setText(showUp.concat((" ") + buttonsVal));
                            //Print input and Operator
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
                        input.setText(inputs.concat(buttonsVal));
                        inputs = "";
                    }
                    case "." -> {
                        inputs += buttonsVal;
                       
//                        for (int i = 0; i < inputs.length(); i++) {
//                            char dot = inputs.charAt(i);
//                            if (dot == '.') {
//                                decimal = Float.parseFloat(inputs);
//                            }
//                        }
                    }
                    case "=" -> {
                        //Get Last Character to determine which Operator
                        char lastIndex = up.charAt(up.length() - 1);
                        //Determine which Operators
                        switch (lastIndex) {
                            case '+' ->
                                result = upNum + downNum;
                            case '-' ->
                                result = upNum - downNum;
                            case '×' ->
                                result = upNum * downNum;
                            case '÷' -> {
                                //Check if the result will not be an even
                                if (upNum % downNum != 0) {
                                    //Convert result to float and display
                                    float quotient = (float) upNum / downNum;
                                    showUp = Float.toString(quotient);
                                    input.setText(up.concat(" " + inputs + " " + buttonsVal));
                                    output.setText(showUp);
                                    quotient = 0;
                                    inputs = "";
                                    return;
                                } else {
                                    result = upNum / downNum;
                                }
                            }
                        }
                        //CONVERT RESULT TO STRING
                        formatted = decFormat.format(result);
                        //SHOW IN INPUT FIELD THE OUTPUT AND EQUAL SIGN
                        showUp = decFormat.format(Integer.parseInt(inputs.trim()));
                        input.setText(up.concat(" " + showUp + " " + buttonsVal));
                        output.setText(formatted);
                        inputs = "";
                    }
                    default -> {
                        //FOR NUMBERS
                        //STORE CLICKED NUMBERS INTO INPUT VARIABLE
                        inputs += buttonsVal; //String
                        //FORMATTING
                        formatted = decFormat.format(Integer.parseInt(inputs.trim())); //String
                        //SHOW IN OUTPUT FIELD ALL INPUTS
                        output.setText(formatted);
                    }
                }

                //CONVERT INPUTS TO INTEGER REPLACE OPERATOR BY SPACE AND TRIM WHITE SPACE
                upNum = Integer.parseInt(up.replaceAll("[,+×÷-]", "").trim());
                downNum = Integer.parseInt(inputs.trim());

            }
        });
    }
}
