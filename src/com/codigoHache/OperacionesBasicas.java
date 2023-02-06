package com.codigoHache;

import javax.swing.*;

public class OperacionesBasicas {
    //creamos las variables que vamos a usar

    double number1;
    double number2;
    double resultado;


    //Creamos los constructores de la clase OperacionesBasicas
    public OperacionesBasicas(){
        number1 = 0;
        number2 = 0;
        resultado = 0;

    }

    //Creamos las operaciones que vamos a utilizar (suma, resta, division, multiplicacion)

    public void suma(){
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo"));
        resultado = number1 + number2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
    public void resta(){
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo"));
        resultado = number1 - number2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }

    public void division(){
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo"));
        resultado = number1 / number2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }

    public void multiplicacion(){
        number1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        number2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo"));
        resultado = number1 * number2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }



}
