/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.jframecalculator;

import java.awt.Color;
import javax.swing.*;
import java.awt.Font;

/**
 *
 * @author Kenn Mujar
 */
public class JFrameCalculator {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Calculator");
        Buttons buttons = new Buttons();
        //Text Field
        JLabel input = new JLabel();
        input.setBounds(0, -20, 340, 100);
        input.setFont(new Font("Arial", Font.PLAIN, 18));
        input.setForeground(new Color(148, 148, 148));
        
        JLabel output = new JLabel("0");
        output.setBounds(0, 60, 340, 100);
        output.setFont(new Font("Arial", Font.PLAIN, 70));
        output.setForeground(Color.white);
        //First Row Buttons
        JButton converter = new JButton("$");
        buttons.Buttons(converter, input, output);
        converter.setBounds(2, 175, 80, 55);
        converter.setFocusPainted(false);
        converter.setBorderPainted(false);
        converter.setBackground(new Color(19,19,19,255));
        converter.setFont(new Font("Arial", Font.PLAIN, 20));
        converter.setForeground(Color.lightGray);
        
        JButton clearAll = new JButton("c");
        buttons.Buttons(clearAll, input, output);
        clearAll.setBounds(85, 175, 80, 55);
        clearAll.setFocusPainted(false);
        clearAll.setBorderPainted(false);
        clearAll.setBackground(new Color(19,19,19,255));
        clearAll.setFont(new Font("Arial", Font.PLAIN, 25));
        clearAll.setForeground(Color.lightGray);
        
        JButton erase = new JButton("x");
        buttons.Buttons(erase, input, output);
        erase.setBounds(168, 175, 80, 55);
        erase.setFocusPainted(false);
        erase.setBorderPainted(false);
        erase.setBackground(new Color(19,19,19,255));
        erase.setFont(new Font("Arial", Font.PLAIN, 23));
        erase.setForeground(Color.lightGray);
        
        JButton numDivision = new JButton("÷");
        buttons.Buttons(numDivision, input, output);
        numDivision.setBounds(251, 175, 80, 55);
        numDivision.setFocusPainted(false);
        numDivision.setBorderPainted(false);
        numDivision.setBackground(new Color(19,19,19,255));
        numDivision.setFont(new Font("Arial", Font.PLAIN, 20));
        numDivision.setForeground(Color.lightGray);
        
        //Second Row Buttons
        JButton num7 = new JButton("7");
        buttons.Buttons(num7, input, output);
        num7.setBounds(2, 232, 80, 55);
        num7.setFocusPainted(false);
        num7.setBorderPainted(false);
        num7.setBackground(Color.black);
        num7.setForeground(Color.white);
        
        JButton num8 = new JButton("8");
        buttons.Buttons(num8, input, output);
        num8.setBounds(85, 232, 80, 55);
        num8.setFocusPainted(false);
        num8.setBorderPainted(false);
        num8.setBackground(Color.black);
        num8.setForeground(Color.white);
        
        JButton num9 = new JButton("9");
        buttons.Buttons(num9, input, output);
        num9.setBounds(168, 232, 80, 55);
        num9.setFocusPainted(false);
        num9.setBorderPainted(false);
        num9.setBackground(Color.black);
        num9.setForeground(Color.white);
        
        JButton numMultiplication = new JButton("×");
        buttons.Buttons(numMultiplication, input, output);
        numMultiplication.setBounds(251, 232, 80, 55);
        numMultiplication.setFocusPainted(false);
        numMultiplication.setBorderPainted(false);
        numMultiplication.setBackground(new Color(19,19,19,255));
        numMultiplication.setFont(new Font("Arial", Font.PLAIN, 20));
        numMultiplication.setForeground(Color.lightGray);
        
        //Third Row Buttons
        JButton num4 = new JButton("4");
        buttons.Buttons(num4, input, output);
        num4.setBounds(2, 289, 80, 55);
        num4.setFocusPainted(false);
        num4.setBorderPainted(false);
        num4.setBackground(Color.black);
        num4.setForeground(Color.white);
        
        JButton num5 = new JButton("5");
        buttons.Buttons(num5, input, output);
        num5.setBounds(85, 289, 80, 55);
        num5.setFocusPainted(false);
        num5.setBorderPainted(false);
        num5.setBackground(Color.black);
        num5.setForeground(Color.white);
        
        JButton num6 = new JButton("6");
        buttons.Buttons(num6, input, output);
        num6.setBounds(168, 289, 80, 55);
        num6.setFocusPainted(false);
        num6.setBorderPainted(false);
        num6.setBackground(Color.black);    
        num6.setForeground(Color.white);
        
        JButton numSubtract = new JButton("－");
        buttons.Buttons(numSubtract, input, output);
        numSubtract.setBounds(251, 289, 80, 55);
        numSubtract.setFocusPainted(false);
        numSubtract.setBorderPainted(false);
        numSubtract.setBackground(new Color(19,19,19,255));
        numSubtract.setFont(new Font("Arial", Font.PLAIN, 20));
        numSubtract.setForeground(Color.lightGray);
        
        //Fourth Row Buttons
        JButton num1 = new JButton("1");
        buttons.Buttons(num1, input, output);
        num1.setBounds(2, 346, 80, 55);
        num1.setFocusPainted(false);
        num1.setBorderPainted(false);
        num1.setBackground(Color.black);
        num1.setForeground(Color.white);
        
        JButton num2 = new JButton("2");
        buttons.Buttons(num2, input, output);
        num2.setBounds(85, 346, 80, 55);
        num2.setFocusPainted(false);
        num2.setBorderPainted(false);
        num2.setBackground(Color.black);
        num2.setForeground(Color.white);
        
        JButton num3 = new JButton("3");
        buttons.Buttons(num3, input, output);
        num3.setBounds(168, 346, 80, 55);
        num3.setFocusPainted(false);
        num3.setBorderPainted(false);
        num3.setBackground(Color.black);
        num3.setForeground(Color.white);
        
        JButton numAdd = new JButton("+");
        buttons.Buttons(numAdd, input, output);
        numAdd.setBounds(251, 346, 80, 55);
        numAdd.setFocusPainted(false);
        numAdd.setBorderPainted(false);
        numAdd.setBackground(new Color(19,19,19,255));
        numAdd.setFont(new Font("Arial", Font.PLAIN, 20));
        numAdd.setForeground(Color.lightGray);
        
        //Fifth Row Buttons
        JButton sign = new JButton("+/-");
        buttons.Buttons(sign, input, output);
        sign.setBounds(2, 403, 80, 55);
        sign.setFocusPainted(false);
        sign.setBorderPainted(false);
        sign.setBackground(Color.black);
        sign.setFont(new Font("Arial", Font.PLAIN, 20));
        sign.setForeground(Color.lightGray);
        
        JButton numZero = new JButton("0");
        buttons.Buttons(numZero, input, output);
        numZero.setBounds(85, 403, 80, 55);
        numZero.setFocusPainted(false);
        numZero.setBorderPainted(false);
        numZero.setBackground(Color.black);
        numZero.setForeground(Color.white);
        
        JButton decimal = new JButton(".");
        buttons.Buttons(decimal, input, output);
        decimal.setBounds(168, 403, 80, 55);
        decimal.setFocusPainted(false);
        decimal.setBorderPainted(false);
        decimal.setBackground(Color.black);
        decimal.setFont(new Font("Arial", Font.PLAIN, 20));
        decimal.setForeground(Color.lightGray);
        
        JButton equals = new JButton("=");
        buttons.Buttons(equals, input, output);
        equals.setBounds(251, 403, 80, 55);
        equals.setFocusPainted(false);
        equals.setBorderPainted(false);
        equals.setBackground(new Color(44,44,44,255));
        equals.setFont(new Font("Arial", Font.PLAIN, 30));
        equals.setForeground(Color.lightGray);
        
        Font font = new Font(num7.getFont().getName(), num7.getFont().getStyle(), 20);
   
        num7.setFont(font);
        num8.setFont(font);
        num9.setFont(font);
        num4.setFont(font);
        num5.setFont(font);
        num6.setFont(font);
        numSubtract.setFont(font);
        num1.setFont(font);
        num2.setFont(font);
        num3.setFont(font);
        numAdd.setFont(font);
        numZero.setFont(font);
        equals.setFont(font);
        
        /*Font font = new Font(operators.getFont().getName(), operators.getFont().getStyle(), 35);
        operators.setFont(font);
        result.setFont(font);*/

      
        //Add to JFrame
        
        frame.add(input);
        frame.add(output);
        frame.add(num7);
        frame.add(num8);
        frame.add(num9);
        frame.add(num4);
        frame.add(num8);
        frame.add(num5);
        frame.add(num6);
        frame.add(num1);
        frame.add(num2);
        frame.add(num3);
        frame.add(numDivision);
        frame.add(numMultiplication);
        frame.add(numAdd);
        frame.add(numSubtract);
        frame.add(equals);
        frame.add(converter);
        frame.add(clearAll);
        frame.add(erase);
        frame.add(sign);
        frame.add(numZero);
        frame.add(decimal);
        frame.setSize(350, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(31,31,31,255));
        frame.setBackground(Color.yellow);
        
    }

}
